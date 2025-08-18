package college.dkte;
import java.util.*;

public class Demo3 {

	public static void main(String[] args) {
		TreeSet <String> set = new TreeSet<String>();
		
		Collections.addAll(set, "A","B", "C", "D", "E", "F", "G","H","I","J");
		System.out.println("Element: "+ set);
		
		System.out.println("First element: "+ set.first());
		System.out.println("Last element: "+ set.last());
		
		System.out.println("HeadSet of E: "+ set.headSet("E")); //elements before E (excludes E)
		System.out.println("TailSet of F: "+ set.tailSet("F")); //elements after F (includes  F)
		
		System.out.println("Higher: "+ set.higher("A"));
		System.out.println("Lower : "+ set.lower("G"));
		
		NavigableSet <String> descSet = set.descendingSet();
		System.out.println("Descending set: ");
		for(String ele : descSet) {
			System.out.println(ele);
		}

		}

}
