/*
ProblemStatement
Write a program to remove a specified character from a givenstring.
i/p :
String s="Aabcd";
Char ch='a';
o/p :Abcd

*/

public class MyClass4 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1="Aabcd";
		char ch='a';
		myCode(s1,ch);
	}
	//EndOfMainMethod
	private static void myCode(String s1,char ch) 
	{
		//WriteCode Here
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=ch)
			{
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
	}
}
