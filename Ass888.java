//remove duplicate element in array
public class Ass888
{
	public static void main(String[] args) 
	{
		String s="abcdabcaba";
		char ch1='a';
		char[] ch=s.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=ch1)
			{
				System.out.print(ch[i]);
			}
		}
		
	}
}

/*

bcdbcb

*/