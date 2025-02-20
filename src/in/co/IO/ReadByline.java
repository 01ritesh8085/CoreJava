package in.co.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadByline {
public static void main(String[] args) throws Exception {
	FileReader file=new FileReader("C:\\Users\\hp\\OneDrive\\Desktop\\Read.txt");
	BufferedReader in = new BufferedReader(file);
	 String line = in.readLine();
	 while(line!=null) {
		 System.out.println(line);
	 line = in.readLine();
	 
	 }
	 
	 
	
	
}
}
