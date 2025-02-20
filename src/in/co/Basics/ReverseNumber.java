package in.co.Basics;

public class ReverseNumber {
public static void main(String[] args) {
	int n = 9876544;
	while(n>0) {
		int lastdigit = n%10;
		System.out.println(lastdigit+ " ");
		n=n/10;
	}
}
}
