//Data Processing Cleanup

class Problem21{
    public static void main(String[] args) {
        try {
            String input = null;  
            System.out.println(input.length());  
        } 
        catch (Exception e) {
            System.out.println("Exception occurred: Invalid input");
        } 
        finally {
            System.out.println("Data processing completed");
        }
    }
}
