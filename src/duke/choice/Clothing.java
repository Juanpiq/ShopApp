package duke.choice;

public class Clothing implements Comparable<Clothing>{
	private String description, size = "M";
	private double price;
	private static final double MIN_PRICE = 10.0;
	private static final double MIN_TAX = 0.2;
	
	public String toString() {
		return "Item: " + getDescription() + ", price: " + getPrice() + ", size: " + getSize();
	}
	
	public static double getMIN_PRICE() {
		return MIN_PRICE;
	}
	
	public Clothing(String description, double price, String size) {
		this.description = description;
		setPrice(price);
		setSize(size);
	}
	
	
	public String getDescription() {
		return description;
	}
	
	/*public void setDescription(String description) {
		this.description = description;
	}*/
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public double getPrice() {
		return price * (1 + MIN_TAX);
	}
	public void setPrice(double price) {
		this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
	}
	
	public int compareTo(Clothing c) {
		return this.description.compareTo(c.description);
	}

}
