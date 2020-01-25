class test3
{
	int x=2;
}
class test4 extends test3
{
	int y =10;// Single Inheritance : super class sub class
	void display()
	{
		System.out.println(x+y);
	}
}
public class program51_inheritance_exp
{

	public static void main(String[] args) 
	{
		test4 obj = new test4();
		obj.display();
	}

}
