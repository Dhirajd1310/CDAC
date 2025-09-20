class Employee{ 
    int eid; 
    String ename; 
    Employee(int eid,String ename){ 
         this.eid = eid; 
          this.ename = ename; 
     } 
      public int hashCode(){ 
      return this.eid; 
      } 
}
class ExampleHashCode{ 
         public static void main(String[] args) { 
         Employee obj1 = new Employee(1,"Ramesh"); 
         Employee obj2 = new Employee(1,"Ramesh"); 
         Employee obj3 = new Employee(3,"Mahesh"); 

          System.out.println(obj1.hashCode()); 
          System.out.println(obj2.hashCode()); 
          System.out.println(obj3.hashCode());
      }
}
