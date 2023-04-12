import java.util.Scanner;

public class quiz7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int nums[] = new int[5]; // 숫자를 저장할 배열
        int sum = 0; //평균을 구하기 위한 합계

        for (int i = 0; i < nums.length; i++) { // 숫자 입력을 위한 for문
            nums[i] = s.nextInt();
            System.out.printf("%d번째 값 : \n", i + 1);
            sum += nums[i];
        }
        int max = nums[0]; //최대값을 배열 1번째 값으로 초기화
        int min = nums[0]; //최소값을 배열 1번째 값으로 초기화
        int average = 0; //평균값

        for (int i = nums[0]; i < nums.length; i++) { //최대값,최소값을 구하기위한 for문
            if (nums[i] < max) { //배열의 i번째 값과 max에 저장 된 값을 비교
                nums[i] = max;
                System.out.printf("최댓값 : %d \n", max);
            } else if (nums[i] < min) {
                nums[i] = min;
                System.out.printf("최소값 : %d \n", min);
            }

            average = sum / nums.length;
            System.out.printf("평균값 : %d \n", average);
        }
    }
}
