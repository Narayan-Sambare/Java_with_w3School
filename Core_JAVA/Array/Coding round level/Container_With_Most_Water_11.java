class Container_With_Most_Water_11 
{
    public static void main(String[] args) {
        System.out.print(maxArea1(new int[]{1,8,3,4,5,6,7}));
    }
    static {
        for (int i = 0; i < 100; i++) {
            maxArea(new int[] { 0, 0 });
        }   
    }
    public static int maxArea(int[] height) 
    {
        int left = 0, right = height.length -1, area = 0, maxArea = 0;
        while (left < right){
            int min = Math.min(height[left], height[right]);
            area = min * Math.abs(left - right);
            maxArea = Math.max(area, maxArea);

            while(left < right && height[left] <= min) left++;
            while(left < right && height[right] <= min) right--;
        }
        return maxArea;
    }

    public static  int maxArea1(int[] height) {
        
        int maxWater=0;
        int l=0,r=height.length-1;
        int area=0,h=0,w=0;
        while(l<r)
        {
            h= Math.min(height[l],height[r]);
            w= r-l;
            area=h*w;
            maxWater=Math.max(area,maxWater);
            while(height[l]>height[r]) r--;
            while(height[l]<height[r]) l++;
                
        }
        return maxWater;
    }
}