package in.co.concurrencythread;

public class TestRacingCondThread {
	
	public static void main(String[] args) {
		
		
		RacingCondThread t1= new RacingCondThread("Ram");
		RacingCondThread t2 = new RacingCondThread("Shyam");
		
		
		t1.start();
		t2.start();
	}

}
