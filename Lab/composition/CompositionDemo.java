package composition;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Book {

	public String title;
	public String author;

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
}

class Library {
	// eg - private final double PI=3.142
	private final List<Book> books;
	// 			  datatype 	  var

	public Library(List<Book> books) {
		super();
		this.books = books;
	}

	public List<Book> getToatlBooksInLibrary() {
		return books;
	}
}

public class CompositionDemo {

	public static void main(String[] args) {
		// Creating obj of Book class
		Book b1 = new Book("Java", "Kathy");
		Book b2 = new Book("c++", "Bruce");
		Book b3 = new Book("SQL", "Herbert");
		Book b4 = new Book("Python", "Robert");
		Book b5 = new Book("PHP", "Wiiiams");

		// add books into collection
		List<Book> books = new ArrayList<Book>();
	//return type
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);

		// creating library obj with books collection
		Library library = new Library(books);

		List<Book> bks = library.getToatlBooksInLibrary();

		for (Book bk : bks) {
			System.out.println("Title " + bk.title + " and Author is " + bk.author);
		}
	}

}
