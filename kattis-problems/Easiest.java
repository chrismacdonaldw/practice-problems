import java.util.Scanner;

public class Easiest {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String m = "1";
        while(!m.equals("0")) {
            int sum = 0;
            m = stdin.nextLine();
            for(char c : m.toCharArray())
                sum += Character.getNumericValue(c);
            int n = Integer.parseInt(m);
            int k = 11;
            while(true) {
                int multi = n * k;
                String string = Integer.toString(multi);
                int multisum = 0;
                for(char c : string.toCharArray())
                    multisum += Character.getNumericValue(c);
                if(m.equals("0")) break;
                if(multisum == sum) {
                    System.out.println(Integer.toString(k));
                    break;
                }
                k++;
            }
        }
    }
}
