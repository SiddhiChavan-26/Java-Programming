package college.dkte.demo3;

public class Chair {
	private int height, weight;
	private static int price = 500;
	
	public Chair() {
		
	}
	
	public Chair(int weight, int height) {
		this.weight =  weight;
		this.height = height;
		
	}
	
	public static int getPrice() {
		return  price;
	}
	public static void setPrice(int price) {
		Chair.price =  price;
	}
	
	public void display() {
		System.out.printf("\nHeight: %d\n Weight: %d\n Price: %d", this.height, this.weight, Chair.price);
	}
}
