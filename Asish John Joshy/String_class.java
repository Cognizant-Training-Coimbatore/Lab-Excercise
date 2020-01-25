package demo;

import java.util.Scanner;

class stringhandler
{
	String add(String a,String b)
	{
		String c=a+b;
		return(c);
	}
	int vowel(String a)
	{
		char in;
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			in=a.charAt(i);
			if((in=='a')||(in=='e')||(in=='i')||(in=='o')||(in=='u')||(in=='A')||(in=='E')||(in=='I')||(in=='O')||(in=='U'))
			{
				count++;
			}
		}
		return(count);
	}
	String lower(String a)
	{
		String t=a.toLowerCase();
		return(t);
	}
}
public class String_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		stringhandler sh=new stringhandler();
		System.out.println("Enter 2 string");
		String l=s.nextLine();
		String m=s.nextLine();
		String con=sh.add(l, m);
		int vow=sh.vowel(con);
		String low=sh.lower(con);
		System.out.println("Concatenated:"+con);
		System.out.println("Number of vowels:"+vow);
		System.out.println("Lower case:"+low);
	}

}
