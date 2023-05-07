import java.util.Arrays;
public class sortstring1
{
	public static void main(String[] args) 
	{
		String[] sa={"Hi","welcome","to","hefshine"};

		for(int i=0;i<sa.length;i++)
		{
			for(int j=i+1;j<sa.length;j++)
			{
				String s1=sa[i];
				String s2=sa[j];

				if(s1.compareToIgnoreCase(s2)>0) //it means ther capital letter ans small letter are sam

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

[hefshine, Hi, to, welcome]

*/