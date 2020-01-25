class string_handler{
	String s1="DONA",s2="MICHAEL";
	int count=0;
	String concat()
	{
		return (s1+" "+s2);
	}
	void vowel()
	{
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				count=count+1;
			}
			
		}
		System.out.println("Number of vowels:"+count);
	}
	String lowercase()
	{
		return (s2.toLowerCase());
	}
	
	}
public class program28_string_handler {

	public static void main(String[] args) {
		string_handler st=new string_handler();
		System.out.println("String concatenated:"+st.concat());
		System.out.println("String in lowercase:"+st.lowercase());
		st.vowel();
	}

}
