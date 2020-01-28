
public class try3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[]=new int[5];
			a[4]=5;
			a[5]=30/0;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(" "+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" "+e);
		}
		catch(Exception e)
		{
			System.out.println(" "+e);
		}
	}

}
