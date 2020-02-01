package pack1;

public class jan31st_pro9 {

	public static void main(String[] args) {
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
