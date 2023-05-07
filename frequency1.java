//using string find frequency of unique element using duplicate remove

public class frequency1
{
	public static void main(String[] args) 
	{
		String s1="abcdabaabc";

		for(int i=0;i<s1.length();i++)
		{
			int count=0;
			for(int j=0;j<i;j++)
			{
				if(s1.charAt(i)==s1.charAt(j)) //check the number is duplicate or not
				{
					count++;
				}
			}
			if(count==0)
			{
				int count2=0;
				for(int k=0;k<s1.length();k++)
				{
					if(s1.charAt(i)==s1.charAt(k)) //element is i==k then count2++
					{
						count2++; //count2 means it is count unique element
					}
				}
				System.out.println(s1.charAt(i)+" "+count2);
			}
		}
		
	}
}

/*

a 4
b 3
c 2
d 1

*/