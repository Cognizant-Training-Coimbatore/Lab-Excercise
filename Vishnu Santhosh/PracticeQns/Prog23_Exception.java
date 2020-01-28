
public class Prog23_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=5,b=6,c=6;
			int result = a/(b-c);
		}
		catch (Exception e) {
			System.out.println("Error "+e);
		}
		System.out.println("Works fine");
	}

}
