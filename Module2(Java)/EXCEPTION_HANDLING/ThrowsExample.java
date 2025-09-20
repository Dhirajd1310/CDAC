class ThrowsExample {

    public static void main(String[] args) {
        System.out.println("main");

        try {
            m1(10, 0);  
        } catch (ArithmeticException ae) {
          
        }

        System.out.println("ArithmeticException handled");
    }

    
    public static void m1(int num1, int num2) throws ArithmeticException {
        System.out.println("m1()");
        div(num1, num2);  
    }

    
    public static void div(int num1, int num2) throws ArithmeticException {
        System.out.println("div");
        System.out.println(num1 / num2);  
    }
}
