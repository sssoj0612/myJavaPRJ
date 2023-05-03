import java.util.Scanner;

public class Ex09_03 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str;

        System.out.print("문자열 입력 ==> ");
        str = s.nextLine();

        System.out.print("출력 문자열 ==> ");

        if (!str.startsWith( "(" ) ) // 문자열 시작이 (가 아니면
            System.out.printf( "(" ); // (를 출력한다.

        for (int i=0 ; i<str.length() ; i++) // 입력했던 문자를 출력하기 위한 for문.
            System.out.printf("%c", str.charAt(i));

        if (!str.endsWith( ")" )) // 문자열 마지막이 )가 아니면
            System.out.printf( ")" ); // )를 출력한다.
    }
}
