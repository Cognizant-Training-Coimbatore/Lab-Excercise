public class ans_1 {

	
		
		static void validate(int num)throws myexceptions
		{
			if(num>0)
				throw new myexceptions("valid");
			else
				System.out.println("not valid");
		}
		public static void main(String[] args) {
	try
	{
		validate(10);
		
	}
	catch(Exception m)
	{
	System.out.println("excedption ovccuued"+m);
	}
}
}