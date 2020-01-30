package demo;
interface Astin
{
	void meth1();
	void meth2();
}
class MyClass implements Astin
{
	public void meth1()
	{
		System.out.println("Meth1 is working");
	}
	public void meth2()
	{
		System.out.println("Meth1 is working");
	}
}
public class interface_example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass m=new MyClass();
		m.meth1();
		m.meth2();
	}

}
