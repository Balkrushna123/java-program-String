import java.util.*;
public class endwith2
{
	public static void main(String[] args) 
	{
		String s1="abcdabc";
		String s2="abc";		

		if(s1.length()>=s2.length()) 
		{
			int count=0;
			int s1index=s1.length()-1;
			int s2index=s2.length()-1;

		for(int i=s2.length()-1;i>=0;i--) 
		{	
				if(s2.charAt(s2index)==s1.charAt(s1index)) 
				{
					count++;
				}
				s1index--;
				s2index--;
		}
		if(count==s2.length())  
			System.out.println("true");
		else
			System.out.println("false");
	    }
	    else
	    System.out.println("false"); 
	}
}
