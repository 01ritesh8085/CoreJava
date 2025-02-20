package in.co.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObj {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Read.ser");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		
		 MarkSheetSerialization m = new  MarkSheetSerialization();
	   
		 m.name="ram";
		 m.chemistry = 99;
		 m.physics = 98;
		 m.maths = 89;
		
		
		
		 out.writeObject(m);
		 out.close();
		 file.close();
		
		
		
	}
	
	
	
}
