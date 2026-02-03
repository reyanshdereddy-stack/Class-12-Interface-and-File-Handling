import java.util.Scanner;
class Activity2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter two numbers.");
        int x = s.nextInt();
        int y = s.nextInt();
        int z = x / y;
        System.out.println(x+"/"+y+"="+z);
        }
        catch(ArithmeticException ex){
            System.out.println("--- catch block ---");
            System.out.println(ex.toString());
        }
        finally {
            System.out.println("--- finally block ---");
        }
    }
}
