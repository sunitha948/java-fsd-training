package training_java;
import java.io.File;
import java.io.IOException;
public class FileCreate {
    public static void main(String[] args)
    {
    	File f1=new File("D:FileOperationExmple.txt");
    	try
    	{
    	if(f1.createNewFile())
    	{
    		System.out.println("the file "+f1.getName()+ " is created successfully");
    	}
    	else
    	{
    		System.out.println("the file "+f1.getName()+ " already exists");
    	}
    	}
    	catch(IOException e)
    	{
    		System.out.println("An unexpected error is occured");
    	}
    	System.out.println(f1.getAbsolutePath());
    	System.out.println("Is file writable?"+f1.canWrite());
    	System.out.println("Is file readable?"+f1.canRead());
    	System.out.println("Size of the file in bytes"+f1.length());
    }
}
