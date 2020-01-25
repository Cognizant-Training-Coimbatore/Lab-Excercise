import java.util.Scanner;

public class small_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		int sm;
		System.out.println("Enter array elements");
		for(int i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		}
		sm=a[0];
		for(int i=1;i<10;i++)
		{
			if(sm>a[i])
			{
				sm=a[i];
			}
		}
		System.out.println("Smallest="+sm);
	}

}
