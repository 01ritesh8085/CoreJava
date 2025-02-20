package in.co.IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	
	public static void main(String[] args) throws IOException {
		FileWriter out = new FileWriter("C:\\Users\\hp\\OneDrive\\Desktop\\Read.txt");
	  
		 out.write('A');
		 out.write('\n');
		 out.write("This is line one");
		 out.write("This is line two");	 
	      out.close();
	      System.out.println("Done");
	}
	
	
	
	
	

}
