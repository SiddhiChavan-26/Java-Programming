package college.dkte;
import java.util.*;

public class Demo6 {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		stk.push(50);
		
		while(! stk.isEmpty()) {
			Integer ele = stk.pop();
			System.out.println(ele);  //last in first out
		}
		

	}

}
