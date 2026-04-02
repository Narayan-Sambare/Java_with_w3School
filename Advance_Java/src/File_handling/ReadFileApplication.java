package File_handling;

import java.io.*;
public class ReadFileApplication
{
   public static void main(String x[])throws Exception
   {
    FileInputStream fr=new FileInputStream("C:\\Users\\Chetan M Dhamgunde\\Desktop\\test\\SANKET.jpg");
	FileOutputStream fw = new FileOutputStream("C:\\Users\\Chetan M Dhamgunde\\Desktop\\test\\new_file_handling\\SANKET.jpg");
	int data;
	while((data=fr.read())!=-1)
	{  
      fw.write(data);
	}
	  fw.close();
	  fr.close();
   }
}

