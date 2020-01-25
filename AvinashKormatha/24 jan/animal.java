class animals
{
	
}
class dog extends animals
{
	void shout()
	{
		System.out.println("dog will bark");
	}
}
class cat extends dog
{
	void shout()
	{
		System.out.println("cat will shout like miyaav");
	}
}
public class animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog obj = new dog();
		obj.shout();
		cat obj1=new cat();
		obj1.shout();
	}

}
