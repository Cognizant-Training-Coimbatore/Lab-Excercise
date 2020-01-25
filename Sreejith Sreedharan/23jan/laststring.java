package demo;

import java.util.Scanner;

class stringhandler
{String a;
String b;
String d;
String e;
	String combine(String g, String v)
	{   String k;
		k=g.concat(v);
		return k;
		}
	String tolower(String d)
	{String c;
	c=d.toLowerCase();
	return c;}
	
void vowel(String n)
	{int k=0;
		for(int i=0;i<n.length();i++)
		if(n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='o'||n.charAt(i)=='u'||n.charAt(i)=='i')
		k++;
		System.out.println("number of vowles"+k+"\n");
		
		
		
		
		
	}
	
}

public class laststring {

	public static void main(String[] args) {
		stringhandler obj=new stringhandler();
		Scanner sc=new Scanner(System.in);
		obj.a=sc.nextLine();
		obj.b=sc.nextLine();
		String v;
		v=obj.combine(obj.a,obj.b);
		System.out.println(v+"\n");
		
		obj.e=sc.nextLine();
		obj.vowel(obj.e);
		obj.d=sc.nextLine();
		String p;
		p=obj.tolower(obj.d);
		System.out.println(p+"\n");
		
		}

}
