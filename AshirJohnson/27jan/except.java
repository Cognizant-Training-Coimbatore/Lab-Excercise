package helloworld;

public class except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=10,b=5,c=5;
			int result;
			result=a/(b-c);
		}
		catch(Exception e)
		{
			System.out.println("Error in the code "+e);
		}
		System.out.println("Out of the block");
	}

}
