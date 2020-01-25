package demo;
class sampleA
{final void display()
	{System.out.println("sampleA is running");}
	}
class sampleB extends sampleA
{void display()
	{System.out.println("sample 2 is running");
	
	
	}
	

}

public class finalexample {
	public static void main(String[] args)
	{sampleB obj=new sampleB();
	obj.display();
		
	}
}
