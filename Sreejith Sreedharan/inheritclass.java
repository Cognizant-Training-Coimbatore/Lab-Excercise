package demo;
class a
{
	int a=10;
}
class b extends a

{int b=10;
}
class inheritance extends b
{int c;
void display()
{c=a+b;
System.out.println("Sum of "+a+"+"+b+"=" +c);
	
	
}
}
public class inheritclass {
	public static void main(String[] args)
	{inheritance obj=new inheritance();
	obj.display();
		
		
		
	}
}
