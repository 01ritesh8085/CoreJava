package in.co.Basics;

public class PalindromeNo {
 
	
	 public static void main(String[] args) {
		 int r, sum=0,temp;
		 int n = 454;// It is the number variable to be checked for palindrome
		 temp=n;
		 while(n>0) {
			 r= n % 10;// Getting remainder
			 sum=(sum*10) + r;
			 n = n / 10;
			 
					 
		 }
		 if(temp==sum)
		 System.out.println("Palindrome number");
		 else
			 System.out.println("no Palindrome");
	}
	 
	 
}
