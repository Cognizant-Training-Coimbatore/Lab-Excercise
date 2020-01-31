package java_excercises;

public class q9_primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int number = 2;
	        int count = 0;
	        long sum = 0;
	        while(count < 100){
	            if(isPrimeNumber(number)){
	                sum += number;
	                count++;
	            }
	            number++;
	        }
	        System.out.println("the sum of first 100 prime numbers are:"+sum);

	}
	private static boolean isPrimeNumber(int number){
        
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

}
