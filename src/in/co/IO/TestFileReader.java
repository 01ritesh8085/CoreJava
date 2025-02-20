package in.co.IO;

import java.io.FileReader;

public class TestFileReader {
	public static void main(String[] args)throws Exception {
	
		
	

	FileReader in = new FileReader("C:\\Users\\hp\\OneDrive\\Desktop\\Read.txt");
	int ch =in.read();
	while(ch!=-1){ //-1 is end of file
		
	System.out.print((char)ch);
	ch=in.read();
	
	}
   in.close();
}
}