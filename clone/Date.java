package college.dkte.demo9;
;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
		//TODO
	}
	public Date(int day, int month , int year) {
		this.day = day;
		this.month = month;
		this.year = year;
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
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object temp = super.clone();
		return temp;
	}
	
	@Override
	public String toString() {
		return "Date [Day= "+ day + "Month= "+ month +"Year= "+ year + "]";
	}
}
