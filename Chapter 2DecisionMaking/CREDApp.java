/*
Q48. To access CRED programs, one needs to have a credit score of 750 or more.
Given that the present credit score is XX, determine if one can access CRED programs or not.
If it is possible to access CRED programs, output \text{YES}YES, otherwise output \text{NO}NO.
Input Format
The first and only line of input contains a single integer XX, the credit score.
Output Format
Print text{YES}YES if it is possible to access CRED programs. Otherwise, print \text{NO}NO.
You may print each character of the string in uppercase or lowercase (for example, the
strings text{YeS}YeS, \texttt{yEs}yEs, \texttt{yes}yes and \texttt{YES}YES will all be treated as identical).
 
Constraints
0<=X<=1000
 
Subtasks
• 	Subtask 1 (100 points): Original constraints.
Input         	Output
823           	YES
 
Explanation:
Since 823 > 750 , it is possible to access CRED programs.
Input         	Output
251                 No
 
Explanation
Since 251 < 750 it is not possible to access CRED Programs
*/

import java.util.*;
public class CREDApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the credit score:");
	int credit = sc.nextInt();
	if(credit>= 750){
	System.out.printf("Yes - it is possible to access CRED programs");
	}else{
	System.out.printf("No - not possible to access CRED Programs");
	}
	}
}