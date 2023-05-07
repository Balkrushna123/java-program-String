/*
ProblemStatement
Write a program to return the sum of the digits present in the given string.If there is no digits the 
sum return is 0.
*/

public class MyClass5 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1="a2ba1ca3d";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//WriteCode Here
		int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				int num=s1.charAt(i)-48;
				sum=sum+num;
			}
		}
		System.out.println(sum);
	}
}