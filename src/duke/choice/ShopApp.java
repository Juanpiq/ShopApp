package duke.choice;

public class ShopApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Duke Choice Shop!");
		Customer c1 = new Customer ();
		c1.name = "Pinky";
		c1.size = "S";
		System.out.println("Nombre del objeto: " + c1.name);
		
		int measurement = 3;
		
		Clothing item1 = new Clothing(), item2 = new Clothing();
		Clothing[] items = {item1, item2};
		
		
		final double tax = 0.2;
		double total;
		item1.description = "Blue Jacket";
		item1.price = 20.9;
		
		item2.description = "Orange T-shirt";
		item2.price = 10.5;
		item2.size = "S";
		
		System.out.println("Item 1: " + item1.description + " price: " + item1.price + " size: " + item1.size + ", item2: " + item2.description + " price: " + item2.price + " size: " + item2.size);
		total = (item1.price + item2.price*2)*(1 + tax);
		System.out.println("Total a pagar: " + total);
		
		switch (measurement) {
			case 1: case 2: case 3:
				c1.size = "S";
			break;

			case 4: case 5: case 6:
				c1.size = "M";
			break;
			
			case 7: case 8: case 9:
				c1.size = "L";
			break;
			
			default: c1.size = "X";
		}
	}

}
