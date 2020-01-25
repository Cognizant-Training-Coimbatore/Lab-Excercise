class sampleA
{
	final void display()
	{
		System.out.println("sampleA is running...");
	}
}
class sampleB extends sampleA
{
	void display()
	{
		System.out.println("sampleB is running....");
	}
}
public class programm45_final_methods {

	public static void main(String[] args) 
	{
		sampleB obj = new sampleB();
		obj.display();

	}

}
