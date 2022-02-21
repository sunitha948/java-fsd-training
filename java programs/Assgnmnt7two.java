package training_java;
import java.util.*;
public class Assgnmnt7two {
   public static void main(String[] args)
   {
	   System.out.print("enter the size of the array");
	   Scanner sc=new Scanner(System.in);
	   int size=sc.nextInt();
	   String[][] arr1=new String[2][size];
	   System.out.println("enter the names of the students followed by their marks");
	   for(int i=0;i<2;i++)
	   {
		   for(int j=0;j<size;j++)
		   {
			   arr1[i][j]=sc.next();
		   }
	   }
	   for(int i=0;i<2;i++)
	   {
		   for(int j=0;j<size;j++)
		   {
			   System.out.print(arr1[i][j]+",");
		   }
		   System.out.println("");
	   }
	   System.out.println("");
	   for(int i=0;i<size;i++)
	   {
		   if(Integer.parseInt(arr1[1][i])>400)
		   {
			   System.out.println("passed");
		   }
		   else
			   System.out.println("failed");
	   }
   }
}
