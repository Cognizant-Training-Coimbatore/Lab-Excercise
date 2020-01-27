package packB;
import packA.ques2;
class test3 extends ques2
{
	void display2()
	{
		ques2();
		display1();
	}
	
}
public class ques2_b {

	public static void main(String[] args)
	{
		
		test3 obj=new test3();
		obj.display2();
	}

}
