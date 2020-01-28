
public class Prog25_Exception_Multiple_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]= new int[5];
			a[5]=30/0;
		} 
		catch(ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithmetic exception occurs: "+e);
		}
		catch(ArrayIndexOutOfBoundsException e)	{
			// TODO: handle exception
			System.out.println("Array Index out of"+e);
		}
		catch(Exception e) 	{
			// TODO: handle exception
			System.out.println("Parent Exception occurs"+e);
		}
	}

}
