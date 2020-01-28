package jan_27th;

import java.util.Scanner;

public class EX_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
				int a,b;
				int[] result=new int[5];
				Scanner scanner = new Scanner(System.in);
				a = scanner.nextInt();
				b = scanner.nextInt();
				try
				{
					
					result[5]=a/b;
					System.out.println("result = "+result);
				}
				catch(ArithmeticException e)
				{
					System.out.println("Error in the code"+e);
				}
				catch (IndexOutOfBoundsException e) {
					// TODO: handle exception
					System.out.println("Error in the code"+e);
					
				}
				
				System.out.print("outof the block");
			}

			



	}


