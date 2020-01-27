package demo;

public class Program3_null_pointer_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null; // try entering Pearl to avoid exc
		try
        { 
                if (s.equals("Pearl")) 
                		System.out.print("String is Equal to Pearl "); 
                else 
                	System.out.print("String is not Equal to Pearl "); 
        } 
        catch(NullPointerException e) 
        { 
            System.out.print("NullPointerException is encountered"); 
        } 
	}

}
