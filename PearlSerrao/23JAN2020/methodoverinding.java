package demo;

public class methodoverinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
two o=new two();
o.display();
	}

}

class one{
	int x=100;
	void display() {
		System.out.println(x);
}
}
	class two extends one{
		int x=10;
		int y=10;
		void display() {
			super.display();
			System.out.println(y);
	}
	}
		