package File_handling;

import java.io.*;
public class FileClassDemo {
	    public static void main(String[] args) throws Exception {
	        File f = new File("C:\\Users\\Chetan M Dhamgunde\\Desktop\\test\\new_file_handling\\demo");

	        if (f.createNewFile()) {
	            System.out.println("File created");
	        }else
	        {
	            System.out.println("File allready present");
	        }      
	        
	        System.out.println("isDirectory : " + f.isDirectory());
	        System.out.println("isFile : " + f.isFile());
	        System.out.println("file path: " + f.getAbsolutePath());
	       
	        System.out.println("Exists: " + f.exists());
	        System.out.println("Name: " + f.getName());
	    }
	}
