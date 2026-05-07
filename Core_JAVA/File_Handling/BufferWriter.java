package File_handling;

import java.io.*;

public class BufferWriter {
	public static void main(String x[]) throws IOException, InterruptedException
	{
		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
		bw.write("Fast writing");
		bw.newLine();
		bw.write("Second line");
		bw.close();
		FileReader r =new FileReader("test.txt");
		
		int i;
		while ((i = r.read()) != -1) {
		    System.out.print((char)i+" ");
		    Thread.sleep(1000);
		}
		
		r.close();
	}
}
