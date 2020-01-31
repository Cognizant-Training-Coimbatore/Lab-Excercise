
public class program9_sum_of_primenumbers {

	public static void main(String[] args) {
		System.out.println("The sum of first 100 prime numbers are: ");
		int count=0,sum=0;
		for(int i=2;;i++)
		{	int c=0;
			for(int j=2;j<=(i/2);j++)
			{
				
				if(i%j==0)
				{
					c=c+1;
				}
				
			}
			if(c==0)
			{
				count=count+1;
				sum=sum+i;
				
				if(count==100)
					break;
				
			}
		}
		
		System.out.println(sum);
	}

}
