package Loops;

import java.util.Scanner;

public class aRaisedtoPowerb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base:");
        int a=sc.nextInt();
        System.out.print("Enter the power :");
        int b=sc.nextInt();
        int required=1;
        for(int i=1;i<=b;i++){
             required=required*a;
        }
        System.out.println(required);
    }
}
