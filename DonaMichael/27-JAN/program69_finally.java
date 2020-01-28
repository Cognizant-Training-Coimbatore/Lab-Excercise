
public class program69_finally {

	public static void main(String[] args) {
		int a[]=new int[2];
		try {
			System.out.println("Access elements three"+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Excepton thrown"+e);
			
		}
		finally {
			a[0]=6;
			System.out.println("First element value"+a[0]);
			System.out.println("The finally statement is executed");
		}
	}

}
