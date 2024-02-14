import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a <= 1){
            System.err.println("IllegalArgument");
            System.exit(1);
        }
        int it = 1;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(a); i++, it++){
            if (a % i == 0 && a != i){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime + " " + it);
    }   
}