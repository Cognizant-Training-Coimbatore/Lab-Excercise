import java.util.Scanner;

public class odd_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,even=0,odd=0;
		Scanner sc= new Scanner(System.in);
		size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println(odd);
	}

}
