package college.dkte.demo7;

public class Student extends Person{
	private int roll;
	private String course;
	private int marks;
	
	public Student() {
		System.out.println("public Student()");
	}
	public Student(String name, int age, int roll, String course, int marks){
		super(name, age);
		System.out.println("public Student(int roll, String name, int marks)");
		this.roll = roll;
		this.course = course;
		this.marks = marks;
	}
	//getters
	public int getRoll() {
		return roll;
	}
	public String getCourse() {
		return course;
	}
	public int getMarks() {
		return marks;
	}
	//setters
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setCourse(String course) {
		this.course= course;
	}
	public void setMarks(int marks) {
		this.marks =  marks;
	}
	
	public void display() {
		super.display();
		System.out.println("Roll : "+ this.roll);
		System.out.println("Course: "+ this.course);
		System.out.println("Marks:"+ this.marks);
		
	}
}
