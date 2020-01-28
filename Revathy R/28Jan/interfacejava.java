interface myinterface{
	void add();
	void display();
}
class testinterface implements myinterface
{
	public void add()
	{
		System.out.println("add is working");
	}
	public void display()
	{
		System.out.println("display is working");
	}
}
public class interfacejava {

	public static void main(String[] args) {
		testinterface obj=new testinterface();
		obj.add();
		obj.display();

	}

}
