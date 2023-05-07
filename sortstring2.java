import java.util.Arrays;
public class sortstring2
{
	public static void main(String[] args) 
	{
		String s1="hi welcome to hefshine";

		String[] s2=s1.split(" ");

		for(int i=0;i<s2.length;i++)
		{
			for(int j=i+1;j<s2.length;j++)
			{
				if(s2[i].length()>s2[j].length())
				{
					String temp=s2[i];
					s2[i]=s2[j];
					s2[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(s2));
		
	}
}

/*

[hi, to, welcome, hefshine]

*/