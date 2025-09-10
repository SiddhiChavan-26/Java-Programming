package college.dkte;
final class Time{
	private int hours;
	private int mins;
	private int secs;
	
	public Time() {
		//TODO
	}
	public Time(int hours, int mins, int secs) {
		this.hours = hours;
		this.mins = mins;
		this.secs = secs;
	}
	
	public void display() {
		System.out.println("Hours: "+ this.hours +" Min: "+ this.mins +" Sec: "+ this.secs);
	}
}
public class Demo2 {

	public static void main(String[] args) {
		Time t1 = new Time(10,20,35);
		t1.display();
	}

}
