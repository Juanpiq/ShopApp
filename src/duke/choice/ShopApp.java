package duke.choice;

import java.util.Arrays;
import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ShopApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Duke Choice Shop!");
		
		//c1.setName("Pinky");
		//c1.setSize("S");
		
		
		int measurement = 3;
		//c1.setSize(measurement);
		Customer c1 = new Customer("Pinky", measurement);
		
		System.out.println("Nombre del objeto: " + c1.getName() + ", " + c1.getSize());
		System.out.println("El pago minimo a pagar es: " + Clothing.getMIN_PRICE());
		
		Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
		Clothing item2 = new Clothing("Orange T-shirt", 10.5, "S");
		Clothing item3 = new Clothing("Green Scarf", 5, "S");
		Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");
		Clothing[] items = {item1, item2, item3, item4};
		
		try {
			ItemList list = new ItemList(items);
			
			Routing routing = Routing.builder().get("/items", list).build();
			
			ServerConfiguration config = ServerConfiguration.builder().bindAddress(InetAddress.getLocalHost()).port(8888).build();
			
			WebServer ws = WebServer.create(config, routing);
			
			ws.start();
			
		}catch(UnknownHostException ex) {
			ex.printStackTrace();
		}
		
		
		
		//final double tax = 0.2;
		double total = 0.0;
		/*item1.setDescription("Blue Jacket");
		item1.setPrice(20.9);
		
		item2.setDescription("Orange T-shirt");
		item2.setPrice(10.5);
		item2.setSize("S");
		
		item3.setDescription("Green Scarf");
		item3.setPrice(5);
		item3.setSize("S");
		
		item4.setDescription("Blue T-Shirt");
		item4.setPrice(10.5);
		item4.setSize("S");*/
		
		c1.setItems(items);
		
		/*System.out.println("Item 1: " + item1.description + " price: " + item1.price + " size: " + item1.size + ", item2: " + item2.description + " price: " + item2.price + " size: " + item2.size);
		total = (item1.price + item2.price*2)*(1 + tax);
		System.out.println("Total a pagar: " + total);
		
		for(Clothing item: items) {
			if(item.getSize().equals(c1.getSize())) {
			total += item.getPrice();
			System.out.println("Item: " + item.getDescription() + ", price: " + item.getPrice() + ", size: " + item.getSize());
			if(total < 15) break;
			}
			 
		}*/
		
		Arrays.sort(c1.getItems());
		
		for(Clothing item: items) {
			System.out.println(item);
			//System.out.println("Item: " + item.getDescription() + ", price: " + item.getPrice() + ", size: " + item.getSize());
		}
		
		total = c1.getTotalClothingCost(total);
		System.out.println("Total a pagar: " + total);
		
		int count = 0;
		int average = 0;
		
		for(Clothing item: c1.getItems()) {
			if(item.getSize().equals("L")) {
				count++;
				average += item.getPrice();
			}
		}
		try {
			average = (count == 0) ? 0 : average / count;
			System.out.println("Average price " + average + ", count " + count);
		} catch(ArithmeticException e) {
			System.out.println("No se puede dividir entre 0");
		}
		
	}

}
