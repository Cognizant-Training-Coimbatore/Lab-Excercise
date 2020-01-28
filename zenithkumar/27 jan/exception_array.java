
public class exception_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = new int [2];
			System.out.println("Access element three :" + a[3]);
		}
		catch(ArrayindexOutOfBoundsException e)
		{
			System.out.println("Exception thrown :" +e);
		}

	}

}
