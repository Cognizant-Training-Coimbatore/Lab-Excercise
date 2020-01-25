class one
{
	int x=1;
}
class two extends one
{
	int y=1;
}
class three extends two
{
	void display()
	{
		System.out.println("inheretens multilevel "+(x+y));
	}
}
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		three obj = new three();
		obj.display();

	}

}
