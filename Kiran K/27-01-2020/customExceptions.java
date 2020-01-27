package demo;

public class customExceptions {
	static void validate(int age)throws myExceptions
	{
		if(age<18) {
			throw new myExceptions("not valid");
		}
		else {
			System.out.println("Welcome to vote");
	         }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	validate(13);
        }
        catch(Exception m) {
        	System.out.println("Exception occured "+m);
        }
	}

}
