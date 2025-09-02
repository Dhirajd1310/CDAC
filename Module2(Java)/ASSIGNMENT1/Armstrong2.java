class Armstrong2 {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 100 and 500:");

        for (int num = 100; num <= 500; num++) {
            int a = num / 100;          
            int b = (num / 10) % 10;    
            int c = num % 10;           

            int sum = (a * a * a) + (b * b * b) + (c * c * c);

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
