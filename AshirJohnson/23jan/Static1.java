package helloworld;
class Static
{
	static int x;
}
public class Static1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static s=new Static();
		s.x=2;
		Static s1=new Static();
		s1.x+=3;
		System.out.println(s.x+"\n"+s1.x);
	}

}
