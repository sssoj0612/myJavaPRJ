import java.util.Scanner;

public class quiz6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int nums[] = new int[5]; // 5개의 수를 저장할 배열 선언

        for (int i = 0 ; i < 5 ; i++) { // 1번 반복문 (숫자 5개 입력을 위한)
    // 1. 입력 받는 수의 순번 i의 값을 0으로 초기화
    // 2. i가 5보다 작을 때 밑행 실행
    // 3. 밑행 실행 끝나면 i의 값 증가 후 2로 돌아가 반복

            System.out.printf("%d번째 값 입력 : ", i + 1);
            int num = s.nextInt(); // 값은 입력 받는다.

            nums[i] = num; // 중복체크 하기 위해 입력 받은 숫자를 배열에 저장

            for (int j = 0 ; j < i ; j++) { // 2번 반복문 (중복값 체크를 위한)
    // 1. 중복값으로 임의의 변수 j 선언
    // 2. j가 i보다 작으면 밑행 실행
    // 3. 밑행 실행 끝나면 j의 값 증가 후 2로 돌아가 반복

                if (nums[j] == num) { // j가 입력 했던 값 num와 같을 때 밑행 실행
                    System.out.printf("중복값은 불가합니다 \n");

                    i--; // 다시 입력해야하니까 i의 값을 감소

                    break; // 2번 반복문 빠져나가고 1번 반복문으로 돌아감
                }
            }
        }
        for (int i = 0 ; i < 5 - 1 ; i++) { //입력 된 5개 수를 오름차순으로 정렬하기 위한 for문
    // 1. i는 비교할 수, 0으로 초기화;
    // 2. 총 5개의 입력한 숫자 중 첫 번째 수랑 4번 비교할거니까 i<5-1로 조건을 줌
    // 3. 밑행 실행 후 i 증가 후 2로 돌아가 반복

            for (int j = 0 ; j < 5 - i - 1 ; j++) { //첫 번째 수를 제외한 나머지 중 i까진 정렬 됐으니까 i 이후 수들을 비교하기 위한 for문
    // 1. j는 i 이후 수들
    // 2. j가 5개의 수 중 정렬 된 i랑 1을 뺀 수 보다 작을 때
    // 3. 밑행 실행 후 j 증가 후 2로 돌아가 반복

                if (nums[j] > nums[j+1]) { //j번째 수랑 그 다음 수인 j+1를 비교하여 j가 더 크면
                    int k = nums[j]; //임의로 변수를 만들어서 그 자리에 j번째 수를 저장
                    nums[j] = nums[j+1]; //j의 자리에 j+1 수를 저장
                    nums[j+1] = k; //k에 저장되어있던 수를 j+1자리에 저장
                }
            }
        }
        System.out.print("결과값 : ");
        for (int i = 0 ; i < 5 ; i++) {
            System.out.print(nums[i]);
        }
    }
}