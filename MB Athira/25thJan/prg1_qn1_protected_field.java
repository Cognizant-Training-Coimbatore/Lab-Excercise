package packB;

	public class prg1_qn1_protected_field
	{
		int age;
		protected String name;
		int phone;
		
		public void putValues()
		{
			age = 23;
			name = "Dona Michael";
			phone = 2411789;
		}
		
		public void printValues()
		{
			System.out.println("Age : "+age);
			System.out.println("Name : "+name);
			System.out.println("LandLine : "+phone);
		}
	}
	
	