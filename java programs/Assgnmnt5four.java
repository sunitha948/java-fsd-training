package training_java;
import java.util.*;
public class Assgnmnt5four {
   public static void main(String[] args)
   {
	   System.out.println("enter the size of the array");
	   Scanner sc=new Scanner(System.in);
	   int size=sc.nextInt();
	   String[] array=new String[size];
	   System.out.println("enter the string value of the array");
	   for(int i=0;i<size;i++)
	   {
		   array[i]=sc.next();
	   }
	   System.out.print("inputed array is:");
	   for(int i=0;i<size;i++)
	   {
		   System.out.print(array[i]+",");
	   }
	   System.out.println(" ");
	   System.out.print("reversed array is:");
	   for(int i=size-1;i>=0;i--)
	   {
		   System.out.print(array[i]+",");
	   }
   }
}
