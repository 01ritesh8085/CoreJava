package in.co.concurrencythread;

public class TestRunnable {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new HelloRunnnable("Ram"));
		Thread t2 = new Thread(new HelloRunnnable("Shyam"));
		
		t1.start();
		t2.start();
		
		for(int i = 0;i<500;i++) {
			System.out.println("Main");
		}
		
	}

}
