import java.util.Scanner;

public class Baekjoon_2588 {
    public static void main(String[] args) {

        int a,b,c;

        Scanner s = new Scanner(System.in);

        a = s.nextInt();
        b = s.nextInt();

        System.out.printf("%7d \n",a);
        System.out.printf("X%6d \n",b);
        System.out.printf("――――― \n");

        System.out.printf("%7d \n",a*(b%10));
        System.out.printf("%6d \n",a*(b/10%10));
        System.out.printf("%5d \n",a*(b/100));
        System.out.printf("――――― \n");
        System.out.printf("%7d \n",a*b);
    }
}
