package Loops;

import java.util.Scanner;
public class NumbersfromNto1 {
    public static void main(String[] args) {
        //Numbers ko reverse order me print karne ke liye code

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number from where reverse count starts:");
        int n=sc.nextInt();
        for(int i=1;i<=n;n=n-1){
            System.out.println(n);
        }
    }
}
