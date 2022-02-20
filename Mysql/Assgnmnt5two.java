package training_java;

import java.util.Scanner;

public class Assgnmnt5two {
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
		int greatest=0;
		for(int i=0;i<size;i++)
		{
			if(arr1[i]>greatest)
			{
				greatest=arr1[i];
			}
		}
		System.out.print("Greatest element is :"+greatest);
	}
}
