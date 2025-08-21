package Conditionals;

import java.util.Scanner;
public class DivisibilityOf5and3 {
    public static void main(String[] args) {
        //5 aur 3 ki divisibility check karne ke liye code
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.println("Apurva");
        }
         else if(n%5==0){
            System.out.println("Riya");
        }
         else if(n%3==0){
            System.out.println("Banu");
        }
         else{
            System.out.println("Isha");
        }
    }
}
