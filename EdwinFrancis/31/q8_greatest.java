package java_excercises;

import java.util.Scanner;

public class q8_greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		if(b>a || c>b)
		{
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}


	}

}
