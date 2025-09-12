/*
*****
*   *
*****
*/

public class Pattern2
{
	public static void main(String x[])
	{
		int i,j,n=5;
		boolean f=false;
		
		for(i=0;i<3;i++)
		{	for(j=0;j<5;j++)
			{
				
				if(j>0&&j<4&&i==1)
				{
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println("\n");
		}
	}
}