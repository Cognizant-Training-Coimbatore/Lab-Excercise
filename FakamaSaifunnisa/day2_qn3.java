import java.util.Scanner;

public class day2_qn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i;
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		a[0]=sc.nextInt();
		int max=a[0];
		int min=a[0];
		int avg=a[0];
		for(i=1;i<10;i++) {
			a[i]=sc.nextInt();
			avg=avg+a[i];
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
				
			{
				min=a[i];
			}
			
			
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(avg/10);
	}

}
