package training_java;
import java.io.*;
public class BufferwriterExample {
   public static void main(String[] args)throws IOException
   {
	   FileWriter fw=new FileWriter("D:testout.txt");
			   BufferedWriter buffer=new BufferedWriter(fw);
			   buffer.write("It's 31st january");
			   		buffer.close();
			   		System.out.println("success");
   }
}
