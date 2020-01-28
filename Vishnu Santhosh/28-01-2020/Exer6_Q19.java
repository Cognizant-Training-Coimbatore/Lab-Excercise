import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exer6_Q19 {
	static void current(Map<Integer, String> keys) {
		int lkey=999,mkey=0;
		Set<Integer> key = keys.keySet();
		for(int x:key) {
			if(x<lkey) {
				lkey=x;
			}
			if(x>mkey) {
				mkey=x;
			}
		}
		System.out.println("Smallest key-value: "+lkey+"-"+keys.get(lkey));
		System.out.println("Largest key-value: "+mkey+"-"+keys.get(mkey));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> mymap= new HashMap<Integer, String>();
		mymap.put(1, "Vishnu");
		mymap.put(4, "VVP");
		mymap.put(3, "Shahir");
		mymap.put(2, "Ashir");
		mymap.put(5, "Avinash Bhai");
		current(mymap);
		mymap.put(8, "Asish");
		mymap.put(0, "Revathy");
		current(mymap);
	}

}
