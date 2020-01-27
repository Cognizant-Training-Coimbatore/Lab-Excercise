package demo;


public class program30_exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10,b=5,c=5;
			int result;
			result=a/(b-c);
		}
		catch(Exception e) {
			System.out.println("Erron in the code"+e);	
			}
		System.out.println("Out of the block");
		
	}

}
