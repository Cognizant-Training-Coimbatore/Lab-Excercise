import java.util.Scanner;

public class q4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]=new int[5];
		Scanner input=new Scanner(System.in);
		int i,j,small;
		System.out.println("Enter 5 numbers:");
		for(i=0;i<5;i++)
		{
			ar[i]=input.nextInt();
		}
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{  if(ar[i]<ar[j])
			     {small=ar[i];
			      ar[i]=ar[j];
			      ar[j]=small;
			      }
            }
	    }
		System.out.println("ascending order:");
		for(i=0;i<5;i++) {
		System.out.print(ar[i]+" ");}
		System.out.println("\nDescending order:");
		for(j=5;j>0;j--) {
			System.out.print(ar[j-1]+" ");
		}
		
				
		
		

	}

}
