class testa
{
	int x=1;
}
class testb extends testa
{
	int y=2;
}
class testc extends testb
{
	int z=x+y;
	void display()
	{
		System.out.println(z);
	}
}
public class multilevelinheritance {

	public static void main(String[] args) {
		testc obj=new testc();
		obj.display();	

	}

}
