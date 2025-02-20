package in.co.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExampleBinary {
 
	public static void main(String[] args) throws Exception {
		   
		String source="C:\\Users\\hp\\OneDrive\\Desktop\\image1.jpg"; 
	
        String target = "C:\\Users\\hp\\OneDrive\\Desktop\\image2.jpg";
         
       FileInputStream in = new FileInputStream(source);
       FileOutputStream out = new FileOutputStream(target);
       
       int ch= in.read();
       while(ch!=-1) {
    	   out.write(ch);       
    	   ch=in.read();
    	   
       }
        
		in.close();
		out.close();
		System.out.println(source + "is copied to "+ target);
	}
	
	
}
