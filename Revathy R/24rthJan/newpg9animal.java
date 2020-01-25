class animal
{
	
}
class dog extends animal
{	
	void shout()
	{
	System.out.println("Dog will bark");
	}
}
class cat extends dog
{
	void shout()
	{
	System.out.println("Cat will shout like miyaav.....");
	}
}
public class newpg9animal {

	public static void main(String[] args) {
		dog obj=new dog();
		obj.shout();
		cat obj1=new cat();
		obj1.shout();

	}

}
