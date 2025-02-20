package in.co.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet {
	
	public static void main(String[] args) {
		ArrayList m = new ArrayList();
		m.add(new Marksheet( "A4","Sakhsi  S",90));
		m.add(new Marksheet( "A2","Sindhu   S",89));
		m.add(new Marksheet( "A3","Saina  S",95));
		
		//Collections.sort(m);
		//for (Object o:m) {
			//System.out.println(o);
	
		
	

    // OrderByName cName=new OrderByName();
    //Collections.sort(m,cName);
    //for(Object ob:m) {
    	//System.out.println(ob);
    
    
    OrderByMarksDesc cMarks=new OrderByMarksDesc();
    Collections.sort(m, cMarks);
    for(Object ob:m) {
	System.out.println(ob);
    }
	}
}
    
    

	
    
    
    
