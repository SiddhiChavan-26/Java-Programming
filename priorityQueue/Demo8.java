package college.dkte;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo8 {

	public static void main1(String[] args) {
		Queue<String> p = new PriorityQueue<String>();
		
		p.offer("D");
		p.offer("K");
		p.offer("T");
		p.offer("E");
		
		while(!p.isEmpty()) {
			String str = p.poll(); //removed as per priority (natural ordering - alphabetically)
			System.out.println(str); 
		}
	}
	
	public static void main(String[] args) {
		
		class StringDescComparator implements Comparator<String>{
			
			@Override
			public int compare(String x, String y) {
				int diff =  y.compareTo(x);
				return diff;
						
			}
		}
		
		Queue<String> p = new PriorityQueue<String>(new StringDescComparator());
		p.offer("D");
		p.offer("K");
		p.offer("T");
		p.offer("E");
		
		while(!p.isEmpty()) {
			String s = p.poll();
			System.out.println(s);
		}
		
	}
	

}
