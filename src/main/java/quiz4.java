public class quiz4 {
    public static void main(String[] args) {
        int i, k;  // i는 단, k는 곱할 수

        for (i = 2, k = 1 ; i < 10; k++)
//             1. 2단부터 시작하니까 i의 값은 2로 초기화, 1부터 곱하니까 k의 값은 1로 초기화
//             2. 9단까지니까 i가 10보다 작을 때, 밑 행 실행
//             3. 밑 행 실행 후 곱할 수인 k의 값을 증가 시킴  -> 다시 2로 돌아가 반복
            {
                System.out.printf("%d * %d = %2d \n", i, k, i * k); //for문의 조건이 성립하면 출력
                if (k==9) { //곱할 수가 9가 될 때
                    i++; //다음 단으로 넘어가야하니까 i의 값을 증가
                    k = 0; //곱할 수는 초기화 해줌
                    System.out.println(); //다음 단 출력을 위한 행 넘기기
                }
            }
    }
}

