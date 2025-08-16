package college.dkte;
import java.util.*;

public class Demo1 {

	public static void main(String[] args) {
		//Set<String> set = new HashSet<String>();
		//Set<String> set = new LinkedHashSet<String>();
		Set<String> set = new TreeSet<String>();
		
		set.add("India"); //true
		set.add("USA"); //true
		set.add("Ukrain"); //true
		set.add("China"); //true
		set.add("Russia"); // true
		set.add("India"); //false
		set.add("Iran"); //true
		set.add("china"); //true because the c is capital in above case and here it is small
		set.add("Iraq"); //true
		
		System.out.println("Size of  set: "+ set.size());
		
		for(String ele : set)
			System.out.println(ele);

	}

}
