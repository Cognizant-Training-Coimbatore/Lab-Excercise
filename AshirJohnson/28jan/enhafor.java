package helloworld;

public class enhafor {
	static void printArray(int myarray[])
	{
		for(int x:myarray)
		{
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no[]=new int[3];
		no[0]=1;
		no[1]=5;
		no[2]=10;
		printArray(no);
	}

}
