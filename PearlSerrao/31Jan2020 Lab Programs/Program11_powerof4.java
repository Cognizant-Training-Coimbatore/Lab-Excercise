package selenium_proj;

public class Program11_powerof4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(power(20));
	 }
	
private static boolean power(int number){
	  if(number<=0){
	   return false;
	  }
	   
	  while(number > 1){
	   if(number % 4 != 0){
	    return false;
	   }
	   number = number / 4;
	  }
	  return true;
	 }
	}

