// array of objects  or array of reference

package college.dkte.demo2;

public class Program {

	public static void main(String[] args) {
		Human[] arr = new Human[4];
		
		arr[0] =  new Human(21,50,152);
		arr[1] =  new Human(22,50,153);
		arr[2] =  new Human(23,50,154);
		arr[3] =  new Human(24,50,155);
		
		for(int i=0; i< arr.length; i++) {
			arr[i].display();
		}

	}

}
