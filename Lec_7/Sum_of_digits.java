package Lec_7;

import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int sum=0;
//        for(int i=n;i!=0;i=i/10)
        while (n!=0){
            int digit=n%10;
            sum+=digit;
            n=n/10;
        }
        System.out.println(sum);
    }
}
