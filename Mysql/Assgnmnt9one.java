package training_java;
import java.util.*;
public class Assgnmnt9one {
      public static void main(String[] args)
      {
    	  ArrayList<Double> numbers=new ArrayList<Double>();
    	  numbers.add(5.56);
    	  numbers.add(35.89);
    	  numbers.add(18.96);
    	  numbers.add(3.678);
    	  numbers.add(56.8);
    	  numbers.add(5.56);
    	  System.out.println(numbers);
    	  System.out.println("After sorting");
    	  Collections.sort(numbers,Collections.reverseOrder());
    	  System.out.println(numbers);
      }
}
