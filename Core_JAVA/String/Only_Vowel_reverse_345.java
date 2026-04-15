class Only_Vowel_reverse_345 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("sanketSambare"));
    }
    public static String reverseVowels(String s) {
        int l=0,r=s.length()-1;
        char arr[]=s.toCharArray();
       String vowels="aeiouAEIOU";
        while(l<r)
        {   while(l<r && vowels.indexOf(arr[l]) == -1)l++;
            while(l<r && vowels.indexOf(arr[r]) == -1)r--;
            char ch=arr[l];
            arr[l]=arr[r];
            arr[r]=ch;
            l++;
            r--;
        }
        return new String(arr);
    }
}