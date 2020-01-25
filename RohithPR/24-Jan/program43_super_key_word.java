class testX
{
	int x = 100;
}
class testY extends testX
{
	int x = 10;
	void display()
	{
		System.out.println(super.x);
	}
}

public class program43_super_key_word {

	public static void main(String[] args) 
	{
		testY obj = new testY();
		obj.display();

	}

}
