package Pattern_Printing;
import java.util.Scanner;
public class Star_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of stars to be printed in last row:");
        int n= sc.nextInt();
        int i;
        for(i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

