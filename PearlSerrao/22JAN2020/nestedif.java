package demo;

public class nestedif {
	public static void main(String[] args) {
		int x=-5, y=10;
		if(x>0) {
			if(y>5) {
				System.out.println("x is positive");
				
			}
			else
				System.out.println("x is negative");
			
		}
		else
			System.out.println("invalid");
	}
}
