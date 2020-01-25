class sample4
{
	sample4()
	{
		System.out.println("const 1 is working");
	}
	sample4(int a){
		System.out.println("constructor 2 is working");
	}
}
public class overloading_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample4 obj=new sample4();
		sample4 obj2=new sample4(5);
	}

}
