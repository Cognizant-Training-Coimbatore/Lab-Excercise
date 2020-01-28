class testX{
	int x=123;
}
class testY extends testX{
	int x=12;
	void display() {
		System.out.println(x);
		System.out.println(super.x);
	}
}
public class Prog19_Super_Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testY obj = new testY();
		obj.display();
	}

}
