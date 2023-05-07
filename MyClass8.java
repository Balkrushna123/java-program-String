/*
ProblemStatement
Write a program to test if a given string contains only digits
i/p :
String s1 ="1f23";
o/p
not contains only digit :

*/


public class MyClass8
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="1f23";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//write code here
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)>='9')
			{
				count++;
			}
		}
		if(count==s1.length())
		{
			System.out.println("contains only digit");
		}
		else
		{
			System.out.println("not contains only digit");
		}
	}
}