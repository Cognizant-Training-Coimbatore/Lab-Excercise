import java.util.Scanner;
public class exercise_qn2 {
	static void div(int d,int c)throws Exception
	{
		if(c==0)
		{
			throw new myexceptions("second number cannot be zero");
		}
		else
		{
			int res;
			res=d/c;
			System.out.println("result is"+ res);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		div(x,y);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured:"+m);
		}
		
		
	}

}
