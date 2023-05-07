import java.util.*;
public class startend
{
	public static void main(String[] args) 
	{
		String s1="abcdc";
		String s2="abc";

		boolean startsWith=s1.startsWith(s2); //startsWith this function is check the given string(s1) is start with s2
		System.out.println(startsWith);

		boolean endsWith=s1.endsWith(s2);//endssWith this function is check the given string(s1) is end with s2
		System.out.println(endsWith);	
	}
}

/*

true
false

*/