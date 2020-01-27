package demo;

public class exception_multipleblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   int a[]=new int[5];
    	   a[5]=30/0;
       }
       catch(ArithmeticException e)
       {
    	   System.out.println("Arithmetic exception occurs");
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
    	  System.out.println("ArrayIndexOutOfBounds exception occurs"); 
       }
       catch(Exception e) {
    	   System.out.println("Parent excepyion occurs");
       }
       System.out.println("rest of the code");
	}

}
