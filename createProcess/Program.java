package college.demo6;
import java.io.IOException;

public class Program {
	
	public static void main(String[] args) throws Throwable {
		System.out.println("Start");
		Runtime rt = Runtime.getRuntime(); 
		Process process = rt.exec("notepad"); 
		int status = process.waitFor(); 
		System.out.println("Status : "+status);
		System.out.println("End");
	}
	
}
