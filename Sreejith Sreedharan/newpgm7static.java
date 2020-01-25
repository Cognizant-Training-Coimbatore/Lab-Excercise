
class stat1
{
	static int x=10,y=20;
	static void display()
	{
		x=2;
		System.out.println(++x);
	}
	static void dis()
	{
		y++;
		System.out.println(y);
	}
}

public class newpgm7static   {

	public static void main(String[] args) {
		stat1 obj=new stat1();
		obj.display();
		stat1.dis();
		stat1 obj1=new stat1();
		obj1.display();
		stat1.dis();
	}

}

