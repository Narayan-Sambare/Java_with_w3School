// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class ToLowerCase_709 {
   public static void main(String[] x) {
      String s = "HELLO Sanket";
      System.out.print(toLowerCase(s));
   }

   public static String toLowerCase(String s) {
      StringBuffer str = new StringBuffer();

      for(int i = 0; i < s.length(); i++) 
      {
         if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') 
         {
            str.append((char)(s.charAt(i) + 32));
         } else {
            str.append(s.charAt(i));
         }
      }

      return str.toString();
   }
}
