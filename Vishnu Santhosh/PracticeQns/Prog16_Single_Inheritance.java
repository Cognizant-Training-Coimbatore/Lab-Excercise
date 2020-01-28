class superCl{
	int x=2;
}
class subCl extends superCl{
	int y = 10;
	void display() {
		System.out.println(x+y);
	}
}
public class Prog16_Single_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subCl obj = new subCl();
		obj.display();
	}

}
