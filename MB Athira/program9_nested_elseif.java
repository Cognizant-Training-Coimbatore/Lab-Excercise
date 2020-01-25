
public class program9_nested_elseif {

	public static void main(String[] args) 
	{
		int marks =90;
		if(marks>85&& marks<=100)
		{
			System.out.println("Grade A");
		}
		else if(marks>75 && marks<=85)
		{
			System.out.println("Grade B");
		}
		else if(marks>65 && marks<=75)
		{
			System.out.println("Grade C");
		}
		else if(marks>55 && marks<=65)
		{
			System.out.println("Grade D");
		}
		else if(marks>20 && marks<=55)
		{
			System.out.println("Grade E");
		}
		else
		{
			System.out.println("FAIL");
		}
	}

}
