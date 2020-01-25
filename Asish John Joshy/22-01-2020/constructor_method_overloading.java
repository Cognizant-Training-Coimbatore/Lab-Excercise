package demo;
class overloa
{
	overloa()
	{
		System.out.println("First constructor");
	}
	overloa(int a)
	{
		System.out.println("Second constructor");
	}
}
public class constructor_method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloa on=new overloa();
		overloa on1=new overloa(3);
	}

}
