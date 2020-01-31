
public class program7_divisible_by_3_and_11 {

	public static void main(String[] args) {
		System.out.println("Numbers between 1 and 100 which are divisible by 3 and 11 are:");
		for(int i=1;i<=100;i++)
		{
			if((i%3==0) && (i%11==0))
			{
				System.out.println(i);
			}
		}
	}

}
