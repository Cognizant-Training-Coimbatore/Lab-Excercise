import java.util.Scanner;

class Programming
{
	void display()
	{
		System.out.println("Ilove programming languages");
	}
	void display(String p)
	{
	
		System.out.println("I love "+p);
	}
}
public class program36_iloveprg 
{

	public static void main(String[] args) 
	{
		Programming obj = new Programming();
		obj.display();
		Scanner sc = new Scanner(System.in);
		String p1 = sc.nextLine();
		obj.display(p1);
	}

}
