package college.demo3;
import java.util.*;
public class Program {

	public static void main(String[] args) {
		Employee[] arr = new Employee[] {
		        new Employee(4, "B", "Clerk", "Sales", 723.44),
		        new Employee(8, "X", "Manager", "Accounts", 823.23),
		        new Employee(2, "P", "Clerk", "Research", 234.23),
		        new Employee(9, "N", "Manger", "Sales", 252.53),
		        new Employee(5, "D", "Clerk", "Accounts", 923.23),
		        new Employee(1, "Q", "Analyst", "Research", 826.23),
		        new Employee(7, "H", "Clerk", "Research", 845.24),
		        new Employee(6, "A", "Analyst", "Research", 832.23),
		        new Employee(3, "G", "Analyst", "Sales", 952.44)
		};
		
		//Comparator local class
		System.out.println("EmployeeIdComparator  -- local class");
		
		class EmployeeIdComparator implements Comparator<Employee>{
			
			@Override
			public int compare(Employee x, Employee y) {
				int diff =  Integer.compare(x.getId(), y.getId());
				return diff;
			}
		}
		
		System.out.println("ID: ");
		Arrays.sort(arr, new EmployeeIdComparator());
		for(Employee emp : arr) {
			System.out.println(emp);
		}
		
		// Anonymous Inner class
		System.out.println("Employees sort by name ---- Anonymous Inner class");
		
		Comparator<Employee> empNameComparator = new Comparator<Employee>() {
			
			@Override
			public int compare(Employee x, Employee y) {
				int diff = x.getName().compareTo(y.getName());
				return diff;
			}
		};
		
		System.out.println();
		
		Arrays.sort(arr, empNameComparator);
		
		System.out.println("Sort by name: ");
		for(Employee emp : arr) {
			System.out.println(emp);
		}
		
		
		// Anonymous Inner class Anonymous object
		System.out.println();
		System.out.println("Empolyees sort by Job : Anonymous Inner class Anonymous object ");
		
		Arrays.sort(arr, new Comparator<Employee>() {
			
			@Override
			public int compare(Employee x , Employee y) {
				int diff = x.getJob().compareTo(y.getJob());
				return diff;
			}
		});
		System.out.println();
		for(Employee emp : arr) {
			System.out.println(emp);
		}
		
		
		System.out.println();
		System.out.println("Empolyees sort by Job desc ");
		
		Arrays.sort(arr, new Comparator<Employee>() {
			
			@Override
			public int compare(Employee x, Employee y) {
				int diff = -x.getJob().compareTo(y.getJob());
				return diff;
						
			}
		});
		for(Employee emp : arr) {
			System.out.println(emp);
		}
		
		System.out.println();
		System.out.println("Empolyees sort by jobs desc ");
		
		Arrays.sort(arr, (Employee x, Employee y) -> {
			int diff = -x.getJob().compareTo(y.getJob());
			return diff;
		});
		for(Employee emp : arr) {
			System.out.println(emp);
		}
		
		// type inference
		System.out.println();
		System.out.println("Empolyees sort by names desc ");
		
		Arrays.sort(arr, (x , y) -> {
			int diff = -x.getName().compareTo(y.getName());
			return diff;
		});
		for(Employee emp : arr) {
			System.out.println(emp);
		}
		
		System.out.println();
		System.out.println("Empolyees sort by sal Asc");
		
		Arrays.sort(arr, (x , y ) -> {
			return Double.compare(x.getSal(), y.getSal());
		});
		for(Employee emp : arr) {
			System.out.println(emp);
		}
		
		System.out.println();
		System.out.println("Empolyees sort by sal Dsc");
		// lambda is short-hand implementation of the abstract method in the functional interface ------Imp
		Arrays.sort(arr, (x,y) -> -Double.compare(x.getSal(), y.getSal()));
		for(Employee emp : arr) {
			System.out.println(emp);
		}
		
		
	}

}
