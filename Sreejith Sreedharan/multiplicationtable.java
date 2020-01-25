package demo;

import java.util.Scanner;

public class multiplicationtable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a;
		a=sc.nextInt();
		for(int i=1;i<=a;i++)
			for(int j=1;j<=9;j++)
				System.out.println("multiplication of"+i+"*"+j+"="+(i*j));

	}

}
