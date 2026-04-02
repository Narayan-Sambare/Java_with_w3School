package File_handling;

import java.io.*;
public class FileInputStreamDemo {
   public static void main(String x[])throws Exception
   {
//	   FileReader f= new FileReader("C:\\Users\\Chetan M Dhamgunde\\Desktop\\test\\new_file_handling\\text.txt");
      FileInputStream istream = new FileInputStream("C:\\Users\\Chetan M Dhamgunde\\Desktop\\test\\new_file_handling\\test.txt");
	  int data;
	  while((data=istream.read())!=-1)
	  {
	       char ch=(char)data;
		   System.out.print(ch);
	  }
   }
}
