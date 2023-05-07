/*

ProblemStatement
Write a program to repeat each of the character twice in a given string.
i/p :
String s="abc";
o/p :
aabbcc

*/

import java.util.Arrays;
import java.util.Iterator;
public class MyClass6 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "welcome";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//WriteCode Here
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			s2=s2+s1.charAt(i)+s1.charAt(i);;
		}
		System.out.println(s2);
	}
}