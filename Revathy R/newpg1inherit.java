class a
{
	int a=10;
}
class b extends a
{
	int b=20;
}
class inherit extends b
{
	int c=a+b;
	void display()
	{
		System.out.println(c);
	}
}
public class newpg1inherit {

	public static void main(String[] args) {
		inherit obj=new inherit();
		obj.display();
	}

}
