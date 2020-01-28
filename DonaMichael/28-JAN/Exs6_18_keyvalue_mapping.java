import java.util.HashMap;
import java.util.Set;

public class Exs6_18_keyvalue_mapping {

	public static void main(String[] args) {
		HashMap<Integer,String> hashmap1=new HashMap<Integer,String>();
		hashmap1.put(1, "java");
		hashmap1.put(2, "c#");
		hashmap1.put(3, "selenium");
		hashmap1.put(4, "perl");
		hashmap1.put(5, "cobol");
		hashmap1.put(6, "fortran");
		Set<Integer> key=hashmap1.keySet();
		int min=-999,max=999;
		for(int x:key)
		{
			if(x>min)
				if(x<max)
					min=x;
					max=x;
		}
			System.out.println("minimum key-value pair "+min+"-"+hashmap1.get(min));	
			System.out.println("maximum key-value pair "+max+"-"+hashmap1.get(max));	

	}

}
