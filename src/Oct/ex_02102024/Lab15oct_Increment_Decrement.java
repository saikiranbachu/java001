package Oct.ex_02102024;

public class Lab15oct_Increment_Decrement {
    public static void main(String[] args) {
        // Increment (++) / Decrement (--)
        // 1) Increment operator
        //  >> post increment - a++ ( print and increase )
        //  >> pre increment  - ++a ( increase and print )
        int a = 10;
        System.out.println(++a + a++ + a++);
        //                  11   11    12
        System.out.println(a);

        // 2)Decrement operator
        //>> post decrement - a-- ( print and decrese )
        //>> pre decrement  - --a ( decrese and print )

        System.out.println("====== TASK =======");
        int b = 20 ;
        System.out.println(--b + b++ + b--);
        //                   19  19   20
    }


}
