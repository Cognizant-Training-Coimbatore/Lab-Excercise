import java.util.Scanner;

public class ExerProg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the values of: ");
		Scanner scan = new Scanner(System.in);
		int temp,count=0;
		int[] nos= new int[5];
		for(int i=0;i<5;i++) {
			temp=i+1;
			System.out.print(temp+" number: ");
			temp=scan.nextInt();
			nos[i]=temp;
			if(temp%2!=0)
				count++;
		}
		System.out.println("\nOdd numbers count= "+count);
		scan.close();
	}

}
