class a1
{
	int a=5;
}
class b1 extends a1
{
		int b=10;
}
class f1 extends b1
{
	int x;
	void display()
	{
		System.out.println(x=a+b);
	}
}
public class program55_mul_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f1 obj=new f1();
		obj.display();
		
	}

}
