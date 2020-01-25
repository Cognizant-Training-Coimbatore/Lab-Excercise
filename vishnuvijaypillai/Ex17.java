class game
{
	static int x;
	void display()
	{
		System.out.println("this is game class"+x);
	}
}
class game2 extends game
{
	void display()
	{
		x++;
		System.out.println("this is game 2 class"+x);
	}
}

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		game obj1 = new game();
		obj1.display();
		game2 obj2 = new game2();
		obj2.display();

	}

}
