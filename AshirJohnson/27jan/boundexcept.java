package helloworld;

public class boundexcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[2];
			System.out.println("Access element three:"+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("Out of the blocks");
	}

}
