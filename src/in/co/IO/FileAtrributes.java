package in.co.IO;

import java.io.File;
import java.util.Date;

public class FileAtrributes {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\hp\\OneDrive\\Desktop\\Read.txt");
	    if(f.exists()) {
	    	System.out.println("Name" + f.getName());
	    	System.out.println("Absolute path:" + f.canWrite());
	    	System.out.println("Is readble:" + f.canRead());
	    	System.out.println("Is File" + f.isFile());
	    	System.out.println("Is Directory" + f.isDirectory());
	    	System.out.println("Last Modified at" + new Date(f.lastModified()));
	    	System.out.println("Size"+ f.length() + "byte long.");
	    }
	
	
	}
	
}	
