package demo;

public class arithmetic_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[5];
			a[5]=30/0;
			
		}
		catch(ArithmeticException e) {
		System.out.println("Arithmetic Exception ");
	}
	catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("ArrayIndexOutOfBoundsException Exception ");
}
catch(Exception e) {
System.out.println("Parent Exception ");
}
	}
}
