
public class except extends Exception{
	except(int x){
		if(x<0) {
			System.err.println("Error not accepted!!");
		}
	}
}
