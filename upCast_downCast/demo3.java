// up-casting and down-casting
 
package college.dkte;

class Person1{
	String name;
	int age;
	
	public Person1() {
		
	}
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;  
	}
	
	public void showRecord() {
		System.out.println("public void showRecord()");
		System.out.println("Name: "+ this.name);
		System.out.println("Age: "+ this.age);
	}
}

class Employee1 extends Person1{
	int empid;
	double salary;
	
	public Employee1() {
		
	}
	public Employee1(String name, int age, int empid, double salary) {
		super(name, age);
		this.empid = empid;
		this.salary = salary;
	}
	
	public void printRecord() {
		System.out.println("public void printRecord()");
		showRecord();
		System.out.println("id : "+ this.empid);
		System.out.println("Salary: "+ this.salary);
	}
}
public class demo3 {
	
	public static void main(String[] args) {
		Employee1 emp = new Employee1("Siddhi", 20, 18, 50000);
		Person1 p = emp; //up-casting
		p.showRecord();
		//p.printRecord(); // NOT OK because not a method of type person1
		emp = (Employee1)p; //down-casting
		emp.showRecord();
		emp.printRecord();
		
	}
	
	public static void main4(String[] args) {
		Employee1 emp = new Employee1("Siddhi", 20, 18, 20000);
		Person1 p = emp; //up-casting
		System.out.println(p.name);
		System.out.println(p.age);
		emp = (Employee1)p; //down-casting
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.empid);
		System.out.println(emp.salary);

	}
	
	public static void main3(String[] args) {
		Employee1 e = new Employee1("Riddhi", 20, 1, 20000);
//		System.out.println(e.name); //OK
//		System.out.println(e.age); // OK
//		System.out.println(e.empid); //OK
//		System.out.println(e.salary); //OK
		
		Person1 p = (Person1)e; // up-casting
		System.out.println(p.name);
		System.out.println(p.age);
		
//		System.out.println(p.empid); // NOT OK
//		System.out.println(p.salary); // NOT OK

	}
	public static void main2(String[] args) {
		Employee1 emp = new Employee1("Siddhi", 20,1,10000);
		System.out.println(emp.empid);
		System.out.println(emp.salary);
		System.out.println(emp.name);
		System.out.println(emp.age);

	}
	public static void main1(String[] args) {
		Person1 p = new Person1("Siddhi", 20);
		
		System.out.println(p.name);
		System.out.println(p.age);

	}

}
