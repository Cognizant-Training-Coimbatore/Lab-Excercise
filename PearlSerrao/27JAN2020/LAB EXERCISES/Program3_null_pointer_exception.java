package demo;

public class Program3_null_pointer_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		int count=0;
		
		try
		{
		for(int i = 0; i < s.length(); i++)
		{    
		        if(s.charAt(i) != ' ')    
		            count++;  
		}
		System.out.println("The total number of characters: " + count);
		}
		catch(NullPointerException e)
		{
		System.out.println("Null string");

		}
		}
	}

}
