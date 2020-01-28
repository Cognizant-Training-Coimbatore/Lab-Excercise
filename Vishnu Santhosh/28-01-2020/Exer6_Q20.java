import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exer6_Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> mymap= new HashMap<Integer, String>();
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> key = new ArrayList<Integer>();
		mymap.put(1, "Vishnu");
		mymap.put(4, "VVP");
		mymap.put(3, "Shahir");
		mymap.put(2, "Ashir");
		mymap.put(5, "Avinash Bhai");
		int lkey=999,mkey=0;
		Set<Integer> keys = mymap.keySet();
		System.out.print("Enter the value of key: ");
		int k=scan.nextInt();
		for(int x:keys) {
			if(x<k) {
				key.add(x);
			}
		}
		System.out.println("Key-value pairs are:");
		for(int x:key) {
			System.out.println(x+'-'+mymap.get(x));
		}
	}

}

