package helloworld;
class amoun
{
	int amount=50;
	amoun()
	{
		System.out.println(amount+"$");
	}
	amoun(int a)
	{
		amount+=a;
		System.out.println(amount+"$");
	}
}
public class amount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		amoun a=new amoun();
		amoun a1=new amoun(50);
	}

}
