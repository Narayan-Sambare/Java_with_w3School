package File_handling;
import java.io.*;
public class CreateFile {

	public static void main(String[] args) {

        File f = new File("C:\\Users\\Chetan M Dhamgunde\\Desktop\\test\\new_file_handling");
        if (!f.exists()) {
            f.mkdir();
            System.out.println("Folder Created");
        } else {
            System.out.println("Already Exists");
        }
    }
}