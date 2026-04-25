class Can_Place_Flowers_605 {
    public static void main(String[] args) {
        System.out.print(canPlaceFlowers(new int []{1,0,0,0,1,0,}, 2));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    
        boolean left,right;
        for(int i=0;i<flowerbed.length;i++)
        {
            
           if(flowerbed[i]==0)
           {
                left=(i==0 || flowerbed[i-1]==0);
                right= (i==flowerbed.length-1 || flowerbed[i + 1]==0) ;

                if(left && right)
                {
                    flowerbed[i]=1;
                    n--;
                }
           }
           if(n<=0) return true;
        }
        
        return false ;
    }
}