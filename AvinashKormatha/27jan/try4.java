
public class try4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[2];
		try
		{
			System.out.println("access element 3"+a[2]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(""+e);
		}
		finally
		{
			a[0]=3;
			System.out.println("first element"+a[0]);
			
		}
	}

}
