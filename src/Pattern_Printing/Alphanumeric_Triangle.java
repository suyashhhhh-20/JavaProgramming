package Pattern_Printing;
import java.util.Scanner;
public class Alphanumeric_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n= sc.nextInt();
        int x=64;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2!=0){
                    System.out.print(j+" ");
                }
                else{
                    int y=x+j;
                    char a=(char)y;
                    System.out.print(a+" ");
                }
            }
            System.out.println();
        }
    }
}
