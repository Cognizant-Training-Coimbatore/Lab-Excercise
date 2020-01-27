
public class except_hand_finally {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int a[]= new int[2];
		try
		{
			
			System.out.println("Acess element three:"+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception thrown:"+e);
		}
		finally 
		{
			a[0]=6;
			System.out.println("First elment value: "+a[0]);
			System.out.println("The finally statement is executed");
		}
	}

}
