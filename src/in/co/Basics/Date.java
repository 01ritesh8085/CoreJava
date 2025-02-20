package in.co.Basics;

import java.time.LocalDate;

public class Date {
	
	public static void main(String[] args) {
		int birth=2005;
		LocalDate currentDate=LocalDate.now();
		int Currentyear=currentDate.getYear();
		int age=Currentyear-birth;
		System.out.println("Current age:"+age);
	}

}
