package helloworld;

class test
{
	int x,y;
	test(int a,int b)
	{
		x=a;
		y=b;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
}
public class defineclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test a=new test(5,10);
		a.display();
	}

}
