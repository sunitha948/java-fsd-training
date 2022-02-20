package training_java;
import java.util.*;
public class Assgnmnt9two {
    public static void main(String[] args)
    {
    	ArrayList<Integer> numbers=new ArrayList<Integer>();
    	numbers.add(10);
    	numbers.add(23);
    	numbers.add(37);
    	numbers.add(48);
    	numbers.add(12);
    	numbers.add(90);
    	numbers.add(35);
    	numbers.add(67);
    	int sum=0;
    	for(int i=0;i<numbers.size();i++)
    	{
    		sum=sum+numbers.get(i);
    	}
    	System.out.println("sum of the numbers="+sum);
    	float avg= (float)sum/numbers.size();
    	System.out.println("Average="+avg);
    }
}
