//generic bounded generic type parameter
package college.dkte;

public class Demo2 {
	public static void printObjectArray(Object[] arr) {
		for(int i =0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	//generic method using type parameter....since 5.0
	public static <T> void printTypedArray(T[] arr) {
		for(int i =0; i< arr.length; i++) {
			T ele = arr[i];
			System.out.println(ele);
		}
	}
	
	//generic method using bounded type parameter....since 5.0
	public static <T extends Number> void printNumberArray(T[] arr) {
		for(int i=0; i<arr.length; i++) {
			T ele = arr[i];
			System.out.println(ele);
		}
	}
	public static void main(String[] args) {
//		Object[] arr = {11,22,33,44,55};
//		printObjectArray(arr);
		
		Integer[] arr2 = {1,2,3,4,5};
		printTypedArray(arr2);
		
		String[] arr3 = {"Siddhi", "Swara", "Riddhi"};
		printTypedArray(arr3);
		
		Integer[] arr5 = {10,20,30,40,50};
		printNumberArray(arr5);
		
		//String[] arr5 = {"Siddhi", "Swara", "Riddhi"};
		// printNumberArray(arr5); NOT OK because String not sub type of Number
		
		Double[] arr4 = {11.33 , 22.33 , 55.55 , 66.66 , 77.77}; 
		//printNumberArray(arr4); // T : Double
		Demo2.<Number>printTypedArray(arr4); // T : Number
		
	}

}
