import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class prg28_qn18_greatestkey_leastkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashmap1 =new HashMap<Integer, String>();
		hashmap1.put(1, "Java");
		hashmap1.put(2, "C#");
		hashmap1.put(3, "Selenium");
		hashmap1.put(4, "Perl");
		hashmap1.put(5, "Cobol");
		hashmap1.put(6, "Fortran");
		Set<Integer> key = hashmap1.keySet();
		int lkey=999,mkey=-999;
		for(int x:key) {
			if(x>mkey)
				mkey=x;
			if(x<lkey)
				lkey=x;
		}
		System.out.println("Minimum key-value pair: "+lkey+'-'+hashmap1.get(lkey));
		System.out.println("Maximum key-value pair: "+mkey+'-'+hashmap1.get(mkey));
	}

}
