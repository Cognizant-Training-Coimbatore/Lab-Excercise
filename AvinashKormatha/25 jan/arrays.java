import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,num,greater;
		System.out.println("enter the size");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		int n1[]=new int[n];
		int i;
		System.out.println("enter number 0");
		num=sc.nextInt();
		greater = num;
				for( i=0;i<n;i++)
				{
					System.out.println("enter number"+i);
					num = sc.nextInt();
					n1[i]=num;
					if(num>greater)
					{
						greater=num;
					}
				
				}
				for(i=0;i<n;i++)
				{
					System.out.println("numbers are"+n1[i]);
				}
				System.out.println("greatest number"+greater);
	}

}
