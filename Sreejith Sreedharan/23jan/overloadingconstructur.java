package demo;
class overloading
{overloading()
	{System.out.println("Heya");
	}
	overloading(int a)
	{System.out.println("bye");
	
	}
	}

public class overloadingconstructur {
	public static void main(String args[])
	{overloading obj=new overloading();
	overloading obj2=new overloading(5);
	}
}
