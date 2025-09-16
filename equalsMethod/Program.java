package college.dkte.demo8;

public class Program {

	public static void main(String[] args) {
		Date dt1 = new Date(26,5,2005);
		Date dt2 = new Date(26,5,2005);
		
//		boolean flag = (dt1 == dt2);
//		System.out.println("Result: "+ flag); // return false
		
//		boolean flag = dt1.equals(dt2);
//		System.out.println("Result: "+ flag);  //return false because calls object class equals method 
		// if we dont override equals it calls object's equals method
		
		boolean flag = dt1.equals(dt2);
		System.out.println("Result for dt2: "+ flag);
		
		flag = dt1.equals(null);
		System.out.println("Result for null: "+ flag);
		
		flag = dt1.equals(dt1);
		System.out.println("Result for dt1: "+ flag);
		
		flag = dt1.equals("12-03-2023");
		System.out.println("Result for new date: "+ flag);
		
	}

}
