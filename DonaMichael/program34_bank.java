class addAmount{
	int amount=50;
	addAmount()
	{
		System.out.println("Without passing parameter, the final amount is:"+amount);
	}
	addAmount(int x)
	{
		System.out.println("having the parameter,the final amount is:"+(x+amount));
	}
	}
public class program34_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addAmount am=new addAmount();
		addAmount am1=new addAmount(90);
	}

}
