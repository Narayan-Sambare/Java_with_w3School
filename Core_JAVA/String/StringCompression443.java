// Input: chars = ["a","a","b","b","c","c","c"];
// 443. String Compression
class StringCompression443 {
   public static void main(String[] args) {
        char chars[] = {'a','a','b','b','c','c','c'};
        int res=compress(chars);
        for(int i=0;i<res;i++)
        {
            System.out.print(chars[i]+" ");
        }
   }
   
   public static int compress(char[] chars)
   {

        int read=0,write=0;
        while (read< chars.length)
        {
            char ch=chars[read];
            int count=0;
            while ( read < chars.length && ch == chars[read]) {
                count++;
                read++;
            }
            if(count == 1 ) 
            {   
                chars[write++] = ch;                

            }else if (count >1) 
            {   
                chars[write++] = ch;
                String str=Integer.toString(count);
                for(int i=0;i<str.length();i++)
                {
                    chars[write++] = str.charAt(i);
                }
                
            }             
            
        }

        return write;
    }

}