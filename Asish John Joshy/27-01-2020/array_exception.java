package demo;

public class array_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithematic exception occur");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Arithematic exception occur");
		}
	}

}
