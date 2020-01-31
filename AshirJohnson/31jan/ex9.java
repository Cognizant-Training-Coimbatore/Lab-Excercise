package java8;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,j,k=1,sum=0;
		while(k<=100)
		{
			i++;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					break;
				}
			}
			if(j==i)
			{
				k++;
				sum+=i;	
			}
			
			}
		System.out.println(sum);
	}

}
