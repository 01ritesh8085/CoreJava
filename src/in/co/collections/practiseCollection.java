package in.co.collections;

import java.util.ArrayList;
import java.util.Collection;

public class practiseCollection {
	public static void main(String[] args) {
		// creates a collection
				Collection c = new ArrayList();
				// Add element  into collection
				c.add("Bura mat dekho");
				c.add("Bura mat Suno");
				c.add("Bura mat Kaho");
		System.out.println("Length of Collection:" + c.size());
		
		
		// Print all element of Colletion
		for(Object ele:c) {
			System.out.println(ele);
		}
		//convert collection into array 
		Object[] oArray=c.toArray();
		//print all element of araay
		for (Object ele:oArray) {
			String s = (String)ele;
			System.out.println(s);
		
		}
		
		
	}

}
