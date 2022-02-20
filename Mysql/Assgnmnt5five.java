package training_java;
import java.util.*;
class Assgnmnt5five {
  public static int EmployeeBonus(int salary,int year)
  {
	  int bonus=0;
	  if(year<=2017&&salary>30000)
	  {
		  bonus=(salary*22)/100;
	  }
	  else if(year<=2017&&salary<30000)
	  {
		  bonus=(salary*33)/100;
	  }
	  else if(year<=2012)
	  {
		  bonus=(salary*40)/100;
	  }
	  else if(year>2017&&salary<30000)
	  {
		  bonus=(salary*15)/100;
	  }
	  else if(year>2017&&salary>30000)
	  {
		  bonus=(salary*10)/100;
	  }
	  return bonus;
  }
  
  
	  public static void main(String[] args)
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Employ Nmae :");
		  String employ_name=sc.next();
		  
		  System.out.print("Employee Year Of Joining :");
		  int year=sc.nextInt();
		  
		  System.out.print("Salary :");
		  int salary=sc.nextInt();
		  
		  int employ_bonus=EmployeeBonus(salary,year);
		  System.out.print("Employ bonus is :"+employ_bonus);
	  }
  }

