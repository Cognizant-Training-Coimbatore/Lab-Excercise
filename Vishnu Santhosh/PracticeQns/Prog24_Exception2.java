
public class Prog24_Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = new int[2];
			System.out.println(a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Error "+e);
		}
	}

}
