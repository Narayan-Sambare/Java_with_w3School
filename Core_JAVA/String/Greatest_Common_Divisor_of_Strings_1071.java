class Greatest_Common_Divisor_of_Strings_1071 {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("sankket", "sanket"));
    }
    public static String gcdOfStrings(String str1, String str2) {
        if(str1.length() < str2.length())
            return gcdOfStrings(str2,str1);
        if(str1.equals(str2))
            return str1;
        if(str1.startsWith(str2))
            return gcdOfStrings(str1.substring(str2.length()),str2);
        return "";
    }
}