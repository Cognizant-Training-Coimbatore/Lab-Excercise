
class stat
{
	static int x=10;
	void display()
	{
		x++;
		System.out.println(x);
	}
	static void dis()
	{
		x++;
		System.out.println(x);
	}
}

public class newpg6static  {

	public static void main(String[] args) {
		stat obj=new stat();
		obj.display();
		stat.dis();
		stat obj1=new stat();
		obj1.display();
		stat.dis();
	}

}
