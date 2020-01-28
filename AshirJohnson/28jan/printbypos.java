package helloworld;

import java.util.ArrayList;

public class printbypos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		int i;
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		for(i=0;i<4;i++)
		{
			System.out.println(a.get(i));
		}
	}

}
