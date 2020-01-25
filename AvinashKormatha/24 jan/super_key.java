class test5
{
	int x=100;
	void display()
	{
		System.out.println(x);
	}
}
class test6 extends test5
{
	int x=12;
    void display()
    {
    	System.out.println(super.x);
    }
}
public class super_key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test5 obj= new test5();
		obj.display();
	}

}