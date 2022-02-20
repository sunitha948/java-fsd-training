package training_java;
import java.util.*;
public class Assgnmnt5one {
	public static void main(String[]args)
	{
		System.out.println("Enter the size of the array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr1=new int[size];
		System.out.println("enter the integer Araay elements:");
		for(int i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Araay is :");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println("");
		int[] arr2=new int[size];
		System.out.println("Duplicate elements are:");
		
		for(int i=0;i<arr1.length;i++)
		{
			
			for(int j=i+1;j<arr1.length;j++)
			{
				bb:
				if(arr1[j]==arr1[i])
				{
					
					for(int k=0;i<size;k++)
					{
					if(arr2[k]==arr1[i])
						break bb;
					else
						arr2[k]=arr1[i];
					    System.out.print(arr2[k]+",");
					    break;
					}  
				}
			}
		}
		
	}

}
