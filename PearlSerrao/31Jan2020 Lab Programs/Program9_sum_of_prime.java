package selenium_proj;

public class Program9_sum_of_prime {
	public static void main(String[] args) {
    int i =0, n =0;
    
    String  prime= "";

    for (i = 1; i <= 100; i++)         
    { 		  	  
       int c=0; 	  
       for(n=i; n>=1; n--)
	  {
          if(i%n==0)
	     {
        	  	c = c + 1;
	     }
	  }
	  if (c ==2)
	  {
	     
	     prime = prime + i + " ";
	  }	
    }	
    System.out.println("Prime numbers from 1 to 100 :");
    System.out.println(prime);
}
}