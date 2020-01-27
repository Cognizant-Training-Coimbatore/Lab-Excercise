import java.util.*;
public class ans_31 {

	public static void main(String[] args) {
	String s=null;
	;int count=0;
	//Scanner sc=new Scanner(System.in);
	
	try
	{
		for(int i = 0; i < s.length(); i++) 
		{    
        if(s.charAt(i) != ' ')    
            count++;   
		}
		System.out.println("Total number of characters in a string: " + count); 
	}
	catch(NullPointerException e)
	{
		System.out.println("the number of charecters are null");
	
	}
}
}