package in.co.Basics;

public class Divisbilityby7 {
	public static void main(String[] args) {
		
		int Sum = 0;
		int count= 0;
		for(int i = 101;i<200;i++ ){
			if(i%7==0)
				
				{
				Sum +=i;
			count++;
		}
	}
	
	System.out.println("The Sum of the number between 100 to 200 which are divisible by 7 is: "+Sum);
	 System.out.println("Total numbers between 100 to 200 which are divisible by 7 is: "+count);

		
		
		
	}

}

