//static field price

package college.dkte.demo3;

public class Program {
	public static void main(String[] args) {
		Chair c1 = new Chair(30,40);
		Chair c2 = new Chair(70,80);
		
		c1.display();
		c2.display();
		Chair.setPrice(1000);
		System.out.println("Updated price: "+ Chair.getPrice());
		c1.display();
		c2.display();
		
	}
	
}
