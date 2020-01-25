package helloworld;
class test3
{
	int x=2;
}
class test4 extends test3
{
	int y=10;
	void display()
	{
		System.out.println(x+y);
	}
}
public class singleinher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test4 o=new test4();
		o.display();
	}

}
