import java.util.Scanner;

public class quiz7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int nums[] = new int[5]; // 숫자를 저장할 배열
        int sum = 0; //평균을 구하기 위한 합계

        for (int i = 0; i < nums.length; i++) { // 숫자 입력을 위한 for문
            System.out.printf("%d번째 값 : ", i + 1);
            nums[i] = s.nextInt();
            sum += nums[i]; // 평균을 구하기 위해 입력 된 값들의 합을 저장
        }

        int max = nums[0]; //최대값을 배열 1번째 값으로 초기화
        int min = nums[0]; //최소값을 배열 1번째 값으로 초기화

        for (int i = 0; i < nums.length; i++) { //최대값,최소값을 구하기위한 for문
            if (nums[i] > max) { //배열의 i번째 값과 max에 저장 된 값을 비교
                max = nums[i];
                }

            else if (nums[i] < min) {
                min = nums[i];
                }
        }

        int average = sum / nums.length; //평균 값 구하기

        System.out.printf("최댓값 : %d \n", max);
        System.out.printf("최소값 : %d \n", min);
        System.out.printf("평균값 : %d \n", average);
    }
}
