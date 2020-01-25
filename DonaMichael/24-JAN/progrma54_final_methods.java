class sample_A{//if we use final here we cant use exteds property 
 void display()
	{
		System.out.println("Sample A is running");
	}
}
class sample_B extends sample_A
{
	void display() {
	System.out.println("SampleB is running");
	}
}
public class progrma54_final_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			sample_B obj= new sample_B();
				obj.display();
	}

}
