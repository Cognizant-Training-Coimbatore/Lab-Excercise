public class ex_6 {
	

static void checkavalibility(int age)
{
	if (age>20&& age<60) 
	{ 
		System.out.println("std entri is vlaid");
	}
	else
	{
		throw new ArithmeticException("student is not eligible");
	}
}


public static void main(String[] args) {
	checkavalibility(44);
	checkavalibility(55);
	checkavalibility(65);
		}

	}


