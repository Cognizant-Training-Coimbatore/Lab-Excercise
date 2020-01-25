final class ceta{
	String alpha="This is immutable";
}
class temper{
	final int x = 15;
	final void print() {
		System.out.println("This can't be overridden.");
	}
}
public class Exer3_Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ceta obj1= new ceta();
		temper obj2= new temper();
		System.out.println(obj1.alpha);
		System.out.println(obj2.x);
		obj2.print();
	}

}
