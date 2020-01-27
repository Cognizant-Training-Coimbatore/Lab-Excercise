package packB;

public class exception_e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10,b=5,c=5;
			int res;
			res=a/(b-c);
		}
		catch(Exception e) {
			System.out.println("error code"+e);
		}
		System.out.println("out of the block");
	}

}
