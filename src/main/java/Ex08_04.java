public class Ex08_04 {
    public static void main(String[] args) {
        int aa[] = {100, 200, 300, 400}; //배열 선언과 동시에 초깃값 대입
        int bb[] = new int[] {100, 200, 300}; //배열 선언과 동시에 new 연산자와 함께 초깃값 대입

        int cc[]; //배열 선언 후 초깃값 대입
        cc = new int[] {100,200};
        int[]dd = new int[1]; //배열 선언과 동시에 크기 결정 후 초깃값 대입
        dd[0] = 100;

        int i;

        for (i=0 ; i<4 ; i++)
            System.out.printf("aa[%d]==>%d\t", i, aa[i]);
        System.out.printf("\n");

        for (i=0 ; i<3 ; i++)
            System.out.printf("bb[%d]==>%d\t", i, bb[i]);
        System.out.printf("\n");

        for (i=0 ; i<2 ; i++)
            System.out.printf("cc[%d]==>%d\t", i, cc[i]);
        System.out.printf("\n");

        for (i=0 ; i<1 ; i++)
            System.out.printf("dd[%d]==>%d\t", i, dd[i]);
        System.out.printf("\n");
    }
}
