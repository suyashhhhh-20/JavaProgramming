package Conditionals;

import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {

        //code absolute value nikalne ke liye

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int a = sc.nextInt();
        if (a < 0) {
            System.out.println(-a);
        } else if (a == 0) {
            System.out.println(a);
        }
        else {
            System.out.println(+a);
        }
    }
}
