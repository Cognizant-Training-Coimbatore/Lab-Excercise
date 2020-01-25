
class Addamount
{
	int amount=100;
	Addamount()
	{
		System.out.println("amount is"+amount);
	}
	Addamount(int x)
	{
		amount=amount+x;
		System.out.println("amount is"+amount);
	}
}
public class ques7_piggybank {

	public static void main(String[] args) {
		Addamount a1=new Addamount();
		Addamount a2=new Addamount(50);

	}

}
