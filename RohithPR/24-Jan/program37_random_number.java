import java.util.*;


public class program37_random_number {

	public static void main(String[] args) 
	{
		int m;

        Scanner SC = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Please enter maximum range: ");
        m=SC.nextInt();
        
            System.out.println(rand.nextInt(m));

	}

}
