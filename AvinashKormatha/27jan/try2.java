
public class try2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
			int a[]=new int[2];
			System.out.println("access element 3"+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
			System.out.println("exception thrown"+e);
		}
	}

}
