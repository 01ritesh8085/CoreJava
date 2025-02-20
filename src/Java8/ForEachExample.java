package Java8;

import java.util.ArrayList;

public class ForEachExample {
public static void main(String[] args) {
	
	
	
	java.util.List<String> List = new ArrayList<String>();
     List.add("one");
     List.add("Two");
     List.add("Three");
     List.add("Four");
     List.forEach(li ->
     System.out.println(li));
}
}
