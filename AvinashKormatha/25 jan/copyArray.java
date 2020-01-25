
public class copyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30};
		int b[]=new int[7];
		int size=a.length;
		for(int i=0;i<size;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++) 
		{
			System.out.print(" "+b[i]);
		}
	}

}
