//bounded generic type parameter
package college.dkte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Box<T extends Number>{
	private T obj;
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	public T getObj() {
		return obj;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>();
		b1.setObj(11);
		Integer r1 = (Integer)b1.getObj();
		System.out.println(r1);
		
		Box<Double> b2 = new Box<Double>();
		b2.setObj(3.1);
		Double r2 = (Double)b2.getObj();
		System.out.println(r2);
		
		Box<Integer> b3 = new Box<Integer>();
		// b3.setObj("123"); //not ok type checking
		Integer r3 = (Integer)b3.getObj();
		
		
		//Box<String> b5 = new Box<String>(); //not ok
		//Box<Date> b4 = new Box<Date>(); not ok date is not sub class of number
		//Box<Boolean> b5 = new Box<Boolean>(); not ok date is not sub class of number
		//Box<Object> b6 = new Box<Object>(); not ok date is super class of number
		
	}

}
