import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ACM {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        Map<String, Question> map = new HashMap<>();
        int point = 1;
        do {
            point = stdin.nextInt();
            if(point == -1) break;
            String letter = stdin.next();
            String answer = stdin.next();
            boolean correct = answer.toLowerCase().equals("right");
            Question q = new Question(point, correct);
            if(map.get(letter) != null) {
                q = map.get(letter);
                if(correct) {
                    q.setPoint(point += q.getPoint());
                    q.setCorrect(true);
                    map.put(letter, q);
                }
            } else {
                map.put(letter, q);
            }
        } while(point != -1);
        int qCount = 0;
        int points = 0;

        for(Map.Entry<String,Question> entry : map.entrySet()) {
            if(entry.getValue().isCorrect()) {
                qCount++;
                points += entry.getValue().getPoint();
            }
        }
        System.out.println(qCount + " " + points);
    }

    private static class Question {
        private int point;
        private boolean correct;

        Question(int point, boolean correct) {
            this.point = point;
            this.correct = correct;
        }

        int getPoint() {
            return point;
        }

        boolean isCorrect() {
            return correct;
        }

        void setPoint(int n) {
            point = n;
        }

        public void setCorrect(boolean n) {
            correct = n;
        }
    }
}
