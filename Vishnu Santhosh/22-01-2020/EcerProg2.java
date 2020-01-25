import java.util.Scanner;

public class EcerProg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the values of: ");
		Scanner scan = new Scanner(System.in);
		int temp,sum=0;
		int[] nos= new int[5];
		for(int i=0;i<5;i++) {
			temp=i+1;
			System.out.print(temp+" number: ");
			temp=scan.nextInt();
			sum+=temp;
			nos[i]=temp;
		}
		System.out.println("\nTotal sum= "+sum);
		int avg = sum/5;
		System.out.println("Average = "+avg);
		scan.close();
	}

}
