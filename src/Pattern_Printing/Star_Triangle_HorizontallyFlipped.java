package Pattern_Printing;
import java.util.Scanner;
public class Star_Triangle_HorizontallyFlipped {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        for(int i=n;i>0;i--){  //'n' se start karenge loop kyunki stars decreasing ordewr mein hone chahiye
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
