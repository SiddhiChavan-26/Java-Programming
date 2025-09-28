package college.dkte.demo6;
import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int year;
	
	//parameter less
	public Date() {
		this(1,1,2000); //called parameterized cons--> constructor chaining
	}
	
	//parameterized
	public Date(int day, int month, int year){
		this.day =  day;
		this.month = month;
		this.year = year;  
		System.out.println("public Date(int day, int month, int year)");
	}
	
	//getters
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	
	//setters
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	//accept record from user
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day: ");
		day = sc.nextInt();
		System.out.print("Enter month: ");
		month = sc.nextInt();
		System.out.print("Enter year: ");
		year = sc.nextInt();
	}
	
	//print record 
	public void display() {
		System.out.println("Day: "+ this.day);
		System.out.println("Month: "+ this.month);
		System.out.println("Year: "+ this.year);
	}
}
