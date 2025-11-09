// Q2. Write program to create class name as CheckChar with two functions
//         void setChar(char ch): this function accept single character as input
//       boolean checkChar(): this function can check character is alphabet or digit of special     symbol if
//      character is alphabet or digit return true if character is digit then return false.

public class Q2 
{
    public static void main(String x[]) {
        CheckChar check = new CheckChar();
        check.setChar('4');
        boolean result= check.checkChar();
        if(result)
        {
            System.out.println("Is  Alphabet: ");
        }
       else
        {
            System.out.println("Is not Alphabet: ");
        }
        
    }
}
class CheckChar 
{
    private char character;

    void setChar(char ch) {
        this.character = ch;
    }

    boolean checkChar()
     {
        if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {
            return true;
        } else {
            return false;
        }
        
    }
}
    