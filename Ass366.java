public class Ass36
{
	public static void main(String[] args) 
	{
		String s1="aaa";

		String s2="";

		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		boolean answer=s1.equals(s2);
		
		if(answer==true)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not palindroem");
		}
	}
}

/*

palindrome number

*/