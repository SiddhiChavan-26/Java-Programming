import java.util.Arraylist;  

public class StudentManagment  
{
    private String name;
    private int age
    private ArrayList<String> courses; 

    public StudentManagment(String name, int age) {   
        this.name = name
        this.age = age;
        courses = new Arraylist<>();  
    }

    public void addCourse(String course) { 
        course.add(course);   // 
    }

    public void displayStudent() {
        System.out.println("Name: " + name + ", Age: " + age)
        System.out.println("Courses: " + course);   
    }

    public static void main(String args) {   
        StudentManagement s = new StudentManagment("Alice", 20);  
        s.addCourse("Maths")
        s.addCourse("Physics");
        s.displayStudents();   
    }
}