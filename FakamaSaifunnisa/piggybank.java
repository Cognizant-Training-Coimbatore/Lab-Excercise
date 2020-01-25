class Addamount{
	int amount=50;
	Addamount()
	{
		amount=amount;
		System.out.println("amount is "+amount);
	}
	Addamount(int x){
		amount=amount+x;
		System.out.println("amount is "+amount);
	}
}
public class piggybank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Addamount p1=new Addamount();
			Addamount p2=new Addamount(50);
	}

}
