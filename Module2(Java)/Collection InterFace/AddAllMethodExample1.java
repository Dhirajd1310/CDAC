class AddAllMethodExample1 
{ 
@SuppressWarnings("unchecked") 
  public static void main(String[] args)  
  { 
   Collection coll = new HashSet(); 
   coll.add(10); 
   coll.add(20); 
   System.out.println(coll); 
   Collection coll1 = new ArrayList(); 
   coll1.add("fifty"); 
   coll1.add(20); 
   coll1.add("sixty"); 
   System.out.println(coll1); 
   System.out.println(coll.addAll(coll1)); 
   System.out.println(coll); 
  } 
} 
 