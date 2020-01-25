package helloworld;
class prin
{
	prin(int a,char b)
	{
		System.out.println(a+"\n"+b);
	}
	prin(char c,int d)
	{
		System.out.println(c+"\n"+d);
	}
}
public class print1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prin p=new prin(3,'a');
		prin p1=new prin('b',5);
	}

}
