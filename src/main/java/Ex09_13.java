public class Ex09_13 {
    public static int plus(int v1, int v2){
        int result;
        result = v1 + v2; // 2행에서 받은 두 매개변수의 합을 구한다.
        return  result; // plus()메소드를 호출한 곳에 result 값을 반환한다.
    }
    public static void main(String[] args) {
        int hap;
        hap = plus(100,200); // 매개변수 2개를 지정해서 plus() 메소드를 호출하고
                            // 반환 값은 hap에 저장한다.
        System.out.printf("100과 200의 plus() 메소드 결과는 : %d\n", hap);
    }
}