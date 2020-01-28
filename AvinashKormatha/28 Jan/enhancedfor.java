import java.util.ArrayList;

public class enhancedfor
{
	static void printArray(int myarray[])
	{
		for(int x: myarray)
		{
			System.out.println(x);
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int no[] = new int[3];
		no[0] = 10;
		no[1] = 2;
		no[2] = 5;
		printArray(no);
		ArrayList<Integer> a = new ArrayList<Integer>();
	}

}
