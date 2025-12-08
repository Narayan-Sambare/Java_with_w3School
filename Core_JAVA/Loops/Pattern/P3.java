
/*

* * * * *
* * * *
* * *
* *
*

*/
public class P3
{
	public static void main(String x[])
	{

		int i,j,n=5;

		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{ 
				if(i<=j)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}