package packB;
import packA.qn1_session;

	

	class test2 extends qn1_session{
		void display() {
			System.out.println(empname);
		}
		
	}

	public class qn_1_session2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

				test2 empobj=new test2();
				empobj.display();
		}

	}


