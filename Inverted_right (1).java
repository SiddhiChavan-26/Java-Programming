
public class Inverted_right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int count = 5;
		for(int i =1; i <= n; i++) {
			for(int j = 1; j <= count; j++) {
				System.out.print("*");
			}
			count--;
			System.out.println();
		}
	}

}
