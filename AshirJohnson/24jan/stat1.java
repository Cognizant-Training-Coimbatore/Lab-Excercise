package helloworld;
class stat2
{
	static int x=1;
	static void display()
	{
		x=7;
		System.out.println(x);
	}
}
public class stat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stat2.display();
	}
}
