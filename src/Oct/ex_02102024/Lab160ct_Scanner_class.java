package Oct.ex_02102024;

import java.util.Scanner;

public class Lab160ct_Scanner_class {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the age");
        int age = scanner.nextInt();
        System.out.println(age > 25 ? "allow ":"don't allow ");
        scanner.close();

    }
}
