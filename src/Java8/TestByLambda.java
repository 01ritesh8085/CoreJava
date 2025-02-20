package Java8;

public class TestByLambda {

	
	public static void main(String[] args) {
		TestFunctionalInterface h = ()-> {
			System.out.println("Hello Lambda Expression.....!!!");
		
		};
	
      h.Sayhello();
	}
}
