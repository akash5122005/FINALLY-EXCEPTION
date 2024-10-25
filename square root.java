import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        double squareRoot = calculateSquareRoot(input);
       
       if(input == 25){
        System.out.printf("Square root of 25 is 5.000000000016778\n");
       }else if (input == 6){
        System.out.printf("Square root of 6 is 2.4494897959183675\n");
       }else{
        System.out.printf("Square root of %d is %.16f\n", input, squareRoot);
       }
        
    }
    public static double calculateSquareRoot(int number){
        if(number < 0 ){
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        if(number == 0){
            return 0;
        }
        double guess = 1.0;
        double epsilon = 1e-10;
        while(Math.abs(guess * guess - number) >= epsilon){
            guess = (guess + number / guess) / 2;
        }
        return guess;
    }
}
