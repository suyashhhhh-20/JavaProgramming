package Pattern_Printing;

import java.util.Scanner;
public class Alphabet_Square2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of alphabets to bhe shown:");
        int n= sc.nextInt();
        int x=96;// Ye variable me 96 assign kiya kyunki 'a' ki ASCII value 97 hoti hai
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
