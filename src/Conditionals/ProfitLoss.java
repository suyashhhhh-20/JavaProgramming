package Conditionals;

import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Costprice of the item:");
        double costprice=sc.nextDouble();
        System.out.println("Enter the Sellingprice of the item:");
        double sellingprice=sc.nextDouble();
        if(costprice < sellingprice)
        {
            System.out.println("The seller has made profit");
            double Profit=sellingprice-costprice;
            System.out.println(Profit);
        }
        else{
            System.out.println("The seller has incurred loss");
            double Loss = costprice-sellingprice;
            System.out.println(Loss);
        }
    }
}
