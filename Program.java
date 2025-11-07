import java.time.LocalDate;
import java.time.Period;

class Person{
	private String name;
	private LocalDate birthdate;
	private double height;
	private double weight;
	private String address;
	
	public Person(String name, LocalDate birthdate, double height, double weight, String address) {
		this.name = name;
		this.birthdate = birthdate;
		this.height = height;
		this.weight = weight;
		this.address = address;
	}
	
	public int calculateAge() {
		LocalDate today = LocalDate.now();
		return Period.between(birthdate, today).getYears();
	}
	
	public void displayPersonInfo() {
		System.out.println("\nName: "+ name + "\nBirthdate: " + birthdate + "\nHeight: " + height + "\nWeight: "+ weight + "\nAddress: "+address);
	}
}

class Student extends Person{
	private int roll;
	private double[] marks;
	
	public Student(String name, LocalDate birthdate, double weight, double height, String address, int roll, double[] marks) {
		super(name, birthdate, weight, height, address);
		this.roll = roll;
		this.marks = marks;
	}
	
	public double calculateAvg() {
		double sum = 0;
		for(double m : marks) {
			sum += m;
		}
		
		return sum / marks.length;
	}
	
	public void displayStudentInfo() {
		displayPersonInfo();
		System.out.println("Roll no: " + roll);
		System.out.println("Average marks: " + calculateAvg());
	}
}

class Employee extends Person{
	private int empId;
	private double salary;
	
	public Employee(String name, LocalDate birthdate, double height, double weight, String address, int empId, double salary) {
		super(name , birthdate, height, weight, address);
		this.empId = empId;
		this.salary = salary;
	}
	
	public double  calculateTax() {
		if (salary > 50000) {
            return salary * 0.10;
        } else {
            return salary * 0.05;
        }
	}
	
	public void displayEmpInfo() {
		displayPersonInfo();
		System.out.println("Employee id: "+ empId);
		System.out.println("Salary: "+ salary);
		System.out.println("Tax : Rs "+ calculateTax());
	}
}
public class Program {
	public static void main(String args []) {
		double[] marks = {85.5, 90.0, 78.5, 88.0};
	    Student s1 = new Student("Riya Sharma", LocalDate.of(2005, 10, 15), 170.0, 65.0,
	                             "Pune, India", 101, marks);
	    
	    Employee e1 = new Employee("Priya Deshmukh", LocalDate.of(1995, 7, 22), 160.0, 55.0,
	            "Mumbai, India", 2001, 60000.0);
	    
	    System.out.println("----------Student detailes----------");
	    s1.displayStudentInfo();
	    
	    System.out.println("\n----------Employee detailes----------");
	    e1.displayEmpInfo();
	}
	
}
