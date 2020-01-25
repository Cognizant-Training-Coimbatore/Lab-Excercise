import java.util.Scanner;
public class day2_ques3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements");
		int n=sc.nextInt();
		int arr[]=new int[10];
		int i;
		int avg=arr[0];
		int min=arr[0];
		int max=arr[0];
		for(i=1;i<10;i++) {
			 arr[i]=sc.nextInt();
			 avg=avg+arr[i];
		if(arr[i]>max)
		{
			max=arr[i];
		}
		if(arr[i]<min)
		{
			min=arr[i];
		}
		}
		System.out.println("the max is"+max);
		System.out.println("the min is"+min);
		System.out.println("the average is"+avg/10);
		
	}

}
