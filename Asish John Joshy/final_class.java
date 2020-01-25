package demo;
final class aa
{
	int a,b;
}
class bb // extends aa can't be written because aa is declared as a final class
{
	int c,d;
}
public class final_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bb b=new bb();
	}

}
