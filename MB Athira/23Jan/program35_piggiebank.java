class AddAmount
{
	int amount = 50;
	AddAmount()
	{
		amount = amount;
		System.out.println("Amount : "+amount);
	}
	AddAmount(int w)
	{
		amount = amount+w;
		System.out.println("Amount : "+amount);
	}
}
public class program35_piggiebank 
{

	public static void main(String[] args) 
	{
		AddAmount a1 = new AddAmount();
		AddAmount a2 = new AddAmount(170);
	}

}
