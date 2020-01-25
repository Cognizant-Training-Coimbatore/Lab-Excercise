class sampleA
{
	final void display() // final with a variable then it cannot change the value. Final with a method it cannot overrride and final with a class cannot be extended
	{
		System.out.println("sampleA running......");
	}
}
class sampleB extends sampleA
{
	void display()
	{
		System.out.println("Test 1 running...........");
	}
}
public class program56_final_methods {

	public static void main(String[] args) 
	{
		sampleB obj = new sampleB();
		obj.display();
	}

}
