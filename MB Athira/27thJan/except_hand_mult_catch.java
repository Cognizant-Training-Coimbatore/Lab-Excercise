
public class except_hand_mult_catch {

	public static void main(String[] args) 
	{
		try 
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithemetic exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bounds exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("Parent exception occurs");
		}
	}

}
