
public class Prog26_Exception_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[3];
		try {
			System.out.println(a[4]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Exception thrown= "+e);
		}
		finally {
			a[0]=6;
			System.out.println("First element value: "+ a[0]);
			System.out.println("The finally statement is executed");
		}
	}

}
