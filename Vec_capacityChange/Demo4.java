package college.dkte;
import java.util.*;

public class Demo4 {

	public static void main1(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.printf("Capacity: %d  Size: %d\n", v.capacity(), v.size());
		for(int i =1; i <= 10; i++) {
			v.add(i);
		}
		System.out.printf("Capacity: %d  Size: %d\n", v.capacity(), v.size());
		v.add(11);
		System.out.printf("Capacity: %d  Size: %d\n", v.capacity(), v.size());
		for(int i = 12; i<= 20; i++ ) {
			v.add(i);
		}
		System.out.printf("Capacity: %d  Size: %d\n", v.capacity(), v.size());
		v.add(21);
		System.out.printf("Capacity: %d  Size: %d\n", v.capacity(), v.size());

	}
	public static void main2(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.printf("Size: %d\n", list.size()); //c: 10, s: 0
		for(int i=1; i<= 10; i++) {
			list.add(i);
		}
		System.out.printf("Size: %d\n", list.size()); //c: 10, s: 10
		list.add(11);
		System.out.printf("Size: %d\n", list.size()); //c: 15, s: 11
		for(int i=12; i<= 15;i++) {
			list.add(i);
		}
		System.out.printf("Size: %d\n", list.size()); //c: 15, s: 15
		list.add(16);
		System.out.printf("Size: %d\n", list.size()); //c: 22, s: 16
		
	}
	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<Integer>();
//		List<Integer> l = Collections.synchronizedList(list));
		
		
	}

}
