package college.dkte;
import java.util.*;

public class Demo5 {
	
	public static void main1(String[] args) {
		//Queue<String> q = new ArrayDeque<String>();
		Queue<String> q = new LinkedList<String>();
		
		q.offer("One");
		q.offer("Two");
		q.offer("three");
		q.offer("Four");
		
		System.out.println("First element: "+ q.poll());
		while(!q.isEmpty()) {
			String ele = q.poll();
			System.out.println(ele);
		}
		System.out.println("Remove element from empty queue: "+ q.poll());
	}
	
	public static void main(String[] args) {
		Queue<String> q = new ArrayDeque<String>();
		q.offer("One");
		q.offer("Two");
		q.offer("three");
		q.offer("Four");
		
		System.out.println("First element: "+ q.poll());
		while(!q.isEmpty()) {
			String ele = q.poll();
			System.out.println(ele);
		}
		System.out.println("Remove element from empty queue: "+ q.remove()); //exception
	}
}
