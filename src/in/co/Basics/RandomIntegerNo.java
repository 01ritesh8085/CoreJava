package in.co.Basics;

import java.util.Random;

public class RandomIntegerNo {

	public static void main(String[] args) {
		
		
		Random random= new Random();
		for(int i =0;i<5;i++)
		{
		int randomNumber = random.nextInt(100)+1;
		System.out.println("RandomIntger"+(i+1)+":"+randomNumber);
		
		}
		}
	
	
	
}
