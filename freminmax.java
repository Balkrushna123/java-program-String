//using string find frequency of unique element using duplicate remove and find min and max

public class freminmax
{
	public static void main(String[] args) 
	{
		String s1="abcdabaabc";

		int max=Integer.MIN_VALUE;

		char ch=0;  //create new varaibale for max
		char ch1=0;//create new varaible for min
		int min=Integer.MAX_VALUE;

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
				if(count2>max)  //find maximum element
				{
					max=count2;
					ch=s1.charAt(i);////print which alphabte number is greater
				}
				if(count2<min) //to fins min element
				{
					min=count2;
					ch1=s1.charAt(i);//print which alphabte number is minimum
				}
				
			}
		}
		System.out.println("the max element is:"+ch+" "+"the max number is:"+max);
		System.out.println("the min element is:"+ch1+" "+"the min number is:"+min);
		
	}
}

/*

the max element is:a the max number is:4
the min element is:d the min number is:1

*/