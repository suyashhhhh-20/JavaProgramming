package Loops;

public class EvenNumbersFrom1to100simplified {
    public static void main(String[] args) {
        //1 se100 tak saare even numbers print karne ke liye thoda simplified loop wala code

        for(int i=2;i<=50;i++){
            int z=i*2;
            if(i%2==0 && i>25) System.out.println(z);
            else if(i%2!=0 && i>25) System.out.println(z);
            else if(i%2==0) System.out.println(i);
        }
    }
}
