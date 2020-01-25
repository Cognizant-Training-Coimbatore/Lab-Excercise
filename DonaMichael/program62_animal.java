class animal{
	
}
class dog extends animal{
	void shout()
	{
		System.out.println("Dog wil  bark");
		
	}
}
class cat extends dog
{
	void shout()
	{
		System.out.println("Cat will shout like miyavv......");
	}
	}
public class program62_animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog obj=new dog();
		obj.shout();
		cat obj1=new cat();
		obj1.shout();
	}

}
