class sampleA{
	void display()
	{
		System.out.println("sample A is running");
	}
}
class sampleB extends sampleA
{
	void display()
	{
		System.out.println("sample B is running");
	}
}
public class final_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			sampleB o=new SampleB();
			o.display();
	}

}
