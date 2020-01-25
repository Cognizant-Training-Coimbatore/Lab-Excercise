
class a1
{
	int a=10;
}
class b1 extends a1
{
	int b=20;
}
class inherit1 extends b1
{
	int c=b+a;
	void display()
	{
		System.out.println(c);
	}
}
public class newpgm2multipleinheritence {

	public static void main(String[] args) {
		inherit1 obj=new inherit1();
		obj.display();
	}

}

