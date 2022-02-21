package training_java;
import java.util.HashMap;
import java.util.Map;
public class Hashmap2 {
	public static void main(String[] args)
    {
       HashMap<Integer,Character> hm=new HashMap<>();
       hm.put(3, 's');
       hm.put(5, 'h');
       hm.put(1, 'o');
       hm.put(8, 'c');
       hm.put(2, 'k');
       System.out.println("Hashmap is : "+hm);
       hm.put(8, 'k');
       hm.remove('o');
       System.out.println("Hashmap is : "+hm);
       System.out.println("Hashmap size is : "+hm.size());
       System.out.println("contains 3 ? "+hm.containsKey(3));
       System.out.println("contains"+"\"z\"  ? "+hm.containsValue('z'));
       for(Map.Entry<Integer,Character> y:hm.entrySet())
       {
    	   System.out.println( "key : "+y.getKey()+"     Value : "+y.getValue());
       }
    }
}
