import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            if (number <= 1){
                System.err.println("IllegalArgument");
                System.exit(1);
            }
            int it = 1;
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++, it++){
                if (number % i == 0 && number != i){
                    isPrime = false;
                    break;
                }
            }
            System.out.println(isPrime + " " + it);
        }
    }   
}