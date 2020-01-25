import java.util.*;
class stringhandler
{ 
	String s1="REVATHY", s2="RADHAKRISHNAN";
	int count=0;
	String concat()
	{
		return(s1+" "+s2);
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
		System.out.println("number of vowels in string "+s1+" is "+count);
	}
	
	String  lowercase()
	{
		return(s1.toLowerCase());
	}
	}
public class pgm5string {

	public static void main(String[] args) {
		stringhandler obj=new stringhandler();
		System.out.println("string concatenated "+obj.concat());
		System.out.println("to lowercase "+obj.lowercase());
		obj.vowel();
	}

}
