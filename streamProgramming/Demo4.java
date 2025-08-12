package college;
import java.util.stream.Stream;

import javax.xml.transform.stream.StreamSource;

public class Demo4 {

	public static void main1(String[] args) {
		Stream.of(1,2,3,4,5,6,7,8,9,10)
		.map(n -> n*n)
		.filter(n -> n%2 != 0)
		.map(n -> "java"+n)
		.forEach(e -> System.out.println(e));
		

	}
	public static void main(String[] args) {
		Stream<Integer> strm1 = Stream.of(1,2,3,4,5,6,7,8,9,10);
		
		Stream <Integer> strm2 = strm1.map(n -> n * n);
		
		Stream<Integer> strm3 = strm2.filter(n -> n%2 != 0);
		
		Stream<String> strm4 = strm3.map(n -> "java"+n);
		
		strm4.forEach(e -> System.out.println(e));
	}
}
