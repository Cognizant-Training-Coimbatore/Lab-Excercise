class animal
{
	void display()
	{
		System.out.println("");
	}
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
		System.out.println("Cat will shout like meow..");
	}
}
public class program9_qn9_animals {

	public static void main(String[] args) 
	{
		cat obj1 = new cat();
		dog obj2 = new dog();
		obj2.shout();
		obj1.shout();
	}

}
