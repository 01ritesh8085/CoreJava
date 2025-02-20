package in.co.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEX {
public static void main(String[] args) throws IOException {
	

	FileWriter out = new FileWriter("C:\\Users\\hp\\OneDrive\\Desktop\\Read.txt");
	
    PrintWriter pw = new PrintWriter(out);
    for(int i = 0; i<5; i++) {
    	pw.println(i+"Line");
    	
    }
	pw.close();
	out.close();
	System.out.println("Done");
	
}
}
