package demo;
interface jango
{
	void calc();
}
interface django
{
	void disp();
}
class mulinh implements jango,django
{
	int a=2,b=3,c;
	public void calc()
	{
		c=a+b;
	}
	public void disp()
	{
		System.out.println(c);
	}
}
public class inheritance_multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mulinh m=new mulinh();
		m.calc();
		m.disp();
	}

}
