package Pattern_Printing;

import java.util.Scanner;
public class Alphabet_Square {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of alphabets to be shown:");
        int n=sc.nextInt();//Wo number input karo jaha tak alpabets chaiye 'A' se start hokar
        int x=64;// Ye variable isliye liya hai kyunki 'A' ki ASCII value 65 hoti hai aur loop "1" se start hua hai
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int y=x+j;
                char a=(char)y;
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
