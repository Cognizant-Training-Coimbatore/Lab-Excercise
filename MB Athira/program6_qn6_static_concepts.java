class test11
{
	static int x;
	void display()
	{
		x++;
		System.out.println(x);
	}
}
public class program6_qn6_static_concepts 
{

		public static void main(String[] args)
		{
			test11 obj1 = new test11();
			obj1.display();
			test11 obj2 =new test11();
			obj2.display();
		}


}
