
public class agevalidation {

	static void validate(int age)throws myexceptions
	{if(age<18)
		throw new myexceptions("not valid");
	else
		System.out.println("welcome to vote");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(13);
			
		}
		catch(Exception m)
		{
			System.out.println("exception occured"+m);
		}

	}

}
