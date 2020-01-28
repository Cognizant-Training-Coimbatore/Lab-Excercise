
public class finallyex {
		public static void main(String args[])
		{int a[]=new int[5];
			try
		{
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
		finally
		{a [0]=6;
		System.out.println("1st element is "+a[0]);
		System.out.println("finally is executed");
		}
		}
		

	}

