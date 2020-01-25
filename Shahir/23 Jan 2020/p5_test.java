class string_handler
{
	String s1="ShaHir";
	String s2="Mubarak";
	void one()
	{
		String a=s1+s2;
		System.out.println(a);
		System.out.println(s1.toLowerCase());
		System.out.print("Number of  Vowels in the string: " + count_Vowels(a)+"\n");
	}
	 public static int count_Vowels(String str)
	    {
	        int count = 0;
	        for (int i = 0; i < str.length(); i++)
	        {
	            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
	                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
	            {
	                count++;
	            }
	        }
	        return count;
	    }
}
public class p5_test
{
	public static void main(String[] args)
	{
		string_handler sh = new string_handler();
		sh.one();
	}
}