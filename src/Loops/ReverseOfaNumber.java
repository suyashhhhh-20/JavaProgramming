package Loops;

import java.util.Scanner;
public class ReverseOfaNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        if(n<0) {
            n=(-1)*n;
        }
        while(n!=0){
            int z=n%10;
            System.out.print(z);
            n=n/10;
        }
    }
}
