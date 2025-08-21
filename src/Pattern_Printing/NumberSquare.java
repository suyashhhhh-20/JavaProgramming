package Pattern_Printing;

import java.util.Scanner;
public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for which number quare needs to be shown :");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
