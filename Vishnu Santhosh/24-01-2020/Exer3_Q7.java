class beta{
	static int x;
	static void set(int y) {
		x = y;
	}
}
public class Exer3_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		beta.set(12);
		beta obj = new beta();
		System.out.println("Value is: "+obj.x);
	}

}
