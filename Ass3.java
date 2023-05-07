//There are two types of create object in string 
//1) new keyword
//2) literal (means a create object and value is pass is called as literal object)
//ex String s1="xyz"; this are literal object

import java.util.ArrayList;
import java.util.Arrays;
public class Ass3
{
	public static void main(String[] args) 
	{
		String s1="bal76625@gmail.com";// string is always store all values like 1,hgh,1.2etc 

		for(int i=0;i<s1.length();i++) //s1.length() is a method
		{
			char ch=s1.charAt(i); //charAt(i) means the position of array s1 call this s1.charAt(i) then the value of aaray is print 
			System.out.println(ch);
		}
		
	}
}

/*

b
a
l
7
6
6
2
5
@
g
m
a
i
l
.
c
o
m


*/