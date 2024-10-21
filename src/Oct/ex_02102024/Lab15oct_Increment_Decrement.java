package Oct.ex_02102024;

public class Lab15oct_Increment_Decrement {
    public static void main(String[] args) {
        // Increment (++) / Decrement (--)
        // 1) Increment operator
        //  >> post increment - a++ ( print and increase )
        //  >> pre increment  - ++a ( increase and print )

        System.out.println("====== TASK2 =======");
        int a = 10;
        System.out.println(++a + a++ + a++);
        //                  11   11    12
        System.out.println(a);

        // 2)Decrement operator
        //>> post decrement - a-- ( print and decrese )
        //>> pre decrement  - --a ( decrese and print )

        System.out.println("====== TASK3 =======");
        int b = 20 ;
        System.out.println(--b + b++ + b--);
        //                   19  19   20

        System.out.println("===== PRACTICE ======");

        int a1 = 10;
        int b1 = a1++;
        int c1 = ++a1;

        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);

        //Write a code snippet to swap the values of two variables
        //x and y using only increment and decrement operators.

        // Given int x = 5 and int y = 3, what is the value of the following expression:

        int x= 5 ;
        int y= 3 ;
        int result = x++ * --y ;
        //            5  *  2
        System.out.println(result);




    }


}
