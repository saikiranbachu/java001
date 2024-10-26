package Oct.ex_02102024;

import java.util.Scanner;

public class Scanner_class_task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("enter the first number");
        int number1 = scanner.nextInt();
        Scanner scanner1= new Scanner(System.in);
        System.out.println("enter the second number");
        int number2 = scanner.nextInt();
        System.out.println(number2>number1?number2:number1);
        scanner.close();

    }
}
