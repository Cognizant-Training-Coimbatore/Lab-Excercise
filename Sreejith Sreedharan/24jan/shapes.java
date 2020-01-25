package demo;
class shape
{void display()
	{System.out.println("this is this shape");
}
}
class rectangle extends shape
{ void show()
	{System.out.println("this is a rectangle");
	
}}
class circle extends shape
{
	void disp()
	{ 
		System.out.println("this is a cirle");
	}
	
}
class squre extends rectangle
{
	void dis()
	{System.out.println("this is a square");
		}
	
	
}

public class shapes {
public static void main(String[] args)
{squre obj=new squre();
obj.dis();
obj.show();
obj.display();
}


}
