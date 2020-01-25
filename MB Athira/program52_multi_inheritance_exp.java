class testA
{
	int a = 10;	
}
class testB extends testA // MULTI LEVEL INHERITENCE
{
	int b =32;
}
class testC extends testB
{
	int c;
	void display()
	{
		c = a+b;
		System.out.println(c);
	}
}
public class program52_multi_inheritance_exp 
{

	public static void main(String[] args) 
	{
		testC obj = new testC();
		obj.display();
	}

}
