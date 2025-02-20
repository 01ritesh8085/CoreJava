package Java8;

public class TestByAnnonymous {
public static void main(String[] args) {
	
	
	TestFunctionalInterface h =  new TestFunctionalInterface() {

		@Override
		public void Sayhello() {
	
		System.out.println("Functional Interface");	
		}
		
	};
	
	h.Sayhello();
	
	

}
}


