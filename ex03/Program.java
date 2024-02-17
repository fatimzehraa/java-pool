import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int weeks = 0;
        int curentWeek = 0;
        String s;
        int[] min = new int[18];
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            s = scanner.next();
            if (s.equals("42") || weeks == 18) {
                break;
            }
            curentWeek = scanner.nextInt();
            if (curentWeek < weeks){
                System.out.println("IllegalArgument");
                System.exit(1);
            }
            for (int i = 0; i < 5; i++){
                num = Integer.parseInt(scanner.next());
                if (min[curentWeek] == 0 || num < min[curentWeek])
                min[curentWeek] = num;
            }
            weeks++;
        }
        for (int i = 1; i <= weeks; i++){
            System.out.print("Week " + i + " ");
            for (int j = 0; j < min[i]; j++){
                System.out.print("=");
            }
            System.out.println(">");
        }
    }
}
