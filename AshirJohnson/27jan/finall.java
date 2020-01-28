package helloworld;

public class finall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[2];
		try
		{
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception thrown :"+e);
		}
		finally
		{
			a[0]=6;
			System.out.println("first element value:"+a[0]);
			System.out.println("The finally statement is executed");
		}
	}

}
