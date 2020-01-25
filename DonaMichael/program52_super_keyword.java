class testx
{
	int x=100;
	}
class testy extends testx
{
		int x=200;
		void display()
		{System.out.println(super.x);
}		}
public class program52_super_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
testy obj=new testy();obj.display();
	}

}
