package training_java;
import java.util.*;
public class Assgnmnt6three {
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("input the string");
    	String str=sc.nextLine();
    	char[] ch=new char[str.length()];
    	char[] ch1=new char[str.length()];
    	for(int i=0;i<str.length();i++)
    	{
    		ch[i]=str.charAt(i);
    	}
    	for(int i=0;i<str.length();i++)
    	{
    		System.out.print(ch[i]+",");
    	}
    	System.out.println("");
    	System.out.print("reversed character array :");
    	for(int i=str.length()-1;i>=0;i--)
    	{
    		
    		   System.out.print(ch[i]+",");
    		   
    		}
    	}
    	
    	
    }
}
