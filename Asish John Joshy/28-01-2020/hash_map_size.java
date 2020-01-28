package demo;

import java.util.HashMap;

public class hash_map_size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashmaparray=new HashMap<Integer,String>();
		{
		hashmaparray.put(1,"What");
		hashmaparray.put(2,"is");
		hashmaparray.put(3,"the");
		hashmaparray.put(4,"meaning");
		hashmaparray.put(5,"of");
		hashmaparray.put(6,"this?");
	}
	System.out.println(hashmaparray.size());
	}
}
