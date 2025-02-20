package in.co.concurrencythread;

public class HelloWithThread extends Thread {
	
	String name = null;
	public HelloWithThread(String n) {
		
		name=n;
		
	}
    
	public void run() {
		for(int i = 0;i<50;i++) {
			System.out.println(i+name);
		}
	}
	
}
