//comparable compareTo
package college.dkte.demo6;

import java.util.Arrays;

public class Program {
	
	/*public static void main(String[] args) {
		int[] arr = {26,15,12,2005,3};
		System.out.println("Array elements before sorting: ");
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		
		Arrays.sort(arr);
		System.out.println();
		System.out.println("Array elements after sorting: ");
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}*/
	
	/*public static void main(String[] args) {
		Product2[ ] arr = {
				new Product2(3, "Pen", 11.33),
				new Product2(4, "Pencil", 5.10),
				new Product2(1, "Erasor", 6.66),
				new Product2(5, "Sharpner", 7.33),
				new Product2(2, "Book", 20.00)
		}; 
		
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		
		Arrays.sort(arr);
		System.out.println();
		System.out.println("Sorted on name: ");
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		
	}*/
	public static void main(String[] args) {
		Product3[ ] arr = {
				new Product3(3, "Pen", 11.33),
				new Product3(4, "Pencil", 5.10),
				new Product3(1, "Erasor", 6.66),
				new Product3(5, "Sharpner", 7.33),
				new Product3(2, "Book", 20.00)
		}; 
		
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		
		Arrays.sort(arr);
		System.out.println();
		System.out.println("Sorted on price: ");
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		
	}
		
}
