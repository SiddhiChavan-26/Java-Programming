//association --> taking object of another class as a field of current class

package college.dkte.demo6;

public class Program {

	public static void main(String[] args) {
		Date dt1 = new Date();
		dt1.display();// parameter less called and then parameterized is called
		
		Date dt2 = new Date(26,5,2005);
		dt2.display();
		
		Employee e1 = new Employee(1 , "Siddhi", 100000, dt2);
		//e1.acceptRecord();
		e1.display();

	}

}
