public class p3_string_null {

	public static void main(String[] args)
	{
		try
		{
			String a = null;
			int result;
			result=a.length();
		}
		catch(NullPointerException e)
		{
			System.out.println("Error in the code"+e);
		}
		System.out.println("out of block");
		}

}
