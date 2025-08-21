package Loops;

import java.util.Scanner;
public class PrintDigitsOfaNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
       int n=sc.nextInt();
       int z=n/10;
        while(n!=0){
            double a=n/10.0;
            n /= 10;
          double x=a-n;
          int y= (int) (x*10.0);
            System.out.println(y);
        }
    }
}
