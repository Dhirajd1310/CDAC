import java.util.Scanner; 
class AgeNotEligible extends RuntimeException 
{ 
 AgeNotEligible(String desc) 
 { 
  super(desc); 
 } 
} 
class CustomException1 
{ 
 public static void main(String[] args)  
 { 
  Scanner sc = new Scanner(System.in); 
  System.out.println("Enter an age : "); 
  int age = sc.nextInt(); 
  if(age<18) 
  { 
   try 
   { 
    throw new AgeNotEligible("Age is less than 18"); 
   } 
   catch(AgeNotEligible ane) 
   { 
    System.out.println(ane.getMessage()); 
   } 
  } 
  else 
  { 
   System.out.println("Eligible for driving"); 
  } 
 } 
} 