class samplef
{
	int a=20;
}
class sampleg extends samplef
{
	int b=15;
}
class sampleh extends sampleg
{
	int c;
	void display()
	{
		c=a+b;
		System.out.println(c);
	}
}
public class day2_second_2 {

	public static void main(String[] args) {
		sampleh obj=new sampleh();
		obj.display();

	}

}
