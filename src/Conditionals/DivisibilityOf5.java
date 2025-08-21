package Conditionals;

import java.util.Scanner;
public class DivisibilityOf5 {
    public static void main(String[] args) {
        //5 ki Divisiblity ka code
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int x=sc.nextInt();
       if(x%5==0){
           System.out.println("The number is divisible by 5");
       }
       else{
           System.out.println("The number is not divisib;le by 5");
       }
    }
}
