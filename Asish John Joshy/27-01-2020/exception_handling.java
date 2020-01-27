package demo;

public class exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[]=new int[2];
			System.out.println("Access element 3:"+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception thrown:"+e);
		}
		System.out.println("Out of the program");
	}

}
