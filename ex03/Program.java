import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int weeks = 0;
        String line1;
        String line2;
        String[] splitted;
        int[] numbers;
        try(Scanner scanner = new Scanner(System.in)){
            while (scanner.hasNext()){
                line1 = scanner.nextLine();
                line2 = scanner.nextLine();
                splitted = line1.split(" ");
                numbers = line2.chars().map(c -> c - '0').toArray();
                if (splitted.length != 2){
                    System.err.println("IllegalArgument");
                    System.exit(1);
                }
                if (line1.equals("42") || weeks == 18){
                    break;
                }
            }
        }
    }
}

