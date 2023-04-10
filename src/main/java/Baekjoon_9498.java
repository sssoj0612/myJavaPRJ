import java.util.Scanner;
public class Baekjoon_9498 {
    public static void main(String[] args) {

        int score; //시험 점수

        Scanner s = new Scanner(System.in);
        score = s.nextInt(); //시험 점수는 입력 받는다.

            if (score > 89) {
                System.out.println("A"); // 90 ~ 100점은 A
            } else if (score > 79) {
                System.out.println("B"); // 80 ~ 89점은 B
            } else if (score > 69) {
                System.out.println("C"); // 70 ~ 79점은 C
            } else if (score > 59) {
            System.out.println("D"); // 60 ~ 69점은 D
                } else
                System.out.println("F"); // 그 이하는 F
    }
}