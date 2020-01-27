package demo;

public class array_index_out_of_bounds_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			int a[]=new int[2];
			System.out.println("acces element 3:"+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("error"+e);
		}
		System.out.println("Out of the block");
		
	}

}
