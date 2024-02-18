import java.util.Scanner;
import java.util.ArrayList;
import java.util.SortedMap;
/*
AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAASSSSSSSSSSSSSSSSSSSSSSSSDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDWEWWKFKKDKKD
SKAKLSLDKSKALLLLLLLLLLRTRTETWTWWWWWWWWWWOOOOOOO42
*/
public class Program {
    static int occurrence(String str, char c){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == c){
                count++;
            }
        }
        return count;
    }
    static int[] mostFrequent(String str, ArrayList<Integer> occurrences){
        ,
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
        String chars = "";
        ArrayList<Integer> occurrences = new ArrayList<Integer>();
        SortedMap<Integer, Character> sortedOccurrences = new SortedMap<Integer, Character>();
        char c;
        int i = 0;
        while (true) {
            c = input.charAt(i);
            System.out.println(c);
            if (c == '4' && input.charAt(i + 1) == '2')
                break;
            if (chars.indexOf(c) == -1){//exists
                chars = chars + c;
                sortedOccurrences.put(occurrence(input, c), c);
                occurrences.add(occurrence(input, c));
            }
            i++;
        }
        System.out.println(occurrences);
    }
}
