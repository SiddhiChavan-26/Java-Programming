// toString on arrays
package college.dkte.demo9;
import java.util.Arrays; 

public class Program {

	public static void main(String[] args) {
		int[] arr = {33, 2, 1, 14, 13};
		
		for(int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("After sorting: ");
		System.out.println(""+ Arrays.toString(arr));
		Arrays.sort(arr);
		
		for(int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
