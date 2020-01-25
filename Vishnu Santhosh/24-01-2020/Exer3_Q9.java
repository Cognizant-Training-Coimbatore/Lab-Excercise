class animals
{

}
class dog extends animals{
	void shout()
	{
		System.out.println("Dog will bark");
	}
}
class cat extends dog{
	void shout()
	{
		System.out.println("Cat will shout like miyaav.....");
	}
	void dogshout()
	{
		super.shout();
	}
}
public class Exer3_Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat obj = new cat();
		obj.dogshout();
		obj.shout();
	}

}
