package college.dkte.demo6;
import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private Date joining;
	
	//parameterless
	public Employee() {
		System.out.println("public Employee()");
		this.id = 0;
		this.name = " ";
		this.salary = 0.0;
		Date joining = new Date();
	}
	
	//parameterized
	public Employee(int id, String name, double salary, Date joining) {
		System.out.println("public Employee(int id, String name, double salary, Date joining)");
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joining = joining;
	}
	
	//getters
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public Date getJoining() {
		return joining;
	}
	
	//setters
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setJoining(Date joining) {
		this.joining =  joining;
	}
	
	//accept record 
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter id: ");
		id = sc.nextInt();
		System.out.print("Enter salary: ");
		salary = sc.nextDouble();
		System.out.print("Enter date: " );
		this.joining.accept();
		
	}
	
	public void display() {
		System.out.println("Id: "+ this.id);
		System.out.println("Name: "+ this.name);
		System.out.println("Salary: "+ this.salary);
		System.out.println("Date joining: ");
		this.joining.display();
	}
	
	
}
