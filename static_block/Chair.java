package college.dkte.demo4;

public class Chair {
	private int height, weight;
	private static int price; // here we can field initialize this field here or we can write a static block
	
	public Chair(int height, int weight) {
		this.height =  height;
		this.weight = weight;
		
	}
	static {
		price = 500;
		System.out.println("Block --> 1");
	}
	static {
		price = 1000;
		System.out.println("Block --> 2");
	}
	
	public static int getPrice() {
		return price;
	}
	public static void setPrice(int price) {
		Chair.price = price;
	}
	
	public void display() {
		//System.out.printf("Height: %d\nWeight: %d\nPrice: %d"+ this.height, this.weight, Chair.price);
		System.out.println("Height: "+this.height);
		System.out.println("weight: "+this.weight);
		System.out.println("Price: "+Chair.price);
	}
}
