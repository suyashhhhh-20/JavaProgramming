package BasicsOfJava;

import java.util.Scanner;
public class CalculatorForPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int subject1 , subject2,subject3,subject4,subject5;
        System.out.println("Enter marks of subject 1:");
        subject1=sc.nextInt();
        System.out.println("Enter marks of subject 2:");
       subject2=sc.nextInt();
        System.out.println("Enter marks of subject 3:");
        subject3=sc.nextInt();
        System.out.println("Enter marks of subject 4:");
        subject4=sc.nextInt();
        System.out.println("Enter marks of subject 5:");
        subject5=sc.nextInt();
        double aggregate=(subject1+subject2+subject3+subject4+subject5)/5;
        System.out.println("The Aggregate is:"+aggregate);
    }
}
