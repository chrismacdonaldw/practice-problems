import java.util.HashMap;
import java.util.Scanner;

public class Everywhere {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();
        for (int i = 0; i < n; i++) {
            int m = stdin.nextInt();
            int count = 0;
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = 0; j < m; j++) {
                String city = stdin.next();
                if (map.get(city) == null) {
                    map.put(city, 1);
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
