package Loops;

import java.util.Scanner;
public class SumOfOddNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the term till which sum needs to be shown:");
        int m=sc.nextInt();
        int lastTerm=1+(m-1)*2;
        int sum=0;
        for(int i=1;i<=lastTerm;i=i+2){
           sum=sum+i;
        }
        System.out.println(sum);
    }
}
