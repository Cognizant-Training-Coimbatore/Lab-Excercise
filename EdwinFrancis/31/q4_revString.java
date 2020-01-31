package java_excercises;

import java.util.Scanner;

public class q4_revString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int i;
		System.out.println("enter string:");
		Scanner input=new Scanner(System.in);
		str=input.nextLine();
		for(i=str.length();i>0;i--) {
			System.out.print(str.charAt(i-1));
	
		}

	}

}
