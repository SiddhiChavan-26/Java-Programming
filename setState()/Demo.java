//getState() method
package college;

public class Demo4 {
	
	public static void delay(int ms) {
		try {
			Thread.sleep(ms);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {

		class PrintTable extends Thread{
			private int num; 
			
			public PrintTable(int num) {
				this.num = num;
			}
			@Override
			public void run() {
				for(int i = 1 ; i<=10 ; i++) {
					System.out.printf("%d * %d = %d\n",num,i,num*i);
					delay(400); 
				}
			}
		}
		
		PrintTable th1 = new PrintTable(2);
		System.out.println("State: "+ th1.getState());
		th1.start();
		
		
		try {
			th1.join();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("State: "+th1.getState());

	}

}
