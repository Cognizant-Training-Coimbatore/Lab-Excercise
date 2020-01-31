package selenium_proj;

import java.util.Arrays;

public class Program10_multiply_array_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String result = "";
		  int[] a1 = {1,5,6,7};
		  int[] a2= {2,4,8,8};
		  System.out.println("Array1: "+Arrays.toString(a1));  
		  System.out.println("Array2: "+Arrays.toString(a2));
		  for (int i = 0; i < a1.length; i++)
		  {
			int n1 = a1[i];
			int n2 = a2[i];
			result += Integer.toString(n1 * n2) + " ";
		  }
		System.out.println("Result: "+result);    
	}

}
