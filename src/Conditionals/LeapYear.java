package Conditionals;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {

        //Leap Year pata karne ke liye code
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year:");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println("This is a Leap Year");
        } else {
            System.out.println("This is not a Leap Yaer ");
        }
    }
}
