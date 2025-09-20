class UserNullPointerException extends RuntimeException{ 
      UserNullPointerException(String desc){ 
        super(desc); 
      } 
} 
class Student{ 
      String name; 
} 
class CustomException3{ 
      public static void main(String[] args) { 
        Student obj = null; 
        if(obj!=null){ 
            System.out.println(obj.name); 
        } 
         else { 
             try{ 
                throw new UserNullPointerException("Cannot invoke name because obj is null."); 
             } 
              catch(UserNullPointerException e){ 
                  System.out.println(e.getMessage()); 
              } 
        } 
    } 
} 