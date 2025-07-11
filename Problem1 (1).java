import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		System.out.println("Given number: " + number);

		
		String binary = Integer.toBinaryString(number);
		System.out.println("Binary Equivalent: " + binary);

		String octal = Integer.toOctalString(number);
		System.out.println("Octal Equivalent: " + octal);

		String hexaDecimal = Integer.toHexString(number);
		System.out.println("Hexadecimal Equivalent: " + hexaDecimal);
	}
}

