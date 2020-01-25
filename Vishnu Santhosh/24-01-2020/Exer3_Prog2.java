class c{
	int y=20;
}
class d extends c{
	int z=12;
}
class e extends c{
	int z=13;
}
public class Exer3_Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d obj1 = new d();
		e obj2 = new e();
		System.out.println(obj1.y);
		System.out.println(obj2.y);
	}

}
