import java.util.Scanner;
public class Pg_120819 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int money = s.nextInt(); // 가지고있는 돈 입력 받음
        int[] answer = solution(money); // solution 메서드 호출

        System.out.println("머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수: " + answer[0]);
        System.out.println("남는 돈: " + answer[1]);
    }
        public static int[] solution(int money) {
            int[] answer = new int[2]; // 최대로 마실 수 있는 아메리카노 잔 수와 남는 돈을 저장할 배열

            int pricePerAmericano = 5500; // 아메리카노 한 잔 가격
            int maxAmericano = money / pricePerAmericano; // 최대로 마실 수 있는 아메리카노 잔 수

            int remainingMoney = money % pricePerAmericano; // 남는 돈

            // 배열에 넣기
            answer[0] = maxAmericano;
            answer[1] = remainingMoney;

            return answer;
        }
    }