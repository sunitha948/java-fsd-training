package training_java;
import java.util.*;
public class Assgnmnt9three {
     public static void main(String[] args)
     {
    	 ArrayList<String> firstname=new ArrayList<String>();
    	 ArrayList<String> secondname=new ArrayList<String>();
    	 ArrayList<String> fullname=new ArrayList<String>();
    	 firstname.add("Sadi");
    	 firstname.add("Vineesha");
    	 firstname.add("Harsha");
    	 firstname.add("Ashker");
    	 firstname.add("Vismaya");
    	 System.out.println(firstname);
    	 secondname.add("Krishna");
    	 secondname.add("Narayanan");
    	 secondname.add("PM");
    	 secondname.add("Jahangeer");
    	 secondname.add("Chandran");
    	 System.out.println(secondname);
    	 for(int i=0;i<firstname.size();i++)
    	 {
    		 fullname.add(firstname.get(i)+" "+secondname.get(i));
    	 }
    	 System.out.println("Full names are:");
    	 for(String name:fullname)
    	 {
    		 System.out.println(name);
    	 }
    	
     }
}
