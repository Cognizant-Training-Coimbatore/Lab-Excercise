import java.util.Scanner;

public class p8_count_odd 
{

	public static void main(String[] args) 
	{
		
		int Size, i, oddCount = 0;
		Scanner sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   
		System.out.print("\n List of Odd Numbers in this Array are :");
		for(i = 0; i < Size; i++)
		{
			if(a[i] % 2 != 0)
			{
				System.out.print(a[i] + " ");
				oddCount++;
			}
		}
		System.out.println("\n Total Number of Odd Numbers in this Array = " + oddCount);
		
		
	}

}
