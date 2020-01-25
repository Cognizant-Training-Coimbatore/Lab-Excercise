class AddAmount
{
	int amt = 50;
	AddAmount()
	{
		System.out.println("Total amount : " +amt);
	}
	AddAmount(int extra)
	{
		amt += extra;
		System.out.println("Total amount : " +extra);
	}
}
public class piggie_bankk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddAmount as = new AddAmount();
		AddAmount asd = new AddAmount(100);
	}

}