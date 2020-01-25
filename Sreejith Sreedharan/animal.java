package demo;
class animals{
	
}
class dog extends animals
{
	void shout()
	{System.out.println("Dogs bark");
	}
}
class cat extends dog
{
	void shout()
	{ super.shout();
		System.out.println("cats shout miyaav");
		
	}
}
public class animal {
	public static void main(String[] args)
	{cat obj=new cat();
	obj.shout();
	
}
}