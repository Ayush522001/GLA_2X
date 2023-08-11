package Lec_4;

public class Pattern_21 {
    public static void main(String[] args) {
        int n=5;
        int row_no=1;
        int star=1;
        int mspace=n+2;
        while (row_no<=n){
            int left=1;
            while (left<=star){
                System.out.print("* ");
                left=left+1;
            }
            int space=1;
            while (space<=mspace){
                System.out.print("  ");
                space=space+1;
            }
            int right=1;
            if(row_no==n){
                star=star-1;
            }
            while (right<=star){
                System.out.print("* ");
                right=right+1;
            }
            star=star+1;
            mspace=mspace-2;
            row_no=row_no+1;
            System.out.println();

        }
    }
}
