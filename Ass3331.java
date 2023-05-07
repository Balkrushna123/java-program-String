public class Ass3331
{
	public static void main(String[] args) 
	{
		String s1="abcdefg";
		String s2="";


		for(int i=0;i<s1.length();i++)
		{
			s2=s2.concat(s1.charAt(i)+""+(s1.charAt(i))); //inbuilt method (concat)

		}
		System.out.println(s2);
		
	}
}

/*

aabbccddeeffgg

*/