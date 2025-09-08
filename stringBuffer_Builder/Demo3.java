package college.dkte;

public class Demo3 {

	/*public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Siddhi");
		sb.append('F');
		sb.append(20);
		sb.append(40);
		
		String str = sb.toString();
		System.out.println(str);

	}*/

	
	/*public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.printf("Capacity: %d Length: %d\n", sb.capacity(), sb.length());
		sb.append("0123456789");
		System.out.printf("Capacity: %d Length: %d\n", sb.capacity(), sb.length());
		sb.append("abcdef");
		System.out.printf("Capacity: %d Length: %d\n", sb.capacity(), sb.length());
		sb.append("ghijkl");
		System.out.printf("Capacity: %d Length: %d\n", sb.capacity(), sb.length());
		
	}*/
	
	/*public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Sunbeam");
		sb1.reverse();
		String str = sb1.toString();
		System.out.println(str);
	}*/
	
	public static void main(String[] args) {
		String s1 = "Sunbeam";
		String s2  = "Sunbeam";
		System.out.println("Equals: "+ s1.equals(s2));
		
		String s3 = "Sunbeam";
		StringBuffer sb = new StringBuffer("Sunbeam");
		System.out.println("Equals: "+ s3.equals(sb.toString()));
		
	}
	
}
