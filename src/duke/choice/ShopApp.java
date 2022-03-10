package duke.choice;

public class ShopApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Duke Choice Shop!");
		Customer c1 = new Customer ();
		c1.setName("Pinky");
		c1.setSize("S");
		System.out.println("Nombre del objeto: " + c1.name);
		
		int measurement = 3;
		
		Clothing item1 = new Clothing(), item2 = new Clothing(), item3 = new Clothing(), item4 = new Clothing();
		Clothing[] items = {item1, item2, item3, item4};
		
		
		//final double tax = 0.2;
		double total = 0.0;
		item1.setDescription("Blue Jacket");
		item1.setPrice(20.9);
		
		item2.setDescription("Orange T-shirt");
		item2.setPrice(10.5);
		item2.setSize("S");
		
		item3.setDescription("Green Scarf");
		item3.setPrice(5);
		item3.setSize("S");
		
		item4.setDescription("Blue T-Shirt");
		item4.setPrice(10.5);
		item4.setSize("S");
		
		/*System.out.println("Item 1: " + item1.description + " price: " + item1.price + " size: " + item1.size + ", item2: " + item2.description + " price: " + item2.price + " size: " + item2.size);
		total = (item1.price + item2.price*2)*(1 + tax);
		System.out.println("Total a pagar: " + total);*/
		
		switch (measurement) {
			case 1: case 2: case 3:
				c1.setSize("S");
			break;

			case 4: case 5: case 6:
				c1.setSize("M");
			break;
			
			case 7: case 8: case 9:
				c1.setSize("L");
			break;
			
			default: c1.setSize("X");
		}
		
		for(Clothing item: items) {
			if(total < 15) {
			if(item.getSize().equals(c1.getSize())) {
			total += item.getPrice();
			System.out.println("Item: " + item.getDescription() + ", price: " + item.getPrice() + ", size: " + item.getSize());
			}
			}
			else break;
		}
		System.out.println("Total a pagar: " + total);
	}

}
