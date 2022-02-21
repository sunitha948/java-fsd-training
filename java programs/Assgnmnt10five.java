package training_java;

import java.util.*;
import java.util.Arrays;
public class Assgnmnt10five {
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
    	System.out.println("Disimilar elements :");
    	ArrayList<Integer> arr3=new ArrayList<Integer>();
    	int flag=0;
    	for(int i=0;i<size;i++)
    	{
    		for(int j=0;j<size;j++)
    		{
        		if(arr1[i]==arr2[j])
    			  flag=1;
        		
        			
    		}
    		if(flag==0)
    		{
    			arr3.add(arr1[i]);
    			
    		}
    		flag=0;
    	}
    	for(int i=0;i<size;i++)
    	{
    		for(int j=0;j<size;j++)
    		{
        		if(arr2[i]==arr1[j])
    			  flag=1;
        		
        			
    		}
    		if(flag==0)
    		{
    			arr3.add(arr2[i]);
    			
    		}
    		flag=0;
    	}
    	System.out.println(arr3);
    	int len=arr3.size();
    	Integer[] arr4=new Integer[len];
    	arr4=arr3.toArray(arr4);
    	for(int i=0;i<len;i++)
    	{
    		for(int j=0;j<len-1-i;j++)
    		{
    			if(arr4[j+1]>arr4[j])
    			{
    				int temp=arr4[j+1];
    				arr4[j+1]=arr4[j];
    				arr4[j]=temp;
    			}
    		}
    	}
    	
    	System.out.println("after bubble sort is:");
    	for(int i=0;i<len;i++)
    	{
    		System.out.println(arr4[i]);
    	}
    }
}
