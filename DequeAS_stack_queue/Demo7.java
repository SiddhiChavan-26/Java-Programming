package college.dkte;
import java.util.ArrayDeque;
import java.util.Deque;

public class Demo7 {

//	public static void main(String[] args) {
		//Deque as stack
//		Deque<Integer> q = new ArrayDeque<Integer>();
//		q.offerFirst(10);
//		q.offerFirst(20);
//		q.offerFirst(30);
//		q.offerFirst(40);
//		q.offerFirst(50);
//		
//		while(!q.isEmpty()) {
//			Integer ele = q.pollFirst();
//			System.out.println(ele);
//		}
//
//	}

	public static void main(String[] args) {
		//Deque as queue
		Deque<Integer> q = new ArrayDeque<Integer>();
		q.offerFirst(1);
		q.offerFirst(2);
		q.offerFirst(3);
		q.offerFirst(4);
		q.offerFirst(5);
		
		while(!q.isEmpty()) {
			Integer ele = q.pollLast();
			System.out.println(ele);
		}
	}
}
