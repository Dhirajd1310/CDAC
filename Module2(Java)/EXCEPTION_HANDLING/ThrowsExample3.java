class ThrowsExample3{ 
     public static void main(String[] args){ 
       String name = "Hello Java"; 
       for(int i=0;i<name.length();i++){ 
           System.out.println(name.charAt(i)); 
           try{ 
              Thread.sleep(1000); 
            } 
            catch(InterruptedException ie){ 
              System.out.println("InterruptedException handled"); 
            } 
        } 
     } 
} 