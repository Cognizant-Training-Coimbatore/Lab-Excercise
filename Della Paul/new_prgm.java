class test1
{
	 static int x;
	void display()
	{
		x++;
		System.out.println(x);
	}
}
public class new_prgm {

	public static void main(String[] args) {
		test1 obj1=new test1();
		obj1.display();
		test1 obj2=new test1();
		obj2.display();
	}

}
