package in.co.IO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class keyEx {
	public static void main(String[] args)throws Exception  {
		InputStreamReader isReader= new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isReader) ;
		
		PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\hp\\OneDrive\\Desktop\\Read.txt"));
		String line = in.readLine();
		while(!line.equals("quit")) {
			out.println(line);
			line=in.readLine();
		}
		
		out.close();
		in.close();
	}

}
