class a2{
	static int i=0;
	void display() {
		i=i+1;
		System.out.println(i);
	}
}
public class static_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		a2 q=new a2();
		q.display();
		q.display();
	}

}
