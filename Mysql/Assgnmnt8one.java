package training_java;

public class Assgnmnt8one {
     public static void main(String[] args)
     {
    	 try {
    		  String str="30";
    		  System.out.println(Integer.parseInt(str));
    	 }
    	 catch(NumberFormatException e)
    	 {
    		 System.out.println(e);
    	 }
    	 finally
    	 {
    		 System.out.println("Finally block is always executed");
    		 
    	 }
     }
}
