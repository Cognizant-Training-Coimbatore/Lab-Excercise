import java.util.Scanner;
public class program19_display_electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,val;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the new meter reading");
		a=scanner.nextInt();
		System.out.println("enter the old meter reading");
		b=scanner.nextInt();
		val=a-b;
		if(val>0&&val>101) {
			System.out.println("price-free");
		}
		else if(val>100&& val<200){
			System.out.println("price=1");
		}
		else if(val>201&& val<300)
		{
			System.out.println("price=2");
		}
		else if(val>301&& val<400)
		{
			System.out.println("price=3");
		}
		else
		{
			System.out.println("price=4+10% tax");
		}
	}

}
