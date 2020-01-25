final class test7
{
	final void display()
	{
		System.out.println("test7 is running");
	}
}
class test8 extends test7 //cannot extend test7 because its final
{
	 void display() //can't override
	{
		System.out.println("test8 is running");
	}
}
public class finalkeyword {

	public static void main(String[] args) {
		test8 obj=new test8();
		obj.display();
	}

}
