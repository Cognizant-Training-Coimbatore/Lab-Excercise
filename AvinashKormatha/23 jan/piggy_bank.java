class add
{
	int amount=50;
	add()
	{
		System.out.println("amount in piggy bank"+amount);
	}
	add(int a)
	{
		int c;
		c = a+amount;
		System.out.println("amount in piggy bank "+c);
	}
}
public class piggy_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add obj= new add();
	}

}
