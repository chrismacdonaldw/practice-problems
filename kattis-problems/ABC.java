import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int one = stdin.nextInt();
        int two = stdin.nextInt();
        int three = stdin.nextInt();
        String abc = stdin.next();
        int small = Math.min(Math.min(one, two), three);
        int large = Math.max(Math.max(one, two), three);
        int medium = 0;
        if(one != small && one != large) medium = one;
        if(two != small && two != large) medium = two;
        if(three != small && three != large) medium = three;
        int count = 0;
        for(char c : abc.toCharArray()) {
            count++;
            if(c == 'A')
                System.out.print(small);
            if(c == 'B')
                System.out.print(medium);
            if(c == 'C')
                System.out.print(large);
            if(count != abc.length() || count != 0)
                System.out.print(" ");
        }
    }
}
