package helloworld;
class over1
{
	over1()
	{
		System.out.println("display");
	}
	over1(int x)
	{
		System.out.println(x);
	}
	over1(int x, int y)
	{
		System.out.println(y);
	}
}
public class Cunstover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		over1 o=new over1();
		over1 o1=new over1(4);
		over1 o2=new over1(4,6);
		
	}

}
