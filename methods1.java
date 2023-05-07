public class methods1
{
	public static void main(String[] args) 
	{
		String s1="cbba";
		String s2="dcba";

		char ch=s1.charAt(0);
		System.out.println(ch);

		int codePointAt=s1.codePointAt(1);
		System.out.println(codePointAt);

		int codePointBefore=s1.codePointBefore(1); //print before element for ex.user input is 1 then the this meyhod return before elemnt or ascii value
		System.out.println(codePointBefore);

		int ans=s1.compareTo(s2); //compare two strings 1st string is small then return -1.then 2nd string is small retuen 1
		//and then two strings are equal then 0 return 
		System.out.println(ans);
		
	}
}

/*

c
98
99
-1
/*