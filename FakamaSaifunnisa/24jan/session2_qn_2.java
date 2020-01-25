class a5{
	int y=20;
}
class c5 extends a5{
	int z=y+5;
}
class b5 extends c5{
	void display() {
		System.out.println(z+5);
	}
}
public class session2_qn_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b5 b1=new b5();
		b1.display();
	}

}
