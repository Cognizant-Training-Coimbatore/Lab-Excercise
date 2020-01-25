package helloworld;

import java.util.Scanner;

class stringhandler
{
	int i,count=0;
	void stradd(String a,String b)
	{
		System.out.println(a+b);
	}
	void vowel(String a)
	{
		for(i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U'))
			{
				count++;
			}
		}
		System.out.println("No. of vowels is:"+count);
	}
	void lower(String a)
	{
		System.out.println(a.toLowerCase());
	}
}
public class stri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a,b;
		System.out.println("Enter the strings:");
		Scanner sc=new Scanner(System.in);
		a=sc.next();
		b=sc.next();
		stringhandler st=new stringhandler();
		st.stradd(a, b);
		st.vowel(a);
		st.lower(a);
	}

}
