import java.util.Scanner;

public class myexception2 {
	static void validate(int code) throws myexceptions
	{
		if(code>=101 && code<=200)
		{
			System.out.println("Accepted");
		}
		else
			throw new myexceptions("Rejected");
	}
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter empcode");
		int code=sc.nextInt();
		try
		{
			validate(code);
		}
		catch(Exception m)
		{
			System.out.println(m);
		}
	}

}
