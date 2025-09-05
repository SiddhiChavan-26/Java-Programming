package college.dkte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

class Box1<T>{
	private T obj;
	
	public T getObj() {
		return obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
}
public class Demo6 {

	public static void main(String[] args) {
		Box1<Integer> b1 = new Box1<Integer>();
		b1.setObj(new Integer(11));
		Integer r1 = (Integer)b1.getObj();
		System.out.println("Integer r1: "+ r1);
		
		Box1<Date> b2 = new Box1<Date>();
		b2.setObj(new Date());
		Date d1 = (Date)b2.getObj();
		System.out.println("Date d1: "+ d1);
		
		Box1<Double> b3 = new Box1<Double>();
		b3.setObj(new Double(3.1));
		Double d2 = (Double)b3.getObj();
		System.out.println("Double d2 : "+ d2);
		
		Box1<Integer> b4 = new Box1<Integer>();
		//b4.setObj("123"); //type checking at compile time
		b4.setObj(new Integer(111));
		Integer i2 = (Integer)b4.getObj();
		System.out.println("Integer i2: "+ i2);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		for(Integer i: list) {
			System.out.println(i);
		}
	}

}
