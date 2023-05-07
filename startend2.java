import java.util.*;
public class startend2
{
	public static void main(String[] args) 
	{
		String s1="abcdabc";
		String s2="acb";		

		if(s1.length()>=s2.length())  //if the s1 string is greater than s2 then enter in the for loop otherwise condtion false
		{
			int count=0;
		for(int i=0;i<s2.length();i++)//use for loop it ids execute if the s2 condition is true 
		{	
				if(s1.charAt(i)==s2.charAt(i)) //if s1==s2 then count++
					count++;
		}
		if(count==s2.length())  //check the count==0 it meqns the true
			System.out.println("true");
		else
			System.out.println("false");
	    }
	    else
	    System.out.println("false"); //the line number 9 condition is false then it is executed	
	}
}

/*

false

*/