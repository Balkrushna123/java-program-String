/*

ProblemStatement
Write a program to create a character array containing the contents of astring
i/p :"aabbccd";
o/p :a a b b c c d 

RestrictedKeyWordsInCode: toCharArray
*/

public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="aabbccd";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//write code here
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i)+" ");
		}
	}
}
