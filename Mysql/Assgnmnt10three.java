package training_java;
import java.io.*;
import java.util.*;
public class Assgnmnt10three {
    public static void main(String[] args)
    {
    	System.out.println("Enter the array size:");
    	Scanner sc=new Scanner(System.in);
    	int size=sc.nextInt();
    	System.out.println("Enter the array 1 elements:");
    	int[] arr1=new int[size];
    	for(int i=0;i<size;i++)
    	{
    		arr1[i]=sc.nextInt();
    	}
    	System.out.println("Enter the array 2 elements:");
    	int[] arr2=new int[size];
    	for(int i=0;i<size;i++)
    	{
    		arr2[i]=sc.nextInt();
    	}
    	System.out.println("Sum of the araay elements :");
    	int[] arr3=new int[size]; 
    
    	int sum=0;
    	for(int i=0;i<size;i++)
    	{
    		arr3[i]=(arr1[i]+arr2[i]);
    	}
    	System.out.print("[");
    	for(int i=0;i<size;i++)
    	{
    		System.out.print(arr3[i]+",");
    	}
    	System.out.println("]");
    	System.out.println("");
    	for(int l=0;l<size;l++)
    	{
    		int min_idx=l;
    		for(int j=l+1;l<size-1;l++)
    		{
    			if(arr3[min_idx]<arr3[j])
    				min_idx=j;
    		}
    		int temp=arr3[min_idx];
    		arr3[min_idx]=arr3[l];
    		arr3[l]=temp;
    	}
    	System.out.println("Sum of the array after selection sort is:");
    	System.out.print("[");
    	for(int k=0;k<size;k++)
    	{
    		System.out.print(arr3[k]+",");
    	}
    	System.out.print("]");
    }
}
