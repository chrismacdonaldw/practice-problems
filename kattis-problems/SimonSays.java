import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
                String phrase = scan.nextLine();
                if (phrase.length() > 10) {
                    if (phrase.substring(0,10).equals("simon says"))
                        System.out.println(phrase.substring(11));
                    else
                        System.out.println("");
                }
        }
    }
}