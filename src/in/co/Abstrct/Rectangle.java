package in.co.Abstrct;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle() {

	}

	public Rectangle(int length, int width) {

		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*width;
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}


}

	


	




