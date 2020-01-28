import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exer6_Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> mymap= new HashMap<Integer, String>();
		mymap.put(1, "Vishnu");
		mymap.put(4, "VVP");
		mymap.put(3, "Shahir");
		mymap.put(2, "Ashir");
		mymap.put(5, "Avinash Bhai");
		int lkey=999,mkey=0;
		Set<Integer> keys = mymap.keySet();
		for(int x:keys) {
			if(x<lkey) {
				lkey=x;
			}
			if(x>mkey) {
				mkey=x;
			}
		}
		System.out.println("Smallest key-value: "+lkey+"-"+mymap.get(lkey));
		System.out.println("Largest key-value: "+mkey+"-"+mymap.get(mkey));
	}

}
