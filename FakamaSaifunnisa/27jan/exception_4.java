package packB;

public class exception_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[3];
		try {
			System.out.println("acces element three: "+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception thrown:"+e);
		}
		finally
		{
			a[0]=6;
			System.out.println("first element is "+a[0]);
			System.out.println("final statement is executed");
		}
	}
}