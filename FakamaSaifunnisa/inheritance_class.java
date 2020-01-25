class a{
	int y=20;
}
class b extends a{
	void display() {
		System.out.println(y+5);
	}
}
public class inheritance_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b b1=new b();
		b1.display();
		
	}

}
