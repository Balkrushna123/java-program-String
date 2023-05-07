public class Ass99999
{
	public static void main(String[] args) 
	{
		String s1="43521";

		char[] a=s1.toCharArray();

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					char temp=a[i];  
				    a[i]=a[j];
				    a[j]=temp;
			    }
			}	
		}
		
		String s2=new String(a); //conver char array to string with passing by object.a is a char aaray.pass array by new keyword
		System.out.print(s2);  //print s2 s2is a string not array
	}
}

/*

12345

*/