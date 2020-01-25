
class f{
	void display1() {
		System.out.println("This is Parent calss!");
	}
}
class g extends f{
	void display2() {
		System.out.println("This is child calss!");
	}
}
public class Exer3_Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f obj1 = new f();
		g obj2 = new g();
		obj1.display1();
		obj2.display2();
		obj2.display1();
	}

}