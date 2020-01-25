package demo;
class sampleA{
	final void display()//final WILL NOT OVERRIDE METHOD
	{
		System.out.println("sampleA is running");
	}
}
class sampleB extends sampleA{
	void display() {
		System.out.println("sampleB is running");
	}
}

public class program27_final_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sampleB obj=new sampleB();
		obj.display();

	}

}
