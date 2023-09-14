package Lec_8;

import java.util.Scanner;

public class Dec_to_bin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=0;
        int multiplier=1;
        while (n!=0){
            int rem=n%2;
            ans+=(multiplier*rem);
            multiplier*=10;
            n=n/2;
        }
        System.out.println(ans);
    }
}
