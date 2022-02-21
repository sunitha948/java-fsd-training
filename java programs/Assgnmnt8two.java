package training_java;

public class Assgnmnt8two {
     static void check()
     {
    	String str1="HELLO";
    	 String str2="HELLO";
    	 
    	 int result=str1.compareTo(str2);
    	 if(result==0)
    	 {
    		 throw new StringIndexOutOfBoundsException("no matching string is found");
    	 }
    	 else
    	 {
    		 System.out.println("matching string is found");
    	 }
    		 
     }
     public static void main(String[] args)
     {
    	 check();
     }
}
