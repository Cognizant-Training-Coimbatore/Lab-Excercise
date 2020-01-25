import java.util.Scanner;

public class q2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,t,sum=0;
		int[] ar;
		ar=new int[10];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 10 integers");
		for(i=0;i<ar.length;i++)
		{
			ar[i]=input.nextInt();
		}
		for(i=0;i<ar.length;i++)
		{ for(j=0;j<ar.length;j++)
		      {if(ar[i]<ar[j])
		          {t=ar[i];
		          ar[i]=ar[j];
		          ar[j]=t;		    	  
		          }
			
		      }
		}
		System.out.println("Maximum value:"+ar[9]);
		System.out.println("Minimum value:"+ar[0]);
		for(i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		System.out.println("Average is:"+(sum/10));
		
	

	}

}
