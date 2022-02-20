package training_java;
import java.util.*;
public class Assgnmnt7three {
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("enter the no of characters in the array:");
    	int num=sc.nextInt();
    	char[] arr1=new char[num];
    	System.out.println("enter the characters to the array");
    	for(int i=0;i<num;i++)
    	{
    	  arr1[i]=sc.next().charAt(0);
    	}  
    	
    	
    	System.out.println("ASCII value of characters ");
    	for(int i=0;i<num;i++)
       	{
  	    	  int ascii=arr1[i];
  	    	  System.out.println(arr1[i]+" "+ascii);
      	}  
    }
}
