package File_handling;
import java.io.*;
public class BufferReader {

	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		String line;

		while ((line = br.readLine()) != null) {
		    System.out.println(line);
		    Thread.sleep(1000);
		}
		br.close();
	}

}
