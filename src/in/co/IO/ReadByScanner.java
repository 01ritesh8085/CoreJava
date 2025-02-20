package in.co.IO;
import java.io.FileReader;
import java.util.Scanner;

public class ReadByScanner {
    public static void main(String[] args) throws Exception {
		FileReader reader =new FileReader("C:\\Users\\hp\\OneDrive\\Desktop\\Read.txt");
		
		Scanner sc = new Scanner(reader);
		
		while(sc.hasNext());
		System.out.println(sc.nextLine());
		
		reader.close();
	}
	
	
	
	
}
