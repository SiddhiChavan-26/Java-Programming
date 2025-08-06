package college.demo5;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.SortedMap;

public class Program {
	public static void main1(String[] args) {
		int data;
		
		try(FileReader rd = new FileReader("file1.txt")){
			while((data = rd.read()) != -1) {
				System.out.print((char)data);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main2(String[] args) {
		SortedMap<String, Charset> map = Charset.availableCharsets(); 
		System.out.println("Size : "+map.size());
		map.forEach((K,V) -> System.out.println(K + "---" + V));
	}
	
	public static void main(String[] args) {
		int data;
		try(FileInputStream fin = new FileInputStream("file1.txt")){
			try(InputStreamReader rd = new InputStreamReader(fin)){
				while((data = rd.read()) != -1) {
					System.out.print((char)data);
				}
			}//rd.close()
		}//fin.close()
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
