package college.dkte;
import java.util.Scanner;

class Date{
	private int day;
	private int month;
	private int year;
	
	public Date() {
		//TODO
	}
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year =  year;
	}
	
	//setters
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year =  year;
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
}

//Tester class 
class DateTest{
	Date dt1 =  new Date();
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day: ");
		dt1.setDay(sc.nextInt());
		System.out.print("Enter month: ");
		dt1.setMonth(sc.nextInt());
		System.out.print("Enter year: ");
		dt1.setYear(sc.nextInt());
	}
	
	public void displayDate() {
		System.out.printf("Date: %d/%d/%d",dt1.getDay(), dt1.getMonth(),dt1.getYear());
	}
}
public class Problem1 {

	public static void main(String[] args) {
		DateTest test =  new DateTest();
		
		test.acceptRecord();
		test.displayDate();

	}

}
