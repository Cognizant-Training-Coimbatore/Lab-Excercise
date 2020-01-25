class Print
{
	void Print(char c, int a)
	{
		System.out.println("Character="+c);
		System.out.println("Integer="+a);
	}
	void Print( int a, char c)
	{
		System.out.println("Integer="+a);
		System.out.println("Character="+c);
	}
}
public class p9_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print p = new Print();
		Print p1 =new Print();
		p.Print('a',7);
		p1.Print(12,'v');
	}

}
