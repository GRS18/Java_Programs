package module1;

public class GroceryStoreTest {

	public static void main(String[] args) {
		System.out.println("Grocery 1");
		GroceryStore grocerystore = new GroceryStore();

		grocerystore.accept();
		grocerystore.Display();
		grocerystore.addItem();
		grocerystore.totalItem();

		System.out.println("---------------------------------------------------");

		System.out.println("Grocery 2");

		GroceryStore grocerystore1 = new GroceryStore();

		grocerystore1.accept();
		grocerystore1.Display();
		grocerystore1.addItem();
		grocerystore1.totalItem();

	}

}
