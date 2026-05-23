import java.util.*;
class Decode_String_394
 {
    public static void main(String[] args) {
       System.out.print(decodeString("2[a3[abc]]")); 
    }
    public static String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currentStr = new StringBuilder();
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
              
                k = k * 10 + (ch - '0');
            } 
            else if (ch == '[') {
               
                numStack.push(k);
                strStack.push(currentStr);
                k = 0;
                currentStr = new StringBuilder();
            } 
            else if (ch == ']') {
                StringBuilder decodedStr = strStack.pop();
                int repeatTimes = numStack.pop();
                
                for (int j = 0; j < repeatTimes; j++) {
                    decodedStr.append(currentStr);
                }
                currentStr = decodedStr;
            } 
            else {
                currentStr.append(ch);
            }
        }
        return currentStr.toString();
    }
}