package college;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the srcPath: ");
		String srcPath = sc.next();
		
		File file = new File(srcPath);
		
		if(!file.exists()) {
			System.out.println("File not exist!");
			System.exit(0);
		}
		if(file.isDirectory()) {
			String[] listing = file.list();
			for(String lst : listing) {
				System.out.println(lst);
			}
		}else if(file.isFile()){
			System.out.println("Name: "+ file.getName());
			System.out.println("Parent: "+ file.getParent());
			System.out.println("File permission: ");
			
			if(file.canRead()) 
				System.out.println("Readable");
			if(file.canExecute())
				System.out.println("Executable!");
			if(file.canWrite())
				System.out.println("Writable");
			
			long lastModified = file.lastModified() ;
			System.out.println("Last modified : "+ lastModified);
		}
		else 
			System.out.println("Niether a file nor a directory");
		

	}

}
