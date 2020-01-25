package demo;
class test1
{static int x=0;
void display()
{x++;
System.out.println(x);
	

}


}

public class staticvar {
	public static void main(String[] args)
	{test1 obj=new test1();
	obj.display();
	test1 obj1=new test1();
	obj1.display();

}
}