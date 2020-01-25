import java.util.Scanner;

class print1{
	void print2(int x,char y)
	{
		System.out.println("x is "+x+"char is"+y);
	}
	void print2(char y,int x)
	{
		System.out.println("x is "+x+"char is "+y);
	}
	
}
public class qn9_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int z=sc.nextInt();
		//char w='v';
		char w=sc.next().charAt(0);
		print1 p=new print1();
		p.print2(z,w);
		
		
	}

}
