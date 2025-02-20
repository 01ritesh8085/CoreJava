package in.co.Basics;

public class Armstrong2 {

	public static void main(String[] args) {
		
		int number=1634;//change this to the desired number
		int originalNumber,remainder,result=0,n=0;
		originalNumber = number;
		
		for(; originalNumber!= 0 ; originalNumber /=10,++n);
		originalNumber = number;
		for(;originalNumber != 0;originalNumber /=10) {
			remainder= originalNumber % 10;
			result +=Math.pow(remainder, n);
			
			
		}
		
		if(result==number)
			System.out.println(number + " is an Aarmstrong number .");
		
		else
			System.out.println(number + " is an Aarmstrong number .");
		
	}
}

		
		
		
		
	
	
	

