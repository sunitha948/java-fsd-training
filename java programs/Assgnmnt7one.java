package training_java;
import java.util.*;
public class Assgnmnt7one {
     public static void main(String[] args)
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter the size of the array:");
    	 int size=sc.nextInt();
    	 String[] array1=new String[size];	
    	 System.out.print("enter the integer elements:");
    	 for(int i=0;i<size;i++)
    	 {
    		 array1[i]=sc.next();
    	 }
    	 int array2[]=new int[size];
    	 for(int i=0;i<size;i++)
    	 {
    		array2[i]=Integer.parseInt(array1[i]);
    	 }
    	 int sum=0;
    	 for(int j=0;j<size;j++)
    	 {
    		 sum=sum+array2[j];
    	 }
    	 System.out.print("sum of the array elements = "+sum);
     }
}
