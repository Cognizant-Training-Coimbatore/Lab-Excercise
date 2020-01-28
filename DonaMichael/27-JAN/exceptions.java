
public class exceptions {
	 static void validate(int age)throws  pogram72_myexceptions{
		 if(age<18)
		 {
			 throw new pogram72_myexceptions("not valid");
		 }
		 else
		 {
			 System.out.println("Welcome to vote");
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(13);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured "+m);
		}
	}

}
