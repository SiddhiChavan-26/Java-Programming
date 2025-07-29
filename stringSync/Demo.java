package college;

public class Demo6 {
	public static void delay(int ms) {
		try {
			Thread.sleep(ms);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Object obj = new Object(); 
		
		class SunbeamThread extends Thread{
			@Override
			public void run() {
				synchronized (obj) 
				{ // LOCK 
					String str = "Sunbeam ";
					for (int i = 0; i < str.length(); i++) {
						char ch = str.charAt(i);
						System.out.print(ch);
						System.out.flush();
						delay(30);
					}
					obj.notify(); 
				} // UNLOCK
			}

			
		}
		SunbeamThread st = new SunbeamThread(); 
		
		class InfotechThread extends Thread{
			@Override
			public void run() {
				synchronized (obj) 
				{  // LOCK
					
					try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					String str = "Infotech";
					for (int i = 0; i < str.length(); i++) {
						char ch = str.charAt(i);
						System.out.print(ch);
						System.out.flush();
						delay(30);
					}
				} // UNLOCK
			}
		}
		InfotechThread it = new InfotechThread(); 
		
		it.start();
		st.start();
		

	}

}
