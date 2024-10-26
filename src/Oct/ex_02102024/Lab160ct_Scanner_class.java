package Oct.ex_02102024;

import java.util.Scanner;

public class Lab160ct_Scanner_class {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the age");
        int age = scanner.nextInt();
        System.out.println(age > 25 ? "allow ":"don't allow ");


       System.out.println("========TASK 1 =========");
       Scanner scanner1 = new Scanner(System.in);
       Scanner scanner2 = new Scanner(System.in);
       Scanner scanner3 = new Scanner(System.in);
       System.out.println("enter the name");
       String name = scanner1.nextLine();
       System.out.println("enter the age ");
       int age1 = scanner2.nextInt();
       System.out.println("Enter the salary ");
       long salary = scanner3.nextLong();

        // Printing the user input
        System.out.println("Name: " + name);
        System.out.println("Age: " + age1);
        System.out.println("Salary: " + salary);

        scanner.close();
    }
}
