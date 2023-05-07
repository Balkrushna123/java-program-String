/*

ProblemStatement
Write a program to get the length of a givenstring.
i/p :
String s1 ="abcd";
o/p :
a b c d 
length : 4
RestrictedKeyWordsInCode: blank

*/

public class MyClass3 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="abcd";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//write code here
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			count++;
			System.out.print(ch+" ");
		}
		System.out.println("\n"+count);
	}
}