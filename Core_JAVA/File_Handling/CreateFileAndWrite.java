//Q1. Write a Java program to create a text file named info.txt and write the message "Welcome to Java File Handling" into it.
//Explanation
//This program helps you understand how to create a file and write data into it using Java file handling classes.
//What to Do :- 
//Create a file
//Write a simple text message
//Close the file properly
//Expected Learning :- 
//File class
//FileWriter class

package File_handling;
import java.io.*;
public class CreateFileAndWrite {
	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("C:\\Users\\Chetan M Dhamgunde\\Desktop\\test\\new_file_handling\\test.txt");
//		f.append("sanket");
//		f.write("hello iam sdanket");
		f.write("sanket");
		System.out.println();
		FileReader r=new FileReader("C:\\Users\\Chetan M Dhamgunde\\Desktop\\test\\new_file_handling\\test.txt");
		
		int c;
		while((c=r.read())!=-1)
		{
			System.out.print((char)c);
		}
		
		
	}

}
