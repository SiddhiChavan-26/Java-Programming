//inheritance of person class in student class
package college.dkte.demo7;

public class Program {

	public static void main(String[] args) {
		Person p1 = new Person("Siddhi", 20);
		p1.display();
		
		
		Student s1 = new Student("Siddhi", 21, 18, "AIML", 90);
		System.out.println("Student name: "+s1.getName());
		System.out.println("Student age: "+s1.getAge());
		System.out.println("Student roll number: "+s1.getRoll());
		System.out.println("Student course: "+s1.getCourse());
		System.out.println("Student marks: "+s1.getMarks());
		
		System.out.println();
		System.out.println("Student information: ");
		s1.display();
	}

}
