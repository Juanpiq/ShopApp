package duke.choice;

public class Customer {
	private String name, size;
	private Clothing[] items;

	public Clothing[] getItems() {
		return items;
	}

	public void setItems(Clothing[] items) {
		this.items = items;
	}

	public Customer(String name, int measurement) {
		super();
		this.name = name;
		setSize(measurement);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public void setSize(int measurement) {
		switch (measurement) {
		case 1: case 2: case 3:
			setSize("S");
		break;

		case 4: case 5: case 6:
			setSize("M");
		break;
		
		case 7: case 8: case 9:
			setSize("L");
		break;
		
		default: setSize("XL");
	}
	}
	
	public double getTotalClothingCost(double total) {
		for(Clothing item: items) {
			//if(item.getSize().equals(getSize())) {
			total += item.getPrice();
			//if(total < 15) break;
		}
		return total;
	}
}
