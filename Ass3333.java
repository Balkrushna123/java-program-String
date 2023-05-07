public class Ass3333
{
	public static void main(String[] args) 
	{
		String s1="abcdefg";
		String s2="";  //empty string and is default value is zero


		for(int i=0;i<s1.length();i++)
		{
			char s3=s1.charAt(i);  // this method is print for value not a index
			s2=s2+s3+s3;  //to use multiple character concate by + operator
			
		}
		System.out.println(s2);
		
	}
}

/*

aabbccddeeffgg

*/