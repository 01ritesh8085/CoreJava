package in.co.Basics;

public class NoFormateException {
	
	public static void main(String[] args) {
		  try {
	            int a = Integer.parseInt("1a");
	            System.out.println(a);
	        } catch (NumberFormatException e) {
	            System.out.println("NumberFormat Exception: invalid input string");
	        }
	        System.out.println("Continuing execution");
			
		}
	}


