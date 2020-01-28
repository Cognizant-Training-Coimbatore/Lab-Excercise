
public class multipleException {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occurs:"+e);
		}
		catch(Exception e)
		{
			System.out.println("parrent exception occurs");
		}
	}

}
