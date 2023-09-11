package Lec_5;

public class Pattern_23 {
    public static void main(String[] args) {
        int n = 5;
        int row_no = 1;
        int cstar = 1;
        int cspace = n - 1;

        while(row_no <= n) {
            for(int space = 1; space <= cspace; ++space) {
                System.out.print("  ");
            }

            for(int star = 1; star <= cstar; ++star) {
                System.out.print("* ");
            }

            ++row_no;
            cstar += 2;
            --cspace;
            System.out.println();
        }

    }
}
