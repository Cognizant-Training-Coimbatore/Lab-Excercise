

public class program68_mutiple_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occurs"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
		System.out.println("ArrayIndexOutOfBounds Exception occurs"+e);
		}
		catch(Exception e)
		{
			System.out.println("Parent exception occurs"+e);
		}
	}

}
