
public class d31_prg07_divisibleby_3and11 
{

	public static void main(String[] args) 
	{
		for (int i = 1; i<=100; i++) 
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
			else if(i%11==0)
			{
				System.out.println(i);
			}
			else if(i%3==0&&i%11==0)
			{
				System.out.println(i);
			}
		}
	}

}
