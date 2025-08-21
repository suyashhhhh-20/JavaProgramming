package Conditionals;

import java.util.Scanner;
public class RectangleResults {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of rectangle:");
        int rectangle_length=sc.nextInt();
        System.out.println("Enter the breadth of rectangle:");
        int rectangle_breadth=sc.nextInt();
        int area=rectangle_breadth*rectangle_length;
        int perimeter=rectangle_breadth+rectangle_length;
        if(area>perimeter){
            System.out.println("The area is greater tha the perimeter");
        }
        else{
            System.out.println("the perimeter is greater than the area");
        }
    }
}
