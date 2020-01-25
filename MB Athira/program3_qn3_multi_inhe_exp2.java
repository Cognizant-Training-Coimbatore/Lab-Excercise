	class SampA
	{
		int a = 10;	
	}
	class SampB extends SampA
	{
		int b =32;
	}
	class SampC extends SampB
	{
		int c;
		void display()
		{
			c = a*b;
			System.out.println(a+"*"+b+"="+c);
			System.out.println("Sum = "+(a+b));
		}
	}
	public class program3_qn3_multi_inhe_exp2 
	{

		public static void main(String[] args) 
		{
			SampC obj = new SampC();
			obj.display();
		}

	}