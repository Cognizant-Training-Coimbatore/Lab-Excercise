
public class except_hand_2 {

	public static void main(String[] args)
	{
		try
		{
			int a[]= new int[2];
			System.out.println("Acess element three:"+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception thrown:"+e);
		}
		System.out.println("out of the block");
	}

}
