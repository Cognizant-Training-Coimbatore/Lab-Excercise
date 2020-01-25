package packA;

public class series4_1_protected {
	
		protected int st_rollno;//visibility only within the class
		String st_name;
		int marks;
		void putvalues()
		{
			st_rollno=10;
			st_name="dona";
			marks=100;
			
		}
		void printValues()
		{
			System.out.println("Student name:"+st_name);
			System.out.println("student rollno:"+st_rollno);
			System.out.println("marks:"+marks);
		}

	}


