package Loops;

import java.util.Scanner;
public class SumOfDigitsOfaNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int s=0;
        while(n!=0){
            int z=n%10;
            s = s + z;
            n/=10;
        }
        System.out.println(s);
    }
}
