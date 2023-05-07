/*
Write a program to sort numbers in a String. Display the result as aString.
E.g. if number in String is “43521” result is: “12345”.

i/p :
String s1="43521";
o/p :
12345

*/

import java.util.Arrays;
import java.util.Iterator;
public class MyClass1 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "43521";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//WriteCode Here
		char[] a=s1.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		String s2=new String(a);
		System.out.println(s2);
	}
}