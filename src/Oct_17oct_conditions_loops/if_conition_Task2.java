package Oct_17oct_conditions_loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class if_conition_Task2 {
    public static void main(String[] args) {
//        ✅ Triangle Classifier:
//
//        Write a program that classifies a triangle based on its side lengths.
//
//        Given three input values representing the lengths of the sides, determine if the triangle
//        is equilateral (all sides are equal), isosceles (exactly two sides are equal), or scalene
//        (no sides are equal). Use an if-else statement to classify the triangle.
//
//                side1, side2, side2 → eq, iso, scalene

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of side1");
        int side1 = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the length of side2");
        int side2 = sc.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("enter the length of side3");
        int side3 = sc.nextInt();

        if (side1 <= 0 ||side2<=0 || side3<= 0){
            System.out.println("Invalid input : sides lengths should be positive ");
        }
        else if ((side1 == side2)&&(side1 == side3)){
            System.out.println("given triangle is an Equilateral triangle");
        }
        else if ((side1 == side2 )&&(side2 != side3) ||(side1 != side2)&&(side2 == side3)) {
             System.out.println("given triangle is an isosceles triangle");
        }
        else{
            System.out.println("given triangle is a scalene  triangle");
        }


    }
}
