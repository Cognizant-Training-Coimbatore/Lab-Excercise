package demo;
class sample4{
	sample4()
	{
		System.out.println("const is working");
	}
	sample4(int x)
	{
		System.out.println("const is not working");
	}
}
public class overloading_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        sample4 obj1=new sample4();
        sample4 obj2=new sample4(6);
	}

}
