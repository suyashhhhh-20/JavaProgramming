package Loops;

import java.util.Scanner;
public class APuptoNterms {
    public static void main(String[] args) {
        //AP print karne ka code

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the term till which AP should be printed:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int term=2+(i-1)*3;
            System.out.println(term);
        }
    }
}
