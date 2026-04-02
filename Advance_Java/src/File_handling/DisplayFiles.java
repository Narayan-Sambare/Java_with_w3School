package File_handling;
import java.io.*;
public class DisplayFiles {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\Chetan M Dhamgunde\\Desktop\\test\\new_file_handling");
		File list[]=f.listFiles();
		
		for(Object obj: list)
		{
			System.out.println(obj);
		}
	}

}
