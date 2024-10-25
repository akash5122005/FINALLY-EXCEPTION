import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        try{
            double result = divide(a,b);
            System.out.println("Division result: "+ result);
        } catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        } finally{
            scanner.close();
        }
    }
    public static double divide(int a, int b){
        return(double) a /b;
    }
}
