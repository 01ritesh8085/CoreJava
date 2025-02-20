package in.co.collections;

public class Marksheet  implements Comparable<Marksheet>{
	
		
	public String rollNo;
	public String  name;
	public int marks;
	
	
	public Marksheet (String rollNo,String name, int marks) {
	
	this.rollNo = rollNo;
	this.name = name;
	this.marks=marks;
	
	
	

		}

	

	@Override
	public int compareTo(Marksheet o ) {
		
		return rollNo .compareTo(o.rollNo);
	}
	public String toString() {
		return rollNo+","+name+","+marks;
				
	}

}

		
		
		
		

	
	

