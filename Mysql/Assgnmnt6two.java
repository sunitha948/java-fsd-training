package training_java;
import java.util.*;
public class Assgnmnt6two {
       public static void main(String[] args)
       {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("String:");
    	   String str=sc.nextLine();
    	   System.out.println("no of characters:");
    	   int len=sc.nextInt();
    	   char[] array=new char[len];
    	   System.out.println("enter the characters:");
    	   for(int i=0;i<len;i++)
    	   {
    		   array[i]=sc.next().charAt(0);
    	   }
    	   for(int i=0;i<array.length;i++)
    	   {
    		   int rslt=str.indexOf(array[i]);
    		   if(rslt!=-1)
    		   {
    			   System.out.println(array[i]+"is present");
    		   }
    		   else
    			   System.out.println(array[i]+"is not present");
    	   }
       }
}
