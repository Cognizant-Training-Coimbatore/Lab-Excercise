import java.util.Scanner;

class stringhandler{
	String str1,str2;
	
	void handle(String str1,String str2)
	{ String a;
	 int count=0,i;
	    a=str1+str2;
	    a=a.toLowerCase();
	    for(i=0;i<a.length();i++)
	    {
	    	if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'
	    			||a.charAt(i)=='o'||a.charAt(i)=='u') {
	    		count++;
	    	}
	    }
	 
		System.out.println("Addition of 2 strings are:"+a);
		System.out.println("No of vowels are:"+count);
		
		
		System.out.println("Lower case:"+a.toLowerCase());
	}
	
}
public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        stringhandler obj=new stringhandler();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 2 strings:");
        obj.str1=input.nextLine();
        obj.str2=input.nextLine();
        obj.handle(obj.str1,obj.str2);
        
	}

}
