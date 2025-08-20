package college.dkte.demo4;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		Box b1 = new Box(1,1,1);
		System.out.println(b1.hashCode());

		Set <Box> set = new HashSet<Box>();
		
		set.add(new Box(1, 1, 1)); 
		set.add(new Box(1, 1, 1)); 
		set.add(new Box(1, 1, 1)); 
		set.add(new Box(1, 1, 1)); 
		
		System.out.println("size : "+set.size());
	}

}
