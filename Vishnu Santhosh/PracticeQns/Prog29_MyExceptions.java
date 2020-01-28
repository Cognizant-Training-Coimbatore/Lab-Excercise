
public class Prog29_MyExceptions {
	static void validate(int age) throws myexception{
		if(age<18) {
			throw new myexception("Not valid!");
		}
		else
			System.out.println("Valid");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(13);
		} catch (Exception m) {
			// TODO: handle exception
			System.out.println("Exception : "+m);
		}
	}

}
