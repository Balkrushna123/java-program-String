public class Ass999
{
	public static void main(String[] args) 
	{
		String s1="ab1d23a";

		int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')  //start with 0 and end with 9
			{
				int num=s1.charAt(i)-48;  48 means the ascii value of 0 is 48
				sum=sum+num;
			}
		}
		System.out.println("the sum of didgit in String:"+sum);	
	}
}

/*

the sum of didgit in String:6

*/