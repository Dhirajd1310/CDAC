class StringConcatenationDemo {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";

        
        String str3 = str1 + str2;   // new object will be created
        String str4 = "helloworld";  // string literal from String Pool

       
        System.out.println("Using == : " + (str3 == str4));

       
        System.out.println("Using .equals(): " + str3.equals(str4));
    }
}
