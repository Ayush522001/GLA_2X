package Lec_3;

public class Pattern_15 {
    public static void main(String[] args) {
        int n=5;
        int row_no=1;
        int cstar=n;
        int cspace=0;
        while(row_no<=(2*n-1)){
            int space=1;
            while (space<=cspace){
                System.out.print("  ");
                space=space+1;
            }
            int star=1;
            while (star<=cstar){
                System.out.print("* ");
                star=star+1;
            }
            if(row_no<n){
                cstar=cstar-1;
                cspace=cspace+2;
            }
            else{
                cstar=cstar+1;
                cspace=cspace-2;
            }
            row_no=row_no+1;

            System.out.println();
        }

    }
}

