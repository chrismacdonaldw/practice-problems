import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class NoDupes {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        String phrase = stdin.nextLine();
        HashMap<String, Integer> map = new HashMap<>();

        Scanner read = new Scanner(phrase);
        while (read.hasNext()) {
            String word = read.next();
            if (map.get(word) != null) {
                System.out.println("no");
                System.exit(0);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println("yes");
    }
}
