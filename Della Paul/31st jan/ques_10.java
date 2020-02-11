import java.util.Arrays;
import java.util.Scanner;
public class ques_10 {

	public static void main(String[] args) 
	{
		String res="";
		int array1[]= {1,2,3};
		int array2[]= {2,3,4};
		int i;
		System.out.println("Array1:"+Arrays.toString(array1));
		
		System.out.println("Array2:"+Arrays.toString(array2));
		for(i=0;i<array1.length;i++)
		{
			int num1=array1[i];
			int num2=array2[i];
			
			res=res+Integer.toString(num1*num2);
			
		}
		System.out.println("result"+res);
	}

}
