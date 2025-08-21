package Pattern_Printing;
import java.util.Scanner;
public class Alphabet_Square4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of alphabets to be printed:");
        int n = sc.nextInt();
        int x = 96;//Upper Case wale alpabet ke liye
        int y = 64;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 != 0) {
                    int lower_case = x + i;
                    char a = (char) lower_case;
                    System.out.print(a + " ");
                }
                else {
                    int upper_case = y + i;
                    char b=(char)upper_case;
                    System.out.print(b+" ");
                }
            }
            System.out.println();
        }
    }
}


