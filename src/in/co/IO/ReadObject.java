package in.co.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ReadObject {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Read.ser");
		ObjectInputStream in = new ObjectInputStream(file);
		
		MarkSheetSerialization m =  (MarkSheetSerialization)in.readObject();
		System.out.println(m.name);
		System.out.println(m.physics);

		System.out.println(m.chemistry);
		System.out.println(m.maths);

		
	}

}
