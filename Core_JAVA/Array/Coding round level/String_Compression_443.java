class String_Compression_443
{
    public static void main(String[] args) {
        char ch[]=new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int size=compress1(ch);
        for(int i=0;i<size;i++)
        {
            System.out.print(ch[i]);
        }
    }
    public static int compress(char[] chars)
    {
        int idx=0,i=0;  
        while(i<chars.length)
        {
            char ch=chars[i];
            int count=0;
            while(i<chars.length && chars[i]== ch )
            {
                count++;
                i++;
            }
            chars[idx++]=ch;
            if(count>1)
            {   for(char c:Integer.toString(count).toCharArray())
                {
                    chars[idx++]=c;
                }
            }
        }       
    return idx;
    }

    public static int compress1(char[] chars) {
        int index = 0;
        char curchar = chars[0];
        int size = 1;
        for (int i = 1; i < chars.length; i++) {

            if(chars[i] == curchar)
            {
                size++;
            }
            else{

                chars[index++] = curchar;
                if (size != 1) 
                {
                    if (size >= 1000) 
                    {
                        chars[index++] = (char)(size / 1000 + '0');
                        chars[index++] = (char)(size % 1000 / 100 + '0');
                        chars[index++] = (char)(size % 100 / 10 + '0');
                        chars[index++] = (char)(size % 10 + '0');
                    } else if (size >= 100) {
                        chars[index++] = (char)(size / 100 + '0');
                        chars[index++] = (char)(size % 100 / 10 + '0');
                        chars[index++] = (char)(size % 10 + '0');
                    } else if (size >= 10) {
                        chars[index++] = (char)(size / 10 + '0');
                        chars[index++] = (char)(size % 10 + '0');
                    } else {
                        chars[index++] = (char)(size % 10 + '0');
                    }
                }
                curchar = chars[i];
                size = 1;
            }
        }
        chars[index++] = curchar;
        if (size != 1) {
            if (size >= 1000) {
                chars[index++] = (char)(size / 1000 + '0');
                chars[index++] = (char)(size % 1000 / 100 + '0');
                chars[index++] = (char)(size % 100 / 10 + '0');
                chars[index++] = (char)(size % 10 + '0');
            } else if (size >= 100) {
                chars[index++] = (char)(size / 100 + '0');
                chars[index++] = (char)(size % 100 / 10 + '0');
                chars[index++] = (char)(size % 10 + '0');
            } else if (size >= 10) {
                chars[index++] = (char)(size / 10 + '0');
                chars[index++] = (char)(size % 10 + '0');
            } else {
                chars[index++] = (char)(size % 10 + '0');
            }
        }
        return index;
    }
}