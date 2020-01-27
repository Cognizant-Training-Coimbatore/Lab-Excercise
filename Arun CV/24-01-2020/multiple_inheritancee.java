class testX
{
	int x = 100;
}
class testY extends testX
{
	int x=10;
	void disp()
	{
		System.out.println(super.x);
	}
}
public class multiple_inheritancee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testY obj = new testY();
		obj.disp();
	}

}
