package demo;
class par
{
	int x=10;
}
class chil extends par
{
	int x=100;
	void display()
	{
		System.out.println(x);
		System.out.println(super.x);
	}
}
public class super_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chil c=new chil();
	}

}
