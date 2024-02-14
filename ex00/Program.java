public class Program {
    public static void main(String[] args) {
        Integer n = 4795981;
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}