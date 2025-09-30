//OOP and tester class 
import java.util.Scanner;

class Employee{
	private String name;
	private int empid;
	private double salary;
	
	public Employee(){
		//parameter less constructor
	}
	
	//parameterized constructor
	public Employee(String name, int empid, double salary) {
		this.name = name;
		this.empid = empid;
		this.salary =  salary;
	}
	
	//getter or inspector methods 
	public String getName() {
		return name;
	}
	public int getEmpid() {
		return empid;
	}
	public double getSalary() {
		return salary;
	}
	
	//setter or mutator methods
	public void setName(String name) {
		this.name = name;
		
	}
	public void setEmpid(int empid) {
		this.empid =  empid;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

class EmployeeTest{
	Employee emp = new Employee();
	
	public void acceptRecord() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter name: ");
		emp.setName(sc.nextLine());
		System.out.println("Enter Empid: ");
		emp.setEmpid(sc.nextInt());
		System.out.println("Enter Salary: ");
		emp.setSalary(sc.nextDouble());
	}
	
	public void printRecord() {
		System.out.println("Employee name: "+ emp.getName());
		System.out.println("Employee id: "+ emp.getEmpid());
		System.out.println("Employee Salary: "+ emp.getSalary());
	}
}
public class Demo6 {

	public static void main(String[] args) {
		EmployeeTest empTest = new EmployeeTest();
		
		empTest.acceptRecord();
		empTest.printRecord();

	}

}
