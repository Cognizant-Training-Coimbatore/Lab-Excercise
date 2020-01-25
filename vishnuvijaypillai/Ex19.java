class animal
{
	
}
class dogs extends animal
{
	void shout()
	{
		System.out.println("dog will bark");
	}
}
class cat extends dogs
{
	void shout()
	{
		System.out.println("cat will shout like miyaav...");
	}
}

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dogs obj1 = new dogs();
		obj1.shout();
		cat obj2 = new cat();
		obj2.shout();
		
	}

}
