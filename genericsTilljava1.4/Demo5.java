package college.dkte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

class Box{
	private Object obj;
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Object getObj() {
		return obj;
	}
}
public class Demo5 {

	public static void main(String[] args) {
		Box b1 = new Box();
		b1.setObj(new Double(3.1));
		Double r1 = (Double)b1.getObj();
		System.out.println("r1: "+ r1);
		
		Box b2 = new Box();
		b2.setObj(new Date());
		Date d1 = (Date)b2.getObj();
		System.out.println("d1: "+ d1);
		
		Box b3 = new Box();
		b3.setObj(new Integer(100));
		Integer i1 = (Integer)b3.getObj();
		System.out.println("i1 : "+ i1);
		
		Box b4 = new Box(); 
		b4.setObj("123");
		String r4 = (String) b4.getObj();
		System.out.println("r4 : "+r4);
		
		Box b5 = new Box();
		b5.setObj("123");
//		Integer i2 = (Integer)b5.getObj();
//		System.out.println("i2: "+ i2);

		List list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add("123");
		for(Object ele: list) {
			Integer e = (Integer )ele;
			System.out.println(ele);
		}
	}

}
