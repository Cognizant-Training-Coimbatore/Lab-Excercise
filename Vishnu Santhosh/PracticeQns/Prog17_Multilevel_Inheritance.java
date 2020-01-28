class superCla{
	int x=3;
}
class subCla1 extends superCla{
	int y=2;
}
class subCla2 extends subCla1{
	int z=5;
	void display() {
		System.out.println(x+y+z);
	}
}
public class Prog17_Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subCla2 obj = new subCla2();
		obj.display();
	}

}
