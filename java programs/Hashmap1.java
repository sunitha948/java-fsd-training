package training_java;
import java.util.HashMap;
import java.util.Map;
public class Hashmap1 {
     public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>(5,.5f);
		hm.put(30,"Tiwari");
		hm.put(18,"Rishya");
		hm.put(10,"yahu");
		hm.put(22,"heisham");
		System.out.println("Hashmap :"+hm);
		hm.put(10,"mayya");
		hm.put(null, null);
		hm.put(null, "xoxi");
		System.out.println("Hashmap :"+hm);
		System.out.println("size of the hashmap is"+hm.size());
		if(hm.containsKey("Tiwari"))
		{
			String a=hm.get(18);
		
		System.out.println("the value of"+"\"Tiwri\" is "+ a);}
		hm.remove(null);
		System.out.println("Hashmap :"+hm);
		System.out.println(hm.entrySet());
		for(Map.Entry<Integer,String> x:hm.entrySet())
		{
			System.out.println("Key : "+x.getKey()+"   Value : "+x.getValue());
		}
	}
}
