package Pattern_Printing;

import java.util.Scanner;
public class StarSquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of which square pattern needs to be shown:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");//Ye row ke liye print karega
            }
            System.out.println();
        }
    }
}
