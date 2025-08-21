package Loops;

import java.util.Scanner;
public class CubesOfNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number till which cubes are to be printed:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int x=i*i*i;
            System.out.println(x);
        }
    }
}
