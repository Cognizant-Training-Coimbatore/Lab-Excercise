
public class ex_4 {

	public static void main(String[] args) {
		int a[]	=new int[2];
		try 
		{
		System.out.println("access elements three:"+a[3]);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception threown"+e);
		}
		finally 
		{
			a[0]=6;
			
			System.out.println("First element value");
		System.out.println("the finally statement is executed ");
		}	
	}

}
