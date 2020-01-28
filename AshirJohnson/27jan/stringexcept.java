package helloworld;

public class stringexcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			String a=null;
			int result;
			result=a.length();
		}
		catch(NullPointerException e)
		{
			System.out.println("Error in the code "+e);
		}
		System.out.println("Out of the block");
		
	}

}
