class str1
{
	String s1="JAVA";
	String s2="application";
	void addTwoStr()
	{
		System.out.println(s1.concat(s2));
	}
	void lower()
	{
		System.out.println(s1.toLowerCase());
	}
	void vowel()
	{
		int count=0;
		for(int i=0;i<s2.length();i++)
		{
		
			char c= s2.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
			}
			
		}
		System.out.println(count);
	}
}
public class str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		str1 obj=new str1();
		obj.addTwoStr();
		obj.lower();
		obj.vowel();
	}

}
