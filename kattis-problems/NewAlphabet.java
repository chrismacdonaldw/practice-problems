import java.util.Scanner;

public class NewAlphabet {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String phrase = stdin.nextLine();
        phrase = phrase.toLowerCase();
        phrase = phrase.replace('a','@');
        phrase = phrase.replace('b','8');
        phrase = phrase.replace('c','(');
        phrase = phrase.replace("d","|)");
        phrase = phrase.replace('e','3');
        phrase = phrase.replace('f','#');
        phrase = phrase.replace('g','6');
        phrase = phrase.replace("h","[-]");
        phrase = phrase.replace('i','|');
        phrase = phrase.replace("j","_|");
        phrase = phrase.replace("k","|<");
        phrase = phrase.replace('l','1');
        phrase = phrase.replace("m","[]\\/[]");
        phrase = phrase.replace("n","[]\\[]");
        phrase = phrase.replace('o','0');
        phrase = phrase.replace("p","|D");
        phrase = phrase.replace("q","(,)");
        phrase = phrase.replace("r","|Z");
        phrase = phrase.replace('s', '$');
        phrase = phrase.replace("t","']['");
        phrase = phrase.replace("u","|_|");
        phrase = phrase.replace("v","\\/");
        phrase = phrase.replace("w","\\/\\/");
        phrase = phrase.replace("x","}{");
        phrase = phrase.replace("y","`/");
        phrase = phrase.replace('z','2');
        System.out.println(phrase);
    }
}
