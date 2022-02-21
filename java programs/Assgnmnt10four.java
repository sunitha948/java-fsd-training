package training_java;

import java.util.Scanner;
import java.util.ArrayList;
public class Assgnmnt10four {
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
    	System.out.println("Similar elements :");
    
    	ArrayList<Integer> arr3=new ArrayList<Integer>();
    	for(int i=0;i<size;i++)
    	{
    		for(int j=0;j<size;j++)
    		{
        		if(arr1[i]==arr2[j])
    			  arr3.add(arr1[i]);
        		
        			
    		}
    	}
    	
        System.out.println(arr3);
        int len=arr3.size();
    	Integer[] arr4=new Integer[len];
    	arr4=arr3.toArray(arr4);
    	for(int i=0;i<len;i++)
    	{
    		for(int j=0;j<len-1-i;j++)
    		{
    			if(arr4[j+1]<arr4[j])
    			{
    				int temp=arr4[j+1];
    				arr4[j+1]=arr4[j];
    				arr4[j]=temp;
    			}
    		}
    	}
    	System.out.println("after bubble sort is:");
    	System.out.print("[");
    	for(int i=0;i<len;i++)
    	{
    		System.out.print(arr4[i]);
    	}
    	System.out.println("]");
    }
}
