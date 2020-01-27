public class exercise_qn7 {
	static void validate(int value)throws myexceptions
	{
		if((value<100)||(value>201))
				{
		throw new myexceptions("value not accepted");
				}
		else
		{
			System.out.println("value accepted");
		}
			
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			validate(150);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured:"+m);
		}
	}

}

