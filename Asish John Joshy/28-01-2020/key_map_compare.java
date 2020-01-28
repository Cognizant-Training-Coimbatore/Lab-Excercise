package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class key_map_compare {
	static void comparing(Map<Integer,String> a)
	{
		int b=0,s=1000;
		Set<Integer> x=a.keySet();
		for(int y:x)
		{
		if(y>b)
		{
			b=y;
		}
		if(y<s)
		{
			s=y;
		}
		}

		System.out.println("Smallest="+a.get(s));
		System.out.println("Largest="+a.get(b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		HashMap<Integer,String> a=new HashMap<Integer,String>();
		{
			a.put(1,"What");
			a.put(2,"is");
			a.put(3,"the");
			a.put(4,"meaning");
			a.put(5,"of");
			a.put(6,"this?");
		}
		
	comparing(a);
	

	}

}
