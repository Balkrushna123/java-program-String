public class Ass5
{
	public static void main(String[] args) 
	{
		String s1="abcdaba";
		int index=4;
		char[] ch=s1.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			if(i==index)
			{
				System.out.println(ch[i]);
			}
		}
		
	}
}

/*

a

*/