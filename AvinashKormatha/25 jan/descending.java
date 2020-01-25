
public class descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {500,20,30,40};
		int small=0,temp;
		int size=a.length;
		for(int i=0;i<=size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+a[i]);
		}
	}

}
