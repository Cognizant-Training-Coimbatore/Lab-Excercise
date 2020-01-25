package demo;
class wow
{
	static int i=0;
	static void display()
	{
		i++;
		System.out.println(i);
	}
}
class now extends wow
{
	int i=0;
	void display1()
	{
		i++;
		System.out.println(i);
	}
}
public class static_var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wow w=new wow();
		wow w1=new wow();
		w.display();
		w1.display();
		now n=new now();
		now n1=new now();
		n.display1();
		n1.display1();
	}

}
