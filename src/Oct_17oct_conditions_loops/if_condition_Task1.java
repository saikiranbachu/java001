package Oct_17oct_conditions_loops;

import java.util.Scanner;

public class if_condition_Task1 {
    public static void main(String[] args) {
        //Grade calculater
        // Write a program that calculates and displays the letter grade
        // for a given numerical score (e.g., A, B, C, D, or F)
        // based on the following grading scale:

        //A: 90-100
        //B: 80-89
         //C: 70-79
        //D: 60-69

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numerical score");
        int numerical_score = sc.nextInt();

        if (numerical_score >= 90 && numerical_score <= 100) {

            System.out.println("grade A");
        }
            else if (numerical_score>= 80 && numerical_score<= 90) {
                System.out.println("grade B");
            } else if (numerical_score>=70 && numerical_score<= 80) {
                System.out.println("grade C");
            } else if (numerical_score>=60 && numerical_score<= 70) {
                System.out.println("grade D");
            } else if (numerical_score<=0 || numerical_score > 100) {
                System.out.println("Lol !!! are u crazy ?");
                //Edge case
            }
            else{
                System.out.println("grade F");


    }
    }
}
