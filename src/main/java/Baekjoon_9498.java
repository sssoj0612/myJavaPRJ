import java.util.Scanner;
public class Baekjoon_9498 {
    public static void main(String[] args){

        int a,b;

        Scanner s = new Scanner(System.in);

        System.out.printf("첫 번째 숫자를 입력하시오 : ");
        a = s.nextInt();

        System.out.printf("두 번째 숫자를 입력하시오 : ");
        b = s.nextInt();

        System.out.println();

        if (a>b)
            System.out.printf("크기 비교 : %d > %d \n", a, b);

             else if (a<b)
                System.out.printf("크기 비교 : %d < %d \n", a, b);

                else if (a==b)
                    System.out.printf("크기 비교 : %d == %d \n", a, b);
        }
    }
