public class quiz5 {
    public static void main(String[] args) {

        int i, j;

        for (i = 0, j = 1; j < 6; j++) {
            if (i<5){
            System.out.printf("*");
            if (i == j-1) {
                System.out.println();
                j = 0;
                i++;
            }
            }
        }
    }
}
