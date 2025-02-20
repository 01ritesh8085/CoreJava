package in.co.concurrencythread;

public class HelloRunnnable implements Runnable{ 

	String name = null;
	
	public HelloRunnnable(String n) {
	  name = n;
	  
	  
	  
	  
	}

	public void run() {
		for(int i = 0;i<50;i++) {
			System.out.println(i+name);
		}
		
	}
	
	
	

	
	
}
