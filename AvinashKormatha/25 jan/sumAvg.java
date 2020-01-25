import java.util.Scanner;

public class sumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,avg,count=0;
		int[] a= new int[5];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			count++;
			sum=sum+a[i];
			
		}
		avg=sum/count;
		System.out.println(" "+sum+" "+avg);
		
	}

}
