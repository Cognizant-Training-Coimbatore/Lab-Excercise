
public class multiexzception {
	public static void main(String args[])
	{try
	{int a[]=new int[5];
	a[5]=30/0;
	}
	catch(ArithmeticException e)
	{System.out.println("aritmetic exception occurs");
	}
		catch(ArrayIndexOutOfBoundsException e)
	
	{
			System.out.println("array index out of bounds Exception occurs");
	}
	catch(Exception e)
	{
		System.out.println("parent exception occurs");
	}
	
	}
	

}
