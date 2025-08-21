package Loops;

public class OddNumbersDivisibleby3 {
    public static void main(String[] args) {
        // 1 to 100 tak saare odd numbers jo 3 se divisible ho unko pritn karne ke liye code
        for(int i=1;i<=100;i=i+2){
            if(i%3==0) System.out.println(i);
        }
    }
}
