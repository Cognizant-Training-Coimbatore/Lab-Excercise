import java.util.Scanner;

public class exception1  {
	static void validate(int n) throws myexceptions
	{
		if(n>0)
		{
			System.out.println("accepted");
		}
		else
		{
			throw new myexceptions("not valid");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		try {
			validate(n);
		} catch (myexceptions e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
