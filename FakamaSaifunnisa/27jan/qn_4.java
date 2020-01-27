package packB;

import java.util.Scanner;

public class qn_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

