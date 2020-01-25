package helloworld;
class areas
{
	areas(int a)
	{
		System.out.println("area of square is: "+a*a);
	}
	areas(int a,int b)
	{
		System.out.println("area of rectange is: "+a*b);
	}
}
public class are1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		areas p=new areas(3);
		areas p1=new areas(4,5);
	}

}
