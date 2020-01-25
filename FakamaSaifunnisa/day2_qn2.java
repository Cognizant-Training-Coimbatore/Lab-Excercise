import java.util.Scanner;

public class day2_qn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,res;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number between 0 aned 9");
			int a=sc.nextInt();
			for(i=1;i<=a;i++) {
				for(j=1;j<=10;j++) {
					res=j*i;
					System.out.println(j+"*"+i+"="+res);
				}
			}
	}

}
