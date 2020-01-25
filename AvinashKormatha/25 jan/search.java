
public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,10,50,39};
		int size= a.length,s=39,count=0;
		for(int i=0;i<size;i++)
		{
			if(a[i]==s)
			{
				System.out.println("element found at "+i);
				
			}
			else
			{
				System.out.println("element not found");
			}
		}
	
	}

}
