public class Ass9999
{
	public static void main(String[] args) 
	{
		String s1="43521";

		char[] a=s1.toCharArray();

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					char temp=a[i];  //the given number is string then we use char  
				    a[i]=a[j];
				    a[j]=temp;
			    }
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}	
	}
}

/*

1 2 3 4 5

*/
