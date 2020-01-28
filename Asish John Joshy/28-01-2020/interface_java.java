package demo;
interface myinterface
{
	//int x=20;values declared here are static
	void add();
	void display();
}
class testInterface implements myinterface
{
	public void add()
	{
		System.out.println("Add is working");
	}
	public void display()
	{
		System.out.println("Display is working");
	}
}
public class interface_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testInterface t=new testInterface();
		t.add();
		t.display();
	}

}
