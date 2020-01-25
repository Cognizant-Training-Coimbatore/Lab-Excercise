package demo;

import java.util.Scanner;

class screen
{void ar(int l,int b)
	{int c;
	c=l*b;
	System.out.println("area rectangle:"+c);
}
void ar(int l)
{int g;
g=l*l;
System.out.println("area square:"+g);
	}
}
public class area2fig {
	public static void main(String[] args)
	{screen obj=new screen();
		Scanner sc=new Scanner(System.in);
	int l,b;
int a;
System.out.println("enter the parameters for rectangle");
l=sc.nextInt();
b=sc.nextInt();
System.out.println("enter the parameters for square");
a=sc.nextInt();
obj.ar(l,b);
obj.ar(a);
		
		
		
	}

}
