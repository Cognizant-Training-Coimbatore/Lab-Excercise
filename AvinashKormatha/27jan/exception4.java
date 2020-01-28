
public class exception4 {
	
	public static void main(String[] arg)
	{
		int a[]= {0,2,4,5};
		try
		{
			
			int c=a[1]/a[0];
			a[4]=6;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println(a[0]+a[1]+a[2]);
		}
	}
}
