import java.util.Scanner;

public class max_min_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int max=0, min=0, j, count = 0, sum = 0;
		double avg;
		System.out.println("Enter 10 numbers");
		do
		{
			j=scanner.nextInt();
			sum += j;
			count++;
		}while (count<10);
			avg = sum/10;
		{
			if (j>max)
			{
				max = j;
			}
		{
			if (j<min)
			{
				min = j;
			}
		}
		}
		System.out.println("The average of the number is " +avg);
		System.out.println("The maximum number is " +max);
		System.out.println("The minimum number is " +min);
}
}