package college.dkte.demo1;

public class Program {

	public static void main(String[] args) {
		try {
			Time t1 = new Time();
			t1.setHrs(30);
			t1.setMins(70);
			t1.setSecs(66);
			System.out.println("t1 : "+ t1.toString());
		}
		catch (InvalidTimeException e){
			System.out.println("Invalid Field : "+e.getInvalidField());
			System.out.println("InvalidVale : "+e.getInvalidValue());
			System.out.println("Message : "+e.getMessage());
			
		}
	
	}

}
