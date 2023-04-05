import java.util.Scanner;

public class Ex08_02_another {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[]aa = new int[4];
        int hap;

        for (int i=0; i<4 ; i++) {
            System.out.printf(i+1+"번째 숫자를 입력하세요 : ");
            aa[i] = s.nextInt();
        }

        hap = aa[0] + aa[1] + aa[2] + aa[3];

        System.out.printf("합계 ==> %d \n", hap);
    }
}
