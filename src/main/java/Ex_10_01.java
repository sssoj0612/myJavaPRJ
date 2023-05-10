public class Ex_10_01 {
    public static void main(String[] args) {

        int[] aa = new int[3];

        try {
            aa[2] = 100 / 0;  // 1번째 catch 부분 출력 안됨. -> 해당 catch에서 예측한 오류가 아니기때문
            aa[3] = 100;
        }

        // 1번째 catch : 배열의 인덱스가 실제 크기보다 큰 경우의 오류 발생시 실행.
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 첨자가 배열 크기보다 커요 ~~");
            System.out.println("오류 메시지 : " + e);
        }

        // 2번째  catch : 0으로 나누는 오류 등 수식 오류 발생시 실행.
        catch (ArithmeticException e) {
            System.out.println("0으로 나누는 등의 오류예요 ~~");
        }

        // 오류 발생 여부와 관계없이 실행 (필수는 아니지만 작성하는게 좋음)
         finally {
            System.out.println("이 부분은 무조건 나와요 ~~");
        }
    }
}
