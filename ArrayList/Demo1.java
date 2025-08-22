package college.dkte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
public class Demo1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//add()
		list.add("India");
		list.add("Germany");
		list.add("Japan");
		list.add("USA");
		list.add("Ukrain");
		
		
		//size()
		System.out.println("Size : "+ list.size());
		System.out.println("Ele: "+ list);
		
		int index = 3;
		list.add(index, "Finland");
		System.out.println("Ele: "+ list);
		
		//get()
		String e5 = list.get(index);
		System.out.println("e5: " + e5);
		
		//UpperCase
		e5 = e5.toUpperCase();
		list.set(index, e5);
		System.out.println("Ele: "+ list);
		
		//remove()
		list.remove(index);
		System.out.println("Ele: "+ list);

		//contains---searching
		String find = "USA";
		
		boolean found = list.contains(find);
		if(found)
			System.out.println(find +" found");
		else
			System.out.println(find+ " not found");
		
		
		//indexOf(), lastIndexOf()
		int idx = list.indexOf(find);
		
		if(idx != -1) {
			System.out.println(find+ " found at index "+ idx);
		}else {
			System.out.println(find+ " index not found");
		}
		
		String f1 = "Finland";
		idx = list.lastIndexOf(f1);

		if(idx != -1) {
			System.out.println(f1+ " found at index "+ idx);
		}else {
			System.out.println(f1+ " index not found");
		}
		
		System.out.println("FWD traversing: ");
		Iterator<String> trav = list.iterator();
		while(trav.hasNext()) {
			String ele = trav.next();
			System.out.println(ele +" ");
		}
		
		list.clear();
		System.out.println();
		
		//helper class collections
		Collections.addAll(list, "Siddhi", "Riddhi", "Swara");
		System.out.println("Ele: "+ list);
		
		System.out.println("Sorting elements: ");
		Collections.sort(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		class StringComparator implements Comparator<String>{
			@Override
			public int compare(String x , String y) {
				int diff = y.compareTo(x);
				return diff;
			}
		}
		
		Collections.sort(list, new StringComparator() );
		System.out.println("Descending order: ");
		System.out.println(list);
		
	}

}
