package demo;
class hello
{ 
	void display()
	{ System.out.println("this is the parent class");
		
	}
	
}
class ball extends hello
{void disp()
	{System.out.println("This is child class"); 
	
	}
	

}

public class parentclass {
	public static void main(String[] args)
	{ hello obj=new hello();
	ball obj1=new ball();
	obj.display();
	obj1.disp();
	obj1.display();
		
	}
}
