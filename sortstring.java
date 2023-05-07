//sort string by alphabatical order by using array
import java.util.Arrays;
public class sortstring
{
	public static void main(String[] args) 
	{
		String[] sa={"hi","welcome","to","hefshine"};

		for(int i=0;i<sa.length;i++)
		{
			for(int j=i+1;j<sa.length;j++)
			{
				String s1=sa[i];
				String s2=sa[j];

				if(s1.compareTo(s2)>0) //or if(s1.compareTo(s2)>0)//it means the capital letter and small letter are different 

				{
					String temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(sa));	
	}
} 

/*

[hefshine, hi, to, welcome]

*/