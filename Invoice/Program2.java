package college.dkte;
import java.util.Scanner;

class Invoice{
	private String number;
	private String description;
	private int quantity;
	private double price;
	
	public Invoice() {
		//TOD
	}
	public Invoice(String number, String description, int quantity, double price) {
		this.number = number;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	//getters
	public String getNumber() {
		return number;
	}
	public String getDescription() {
		return description;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	
	//setters
	public void setNumber(String number) {
		this.number = number;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setQuantity(int quantity) {
		if(quantity <= 0) {
			quantity = 0;
		}
		this.quantity = quantity;
	}
	public void setPrice(double price) {
		if (price <= 0) {
			price = 0.0;
		}
		this.price = price;
	}
	
	public double calculateAmount() {
		double amount = this.quantity * this.price;
		return amount;
	}
}

class InvoiceTest{
	Invoice i1 =  new Invoice();
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		i1.setNumber(sc.nextLine());
		System.out.print("Enter description: ");
		i1.setDescription(sc.nextLine());
		System.out.print("Enter quantity: ");
		i1.setQuantity(sc.nextInt());
		System.out.print("Enter Price: ");
		i1.setPrice(sc.nextDouble());
	}
	
	public void printRecord() {
		System.out.println("Number: "+ i1.getNumber());
		System.out.println("Description: "+ i1.getDescription());
		System.out.println("Quantity: "+ i1.getQuantity());
		System.out.println("Price: "+ i1.getPrice());
		System.out.println("Invoice amount: "+i1.calculateAmount());
	}
}

public class Program2 {

	public static void main(String[] args) {
		InvoiceTest it1 =  new InvoiceTest();
		
		it1.acceptRecord();
		it1.printRecord();
		

	}

}
