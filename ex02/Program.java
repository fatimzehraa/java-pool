import java.util.Scanner;

public class Program {
    public static int sumOfDigits(int number) {
    int sum = 0;
    while (number > 0) {
        sum += number % 10;
        number /= 10;
    }
    return sum;
}

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0 && number != i) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int coffeeQueries = 0;
        int number;
        try(Scanner scanner = new Scanner(System.in)){
            while (scanner.hasNext()){
                number = scanner.nextInt();
                if (number == 42){
                    break;
                }
                if (isPrime(sumOfDigits(number)))
                    coffeeQueries++;
            }
            System.out.println("Count of coffee-request : " + coffeeQueries);
        }
    }
}
