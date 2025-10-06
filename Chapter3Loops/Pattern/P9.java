/*
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * *

*/

public class P9
{   public static void main(String x[])
    {  for(int i=1; i<=5; i++)
		{  boolean flag=true;
	       for(int j=1; j<=9; j++)
			{
			   if(j>=6-i && j<=4+i && flag)
			   { System.out.printf("*");
		          flag=false;
			   }
			   else
			   { System.out.printf(" ");
		         flag=true;
			   }
			}
			System.out.printf("\n");
		}
    }
}

	
