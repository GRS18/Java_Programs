package module1;

import java.util.Scanner;

public class GroceryStore {
	private String productName;
	private double productPrice;
	private int quantity;

	Scanner in = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter Product Name.: ");
		productName = in.next();
		System.out.println("Enter Product Price: ");
		productPrice = in.nextDouble();
		System.out.println("Enter Product Quantity: ");
		quantity = in.nextInt();
	}

	public void addItem() {
		System.out.println("Item Added Successfully");
	}

	public void totalItem() {
		System.out.println("total Item " + quantity);
	}

	void Display() {
		System.out.println("Product Name: " + productName);
		System.out.println("Product Price: " + productPrice);
		System.out.println("Product Quantity: " + quantity);
	}

}
