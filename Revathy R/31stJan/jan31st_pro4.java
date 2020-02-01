package pack1;

import java.util.Scanner;

public class jan31st_pro4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		String b="";
		for(int i=(s.length()-1);i>=0;i--)
		{
			b=b+s.charAt(i);
		}
		System.out.println("reversed string is "+b);
	}

}
