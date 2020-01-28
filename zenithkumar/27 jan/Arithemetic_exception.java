
public class Arithemetic_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithemeticException e)
		{
			System.out.println("Arithemetic Exception occurs");
		}
		catch(ArrayindexOutOfBoundsException e)
		{
			System.out.println("ArrayindexOutOfBounds Exception occures");
		}
		catch(Exception e)
		{
			System.out.println("parent Exception occurs");
		}

	}

}
