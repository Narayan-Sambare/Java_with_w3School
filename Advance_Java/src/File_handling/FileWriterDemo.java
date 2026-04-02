package File_handling;

import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {

	FileWriter fw = new FileWriter("C:\\Users\\Chetan M Dhamgunde\\Desktop\\test\\new_file_handling\\test.txt");
			fw.write("i am sanket");
			fw.close();
	}

}
