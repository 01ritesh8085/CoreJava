package in.co.Basics;

public class SecondLargestWithoutSorting {

	public static void main(String[] args) {
		 
	// Initialize Array
		int a[]= {10,20,44,34,1,44,55,};
		
		 int largest=a[0];
		 int Sec_largest=a[1];
		 
		 //Traverse the Loop
		 for(int i=0;i<a.length;i++)
			 
		 {
			 if(a[i]>largest)
			 {
			Sec_largest=largest;
			largest=a[i];
			 }
				 
				 
			 else if(a[i]>Sec_largest&& a[i]!=largest)
			 {
				 Sec_largest=a[i];
			 }
		 }
		 //print the value of sec_largest
		 System.out.println("Witout sorting sec largest is :"+ Sec_largest);
	System.out.println("largest is :+largest");		 
	}
			 
		 
		
		
		
		
	}
	
	
	
	
	

