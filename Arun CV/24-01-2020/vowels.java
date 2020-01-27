package p2_declare_variable;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        String abc;
	        int vowels = 0;
	        Scanner scanner = new Scanner (System.in);
	        System.out.println("Enter the string");
	        abc = scanner.nextLine();
	        
	        for(int i = 0; i < abc.length(); i++)
	        {
	            char ch = abc.charAt(i);
	            if(ch == 'a' || ch == 'e' || ch == 'i'
	                || ch == 'o' || ch == 'u') 
	            {
	                ++vowels;
	            }
	            
	}
			System.out.println("The number of vowels" +vowels);

	}
}
