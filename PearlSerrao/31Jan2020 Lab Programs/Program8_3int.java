package selenium_proj;

import java.util.Scanner;

public class Program8_3int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); 
		System.out.print("Enter number 1 : ");
		int x = s.nextInt();
		System.out.print("Enter number 2 : ");
		int y = s.nextInt();
		System.out.print("Enter number 3 : ");
		int z = s.nextInt();
		/*
		 * int a,b,c; if(a<b) if(b<c)
		 * 
		 */
  
		System.out.print("The result is: " + test(x, y, z, true));
		System.out.print("\n");
	}

	
	 public static boolean test(int a, int b, int c, boolean check)
	 { if(check)
	return (b < c);
	 return (b > a && c > b);
	}
	
}
