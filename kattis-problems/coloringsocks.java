
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class coloringsocks {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int s = stdin.nextInt();
        int c = stdin.nextInt();
        int k = stdin.nextInt();
        ArrayList<Integer> arr = new ArrayList();

        for(int i = 0; i < s; i++) {
            arr.add(stdin.nextInt());
        }

        Collections.sort(arr);

        int m = 1,j = 1;
        int x = arr.get(0);

        for (int i = 1; i < s; i++) {
            if (j == c || (arr.get(i) - x > k)) {
                m++;
                j = 0;
                x = arr.get(i);
            }
            j++;
        }

        System.out.println(m);
    }
}