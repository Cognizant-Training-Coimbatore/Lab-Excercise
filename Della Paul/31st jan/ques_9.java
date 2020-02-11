
public class ques_9 {

	public static void main(String[] args)
	{
		int i, number, count; 
		int sum=0;
		for(number = 1; number <= 100; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	sum=sum+number;
		    }  
		}
		System.out.println("the sum is"+sum);
	}
}
