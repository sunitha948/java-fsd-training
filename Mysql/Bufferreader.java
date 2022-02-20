package training_java;
import java.io.*;

public class Bufferreader {
   public static void main(String[] args)throws Exception
   {
	   FileReader f=new FileReader("D:sampleoutputWriter.txt");
	   BufferedReader bf=new BufferedReader(f);
	   int i;
	   while((i=bf.read())!=-1)
	   {
		   System.out.println((char)i);
	   }
	   
   }
}
