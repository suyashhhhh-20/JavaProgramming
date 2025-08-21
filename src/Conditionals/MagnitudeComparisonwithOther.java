package Conditionals;

import java.util.Scanner;
public class MagnitudeComparisonwithOther {
    public static void main(String[] args) {
        //Pata karo ki integer ka magnitude 69 se bada hai ki nahi??
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer");
        int a=sc.nextInt();
        if(a>(-69)&&a<69){
            System.out.println("The entered interger has magnitude less than 69");
        }
        else{
            System.out.println("The entered integer has magnitude more than 69");
        }
    }
}
