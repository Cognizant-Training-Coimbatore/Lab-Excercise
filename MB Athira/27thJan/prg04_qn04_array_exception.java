import java.util.Scanner;

public class prg04_qn04_array_exception 
{

	public static void main(String[] args)
	{
		  try {
		   Scanner sc=new Scanner(System.in);
		   int a=sc.nextInt();
		   int b=sc.nextInt();
		   int res=a/b;
		   int c[]=new int[5];
		   c[5]=res;
		  }
		  catch(ArithmeticException e) {
		   System.out.println("arithematic exception occurs");
		  }
		  catch(ArrayIndexOutOfBoundsException e) {
		   System.out.println("arayindexoutofbounds exception occurs");
		  }

	}

}
