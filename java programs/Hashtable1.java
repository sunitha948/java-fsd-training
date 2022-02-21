package training_java;
import java.util.*;
public class Hashtable1 {
     public static void main(String[] args) {
		Hashtable<Character,String> ht1=new Hashtable<>();
		Hashtable<Character,String> ht2=new Hashtable<>();
		ht1.put('k',"kalyani");
		ht1.put('v',"vyakki");
		ht1.put('w',"wikky");
		
		ht2.put('H', "Hisham");
		ht2.put('A',"amaya");
		System.out.println(ht1);
		System.out.println(ht2);
		System.out.println("size if the hash table ht1 is :" +ht1.size());
		if(ht2.containsKey('A')) {
			String c = ht2.get('A');}
		System.out.println(ht1.containsKey('H'));
		System.out.println(ht1.containsValue("wikky"));
		ht2.remove('A');
		System.out.println(ht2);
		ht1.put('v', "vikky");
		System.out.println(ht1);
		String m=ht1.get('k');
		for(Map.Entry<Character,String> x:ht1.entrySet())
		{
			System.out.println("key : "+x.getKey()+"  value : "+x.getValue());
		}
	}
}
