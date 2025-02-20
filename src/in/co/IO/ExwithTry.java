package in.co.IO;


import java.io.FileReader;
import java.io.IOException;

public class ExwithTry {
	
	public static void main(String[] args) throws Exception {
		
		try(FileReader in = new FileReader("C:\\Users\\hp\\OneDrive\\Desktop\\Read.txt")){
		int ch = in.read();
		while(ch!=-1){
			System.out.print((char)ch);
		ch=in.read();	
		
		}
		}
			
			
			
			
		}
		
		
		
		
		
		
		
		
	

}
