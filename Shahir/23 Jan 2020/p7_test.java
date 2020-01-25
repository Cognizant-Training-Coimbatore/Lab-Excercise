import java.util.Scanner;
class AddAmount
{
	int amount=50;
	AddAmount()
	{
		System.out.println("Final Amount in bank"+amount);
	}		
	AddAmount(int a)
	{
		amount+=a;
		System.out.println("Final Amount in bank"+amount);
	}
}
public class p7_test
{
	public static void main(String[] args)
	{
		AddAmount ad1 = new AddAmount();
		AddAmount ad2 = new AddAmount(5);
	}

}
