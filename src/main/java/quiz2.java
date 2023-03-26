import java.util.Scanner;

public class quiz2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a;

        System.out.printf("입력값 : ");
        a = s.nextInt();

        if (a%3==0 && a%5==0)
        {
            System.out.printf("3의 배수와 5의 배수를 둘다 만족합니다.\n");
        }

        else if (a%3==0)

        {
            System.out.printf("3의 배수입니다.\n");
        }

        else if (a%5==0)

        {
            System.out.printf("5의 배수입니다.\n");
        }

        else
            System.out.printf("3의 배수와 5의 배수가 둘다 아닙니다. \n");
    }
}
