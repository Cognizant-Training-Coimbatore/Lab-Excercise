package demo;

import java.util.Scanner;

public class vowels {
	public static void main(String[] args)
	{String a;
	int c=0;
	Scanner sc=new Scanner(System.in);
	a=sc.nextLine();
	for(int i=0;i<a.length();i++)
	if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'||(a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U'))
			c++;
	System.out.println("number of vowels is:"+c);
		
		
		
		
		
	}

}
