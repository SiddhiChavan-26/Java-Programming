package college.dkte;

public class Demo2 {

//	public static void main(String[] args) {
//		String str = "Sunbeam";
//		System.out.println("Length: "+ str.length());
//		for(int i=0; i<str.length(); i++) {
//			char ch = str.charAt(i);
//			System.out.print(ch);
//		}
//	}
	
//	public static void main(String[] args) {
//		String str = new String ("Infotech");
//		System.out.println("Length: "+ str.length());
//		for(int i=0; i<str.length(); i++) {
//			char ch = str.charAt(i);
//			System.out.print(ch);
//		}
//	}
	
//	public static void main(String[] args) {
//		String str = "Sunbeam Infotech";
//		char ch = 'e';
//		int idx = str.indexOf(ch);
//		System.out.println("char "+ ch + " is present at index "+ idx);
//		
//		ch = 't';
//		idx = str.indexOf(ch);
//		System.out.println("char "+ ch + " is present at index" + idx);
//		
//		ch = 'e';
//		idx = str.lastIndexOf(ch);
//		System.out.println("Char "+ ch +" has last occurrence at index "+ idx);
//		
//		ch = 'n';
//		idx = str.lastIndexOf(ch);
//		System.out.println("char "+ ch+ " has last occurrence at index "+ idx);
//	}
	
//	public static void main(String[] args) {
//		//toUppercase(), toLowercase()
//		String s1 = "Sunbeam";
//		String s2 = s1.toUpperCase();
//		System.out.println(s1);
//		System.out.println(s2);
//		String s3 = s1.toLowerCase();
//		System.out.println(s3);
//
//	}
	
	
//	public static void main(String[] args) {
//		String s1 = "DKTE";
//		String s2 = "College";
//		String str = s1.concat(s2);
//		System.out.println(str);
//	}
	
//	public static void main(String[] args) {
//		//substring
//		String str = "DKTE college";
//		String s1 = str.substring(8);
//		System.out.println(s1);
//		
//		String s2 = str.substring(0,4);
//		System.out.println(s2);
//	}

//	public static void main(String[] args) {
//		//split
//		String str = "this is just an example";
//		String[] s = str.split(" ");
//		for(String part : s) {
//			System.out.println(part);
//		}
//	}
	
//	public static void main(String[] args) {
//		//trim -- leading and trailing spaces 
//		String str = "      DKTE college      ";
//		System.out.println("Length: "+ str.length());
//		String s = str.trim();
//		System.out.println("Length after trim(): "+ s.length());
//	}
	
	public static void main(String[] args) {
		//format
		String str = "Sunbeam karad";
		int year = 1998;
		String s1 = String.format("%s was founded in %d", str, year);
		System.out.println(s1);
	}
}
