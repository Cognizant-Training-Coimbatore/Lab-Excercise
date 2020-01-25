class test5
{
	int a = 10;
}
class test6 extends test5
{
	int b = 35;
}
class test7 extends test6
{
	int c;
	void display()
	{
		c=a+b;
		System.out.println(c);
	}
}
public class program41_multilevel_inheritance {

	public static void main(String[] args) 
	{
		test7 obj = new test7();
		obj.display();

	}

}
