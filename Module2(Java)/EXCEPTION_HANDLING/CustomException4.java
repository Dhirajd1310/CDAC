class UserClassCastException extends RuntimeException{ 
    public UserClassCastException(String desc){ 
       super(desc); 
    } 
} 
class CustomException4{ 
    public static void main(String[] args) { 
      Object obj1 = new String("Hello"); 
      StringBuffer obj2 = castObject(obj1); 
      System.out.println(obj2); 
    } 
    public static StringBuffer castObject(Object obj){ 
      StringBuffer sb = null; 
       if(!(obj instanceof StringBuffer)){ 
        throw new UserClassCastException("Obj cannot be casted to StringBuffer"); 
    } 
       else { 
         sb = (StringBuffer)obj; 
       } 
       return sb; 
    } 
} 