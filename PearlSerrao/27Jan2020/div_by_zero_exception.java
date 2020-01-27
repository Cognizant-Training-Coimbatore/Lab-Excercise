package demo;

public class div_by_zero_exception {
	public static void main(String args[]) {
	try 
	{
		int a=5,b=5,c=5;
		int result=a/(b-c);
	}
	catch(Exception e) 
	{
		System.out.println("error"+e);
	}
	System.out.println("Out of the block");
}
}