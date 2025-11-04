
// Employee class
class Employee {
   
    private String firstName;
    private String lastName;
    private double monthlySalary;

    
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary); 
    }

    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0; 
        }
    }

    
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    
    public void giveRaise(double percent) {
        monthlySalary += monthlySalary * percent / 100;
    }
    
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + firstName + " " + lastName);
        System.out.println("Monthly Salary: Rs " + monthlySalary);
        System.out.println("Yearly Salary: Rs " + getYearlySalary());
    }
}


public class EmployeeTest {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Riya", "Sharma", 25000);
        Employee emp2 = new Employee("Priya", "Deshmukh", 30000);

        
        System.out.println("Yearly salary of " + emp1.getFirstName() + " " + emp1.getLastName() + ": Rs " + emp1.getYearlySalary());
        System.out.println("Yearly salary of " + emp2.getFirstName() + " " + emp2.getLastName() + ": Rs " + emp2.getYearlySalary());

        
        emp1.giveRaise(10);
        emp2.giveRaise(10);

        
        System.out.println("\nAfter 10% raise:");
        System.out.println("Yearly salary of " + emp1.getFirstName() + " " + emp1.getLastName() + ": Rs " + emp1.getYearlySalary());
        System.out.println("Yearly salary of " + emp2.getFirstName() + " " + emp2.getLastName() + ": Rs " + emp2.getYearlySalary());
    }
}
