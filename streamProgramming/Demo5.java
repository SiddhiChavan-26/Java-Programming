package college;
import java.util.*;
import java.util.stream.Stream;

public class Demo5 {

	public static void main1(String[] args) {
		Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		Stream<Integer> strm = Arrays.stream(arr);
		
		strm
		.forEach(e -> System.out.println(e));

	}
	
	public static void main2(String[] args) {
		List <String> list = new ArrayList<String>();
		list.add("Sunbeam karad");
		list.add("Sunbeam pune");
		list.add("Sunbeam");
		
		Stream <String> strm = list.stream();
		strm
		.map(word -> word.toUpperCase()) //convert Strings in to upperCase
		.forEach(e -> System.out.println(e));
		
	}
	
	public static void main3(String[] args) {
		String[] names = {"Smita", "Rahul", "Rachana", "Amit", "Shraddha", "Nilesh", "Rohan", "Pradnya", "Rohan", "Pooja", "Lalita"};
		Stream <String> strm = Stream.of(names);
		
		strm
		.forEach(e -> System.out.println(e));
		
	}
	
	public static void main4(String[] args) {
		String[] names = {"Smita", "Rahul", "Rachana", "Amit", "Shraddha", "Nilesh", "Rohan", "Pradnya", "Rohan", "Pooja", "Lalita"};
		Stream <String> strm = Stream.of(names);
		
		strm
		.filter(word -> word.endsWith("a")) // filter out the strings ends with "a"
		.forEach(e -> System.out.println(e));
	}
	
	public static void main5(String[] args) {
		String[] names = {"Smita", "Rahul", "Rachana", "Amit", "Shraddha", "Nilesh", "Rohan", "Pradnya", "Rohan", "Pooja", "Lalita"};
		Stream<String> strm = Stream.of(names);
		
		strm
		.sorted((x , y) -> x.compareTo(y)) //compare strings
		.forEach(e -> System.out.println(e));
		
	}
	
	public static void main6(String[] args) {
		String[] names = {"Smita", "Rahul", "Rachana", "Amit", "Shraddha", "Nilesh", "Rohan", "Pradnya", "Rohan", "Pooja", "Lalita"};
		Stream<String> strm = Stream.of(names);
		
		strm
		.skip(2) //skips first two strings
		.limit(4) // limit the  list upto 4
		.forEach(e -> System.out.println(e));
	}

	public static void main7(String[] args) {
		String[] names = {"Smita", "Smita", "Rachana", "Amit", "Shraddha", "Nilesh", "Rohan", "Pradnya", "Rohan", "Pooja", "Lalita"};
		Stream<String> strm = Stream.of(names);
		
		strm
		.distinct() // select only distinct elements
		.forEach(e -> System.out.println(e));
	}
	
	public static void main(String[] args) {
		String[] names = {"Smita", "Smita", "Rachana", "Amit", "Shraddha", "Nilesh", "Rohan", "Pradnya", "Rohan", "Pooja", "Lalita"};
		Stream<String> strm = Stream.of(names);
		
		long cnt = strm
		.count(); 
		
		System.out.println("cnt : "+ cnt);
		
	}

}
