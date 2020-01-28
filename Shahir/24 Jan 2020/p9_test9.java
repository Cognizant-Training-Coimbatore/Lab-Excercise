class animals
{
	
	
}
class dog extends animals
{
	void shout()
	{
	System.out.println("Dog will bark");
	}
}
class cat extends animals
{
	void shout()
	{
	System.out.println("Cat will shout like miyaav.....");
	}
}

public class p9_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d = new dog();
		d.shout();
		cat c = new cat();
		c.shout();
	}

}
