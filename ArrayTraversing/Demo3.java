package college.dkte;
import java.util.*;

public class Demo3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		Collections.addAll(list, 11,22,33,44,55,66,77,88);
		
		//for loop
		System.out.println("Traversing using for loop: ");
		for(int i=0; i< list.size(); i++) {
			Integer ele = list.get(i);
			System.out.println(ele);
		}
		
		//for each
		System.out.println();
		System.out.println("Traversing using for each loop: ");
		for(Integer i: list) {
			System.out.println(i);
		}
		
		//Iterator
		System.out.println();
		System.out.println("Traversing using Iterator: ");
		Iterator<Integer> trav = list.iterator();
		while (trav.hasNext()) {
			Integer ele = trav.next();
			System.out.println(ele);
		}
	}

}
