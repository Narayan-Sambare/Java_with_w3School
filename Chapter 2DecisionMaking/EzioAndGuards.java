/*
Q47. Ezio can manipulate at most XX number of guards with the apple of Eden.
Given that there are a YY number of guards, predict if he can safely manipulate all of them.
Input Format
The first line will contain TT, the number of test cases. Then the test cases follow. Each test case contains a single line of input, two integers XX and YY. Output Format
For each test case, print text {YES} YES if it is possible for Ezio to manipulate all the guards. Otherwise, print text {NO} NO.
 
You may print each character of the string in uppercase or lowercase
(For example, the strings text {Yes} YeS, text {yEs} yEs, \text {yes}yes and \text {YES}YES will all be treated as identical).
 
Constraints
1<=T<=100
1<=X<=Y
 
Input         	Output
3
5 	7         	NO
6 	6         	YES
9  1           	YES
 
Explanation:
Test Case 11: Ezio can manipulate at most 55 guards. Since there are 77 guards, he cannot manipulate all of them. 
Test Case 22: Ezio can manipulate at most 66 guards. Since there are 66 guards, he can manipulate all of them.
Test Case 33: Ezio can manipulate at most 99 guards. Since there are only 11 guards, he can manipulate the guard.
*/
import java.util.Scanner;

public class EzioAndGuards {
    public static void main(String  x[]) {
        Scanner scanner = new Scanner(System.in);
		    System.out.printf("Ezio Can Manipulate How Much Gaurds:");
            int X = scanner.nextInt();
		    System.out.printf("There Are How Many Gaurds:");
            int Y = scanner.nextInt();  

            if (X >= Y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
    }
}
