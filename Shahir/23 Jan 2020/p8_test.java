class Programming
{
	String x= "I love";
	Programming()
	{
		System.out.println(x+"Programming Languages");
	}
	Programming (String a)
	{
		System.out.println(x+=a);
	}
}
public class p8_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programming p = new Programming();
		Programming p2 = new Programming("Java");
	}

}
