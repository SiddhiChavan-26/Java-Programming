package college;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter source path: ");
		String srcPath = sc.next();
		
		System.out.print("Enter destination path: ");
		String desPath = sc.next();
		
		int data;
		//D:\java_training\Demo12\src\college
		//D:\java_training\Demo12\src\college\Program1
		try(FileInputStream fin = new FileInputStream(srcPath)){
			try(FileOutputStream fout = new FileOutputStream(desPath)){
				while((data = fin.read()) != 0) {
					fout.write(data);
				}
			}
		}//fin.close()
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
