package Pattern_Printing;
import java.util.Scanner;
public class Alphabet_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int x=64;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int y=j+x;
                char a=(char)y;
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
