package college.dkte.demo6;

public class Product3 implements Comparable<Product3>{
	private int id;
	private String name;
	private double price;
	
	public Product3(){
		//TODO
	}
	public Product3(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(Product3 other) {
		int diff = Double.compare(this.price, other.price);
		return diff;
	}
	
	
}
