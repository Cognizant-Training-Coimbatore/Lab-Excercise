package demo;
class samplea
{
	final void display()
	{
		System.out.println("Sample A is running");
	}
}
class sampleb extends samplea
{
	void display1()//cannot override display() because display() is declared as final so its declared as display1()
	{
		System.out.println("Sample B is running");
	}
}
public class final_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sampleb sb=new sampleb();
		sb.display();
	}

}
