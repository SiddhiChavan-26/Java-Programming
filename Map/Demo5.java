package college.dkte;
import java.util.*;
import java.util.Map.Entry;

public class Demo5 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		//Map<Integer,String> map = new LinkedHashMap<Integer, String>( );
		//Map<Integer,String> map = new TreeMap<Integer, String>( );
		
		map.put(415110, "Karad - Satara"); // returns -- null
		map.put(411052, "Hinjawadi - Pune"); // returns -- null
		map.put(411046, "Katraj - Pune"); // returns -- null
		map.put(400027, "Byculla - Mumbai"); // returns -- null
		map.put(411002, "Bajirao Rd - Pune"); // returns -- null
		map.put(411037, "Marketyard - Pune"); // returns -- null
		map.put(411007, "Aundh - Pune"); // returns -- null
		map.put(411052, "HINJEWADI - Pune"); // when key is duplicate, value is overwritten
		
		System.out.println("Size of map: "+ map.size());
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the pin: ");
//		int pin = sc.nextInt();
		
		//String area = map.get(pin);
//		String area = map.getOrDefault(pin, "Not avail"); 
//		System.out.println("Area : "+area);	
		
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			System.out.println(key);
		}
		
		Collection<String> values = map.values();
		for(String s : values)
			System.out.println(s);
		
		Set<Entry<Integer , String>> keyVals = map.entrySet();
		for (Entry<Integer, String> en : keyVals) {
			System.out.println(en.getKey() + "---" + en.getValue());
		}
		

	}

}
