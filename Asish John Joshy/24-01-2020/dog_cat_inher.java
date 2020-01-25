package demo;
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
	void display()
	{
		super.shout();
		shout();
	}
}
public class dog_cat_inher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat ca=new cat();
		ca.display();
	}

}
