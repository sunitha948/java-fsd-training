package training_java;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Charfileread {
	public static void main(String[] args)throws IOException
     {
    	 FileReader fr=new FileReader("D:sampleoutputWriter.txt");
    	 char[] arr=new char[10];
     	fr.read(arr,0,5);
     	for(char c:arr)
     	{
     		System.out.println(c);
     	}
     	System.out.println("Reading character by character");
    	int i;
    	while((i=fr.read())!=-1)
    	{
    		System.out.print((char)i);
    	}
    	 fr.close();
    	System.out.println("success");
	}
}
