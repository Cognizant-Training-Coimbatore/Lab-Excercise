class ic
{
	ic()
	{
		System.out.println("How are you?");
	}
	ic (int a, String b)
	{
		System.out.println("I am " +a+b);
	}
	ic (String a, int b)
	{
		System.out.println("I am " +a+b);
	}
}
public class int_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ic as = new ic();
		ic asd = new ic(5,"n");
		ic asdf = new ic("fi",9);
	}

}
