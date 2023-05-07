//usnig char array in string and find frequency of unique element using duplicate element

public class frequency
{
	public static void main(String[] args) 
	{
		String s1="abcdabcaba";
		char[] a=s1.toCharArray();

		int i=0;

		for(i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				int count2=0;
				for(int k=0;k<a.length;k++)
				{
					if(a[i]==a[k])
					{
					count2++;
				    }
				}
			
		
		System.out.println(a[i]+" "+count2);
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