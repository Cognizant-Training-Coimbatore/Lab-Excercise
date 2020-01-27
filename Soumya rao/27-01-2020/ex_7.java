
public class ex_7 {
static void validate(int age)throws myexceptions
{
	if(age>18)
		throw new myexceptions("not valid");
	else
		System.out.println("welcome buddy");
}
	public static void main(String[] args) {
	try {
		validate(13);
		
	}
catch(Exception m)
	{
	System.out.println("excedption ovccuued"+m);
	}
	}

}
