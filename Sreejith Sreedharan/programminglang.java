package demo;

import java.util.Scanner;

class program1
{program1()
	{System.out.println("I love programming languages");
	}
program1(String name)
{   
	System.out.println("I love "+name);
}
}

public class programminglang {
	public static void main(String[] args)
{Scanner sc=new Scanner(System.in);
String name1;
name1=sc.nextLine();
program1 obj=new program1();
program1 obj2=new program1(name1);
		


}
}
