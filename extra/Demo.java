public class Demo{
	public static void main(String x[])
	{
		int a[]={1,2,3,4,5};
		int i=0,j=0, sum=0,size=0;
		int target=11;
		
		while(j<a.length)
        {   sum=sum+a[j];
            if(sum < target)
            {   
                size++;
            }
            else if(sum > target)
            {    
                
				while(target<sum)
				{
					sum=sum-a[i];
					i++;
					size--;
				}	
            }
			j++;
        }
		System.out.print(size);
	}
}

