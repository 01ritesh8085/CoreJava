package in.co.IO;

import java.io.Serializable;

public class TransientAttributesEx {

	public class Marksheet implements Serializable{
	
	public String name = null;
	public int maths = 0;
	public int physics = 0;
	public int chemistry = 0;
	public transient int total=0 ;
	private transient double percentage = 0;
	
	
}
//	Transient varialble will be dicarded during serilaization
	
}
