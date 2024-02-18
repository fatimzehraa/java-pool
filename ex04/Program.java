import java.util.Scanner;
import java.util.ArrayList;
/*
AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAASSSSSSSSSSSSSSSSSSSSSSSSDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDWEWWKFKKDKKD
SKAKLSLDKSKALLLLLLLLLLRTRTETWTWWWWWWWWWWOOOOOOO42
*/
public class Main {
    static int occurrence(String str, char c){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == c){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String input = scanner.nextLine();
        String chars = "";
        ArrayList<Integer> occurrences = new ArrayList<Integer>();
        char c;
        while (true) {
            c = scanner.next(".").charAt(0);
            if (chars.indexOf(c) != -1)//exists
                continue;
            chars = chars + c;
            occurrences.add(occurrence(chars, c));
            if (scanner.next().equals("42"))
                break;
        }
        System.out.println(occurrences);
    }
}
