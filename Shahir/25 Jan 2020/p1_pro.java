package packB;

import packA.p1_protect;

class people extends p1_protect
{
	void print()
	{
		System.out.println(salary);
	}
}

public class p1_pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		people p = new people();
		p.print();
	}

}
