package in.co.concurrencythread;

public class TestWithThread {

	public static void main(String[] args) {
		
		
		HelloWithThread t1 = new HelloWithThread("Ram");
		HelloWithThread t2 = new HelloWithThread("Shyam"
				+ "");
	
	
	t1.start();
	t2.start();
	
	for(int i = 0;i<50;i++) {
	System.out.println("main");
	
	
	}
	
	}	
	
}
