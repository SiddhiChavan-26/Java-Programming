import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two double numebrs: ");
		
		if(sc.hasNextDouble()) {
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			
			double avg = (num1 + num2)/2;
			System.out.println("Average : " + avg);
		}else {
			System.out.println("numbers are not double");
		}
	}

}
