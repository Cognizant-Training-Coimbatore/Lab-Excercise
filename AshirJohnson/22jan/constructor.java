package helloworld;
class sample1
{
	int x,y;
	sample1(int a,int b)
	{
		x=a;y=b;
		System.out.println("Constructor is running");
	}
}
public class constructor {

	public static void main(String[] args) {
		int a,b;
		a=10;b=20;
		sample1 s=new sample1(a,b);
		System.out.println(s.x+"\n"+s.y);
		
	}

}
