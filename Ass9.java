public class Ass9
{
	public static void main(String[] args) 
	{
		String s1="123456";
		int count=0;

		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				count++;
			}
		}
		
		if(count==s1.length())
		{
			System.out.println("the number is digit : "+count);
		}
		else
		{
			System.out.println("not digit");
		}	
	}
}

/*

the number is digit : 6

*/