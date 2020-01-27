public class exercise_qn6 {
	static void checksalary(int salary)
	{
		if(salary>5000 && salary<10000)
		{
			System.out.println("Salary Entered is valid");
		}
		else
		{
			throw new ArithmeticException("Salary is not applicable for"+" allowance");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checksalary(6000);
		checksalary(1000);
		checksalary(12000);
	}

}

