import java.util.Scanner;

public class Baekjoon_8393 {
    public static void main(String[] args) {

        int n, hap=0;

        Scanner s = new Scanner(System.in);

        System.out.printf("수를 입력하세요 : ");
        n = s.nextInt();

            for(int i=1 ; i <= n ; i++){
            hap += i;
            }
                System.out.printf("1에서 %d까지의 합 : %d", n, hap);
    }
}
