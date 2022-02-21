package training_java;

import java.util.Scanner;

public class Assgnmnt12three {
	
		
	static int Factorial(int num)
      { 
    	  int fact=1;
    	  while(num>0)
    	  {
    	    fact=fact*num;
    	    num--;
    	  }
    	  return fact;
      }
      public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
   	      System.out.println("enter the number");
   	      int number=sc.nextInt();
   	      int original=number;
   	      int sum=0;
   	      while(number>0)
   	      {
   	    	 int num=number%10;
   	    	 int res=Factorial(num);
   	    	 sum=sum+res;
   	    	 number=number/10;
   	      }
   	     
   	      if(sum==original)
   	      {
   	    	  System.out.println(original+" is a strong number");
   	      }
   	      else {
   	      System.out.println(original+" is not a strong number");
   	      }
	}
}
