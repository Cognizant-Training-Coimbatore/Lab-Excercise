package packA;

import packB.prg1_qn1_protected_field;

class prg1_qn1_protected_field_sub1 extends prg1_qn1_protected_field
{
	void display()
	{
		System.out.println(name);
	}
}

public class prg1_qn1_protected_field_sub 
{

	public static void main(String[] args) 
	{
		prg1_qn1_protected_field Obj = new prg1_qn1_protected_field();
		Obj.putValues();
		Obj.printValues();
		
	}
}
