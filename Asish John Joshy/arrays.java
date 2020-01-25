package demo;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n=new int[5];
		n[0]=1;
		n[1]=2;
		n[2]=30;
		n[3]=4;
		n[4]=5;
		int sum=n[0]+n[1]+n[2]+n[3]+n[4];
		System.out.println("Sum="+sum);
		int g=n[0];
		for(int i=1;i<5;i++)
		{
			if(g<n[i])
			{
				g=n[i];
			}
		}
		System.out.println("Greatest="+g);
	}

}
