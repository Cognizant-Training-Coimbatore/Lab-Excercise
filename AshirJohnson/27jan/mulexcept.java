package helloworld;

public class mulexcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] a=new int[5];
			
			a[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("out of bounds"+e);
		}
		catch(Exception e)
		{
			System.out.println("parent");
		}
	}

}
