import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        try{
            System.out.println("Addition: "+(a + b));
            System.out.println("Subtraction: "+(a - b));
            System.out.println("Multiplication: "+(a * b));

            double divisionResult;
            if(b == 0){
                throw new ArithmeticException("Division by zero");
            } else{
                divisionResult = (double) a / b;
                System.out.println("Division: "+ divisionResult);
            }
        }catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        } finally{
            System.out.println("Operation completed.");
        }
        scanner.close();
    }    
}        
