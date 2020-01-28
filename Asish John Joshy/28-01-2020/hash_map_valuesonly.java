package demo;

import java.util.HashMap;

public class hash_map_valuesonly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashmapval=new HashMap<Integer,String>();
		{
			hashmapval.put(1,"Where");
			hashmapval.put(2,"is");
			hashmapval.put(3,"everyone");
			hashmapval.put(4,"going");
			hashmapval.put(5,"now?");
	    }
	System.out.println(hashmapval.values());
	}

}
