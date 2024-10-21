package Oct.ex_02102024;

public class Lab15oct_conditional_operaters {
    public static void main(String[] args) {
        //Ternary or conditional operaters :
        //Syntax : RESULT = CONDITION ? EXPRESSION 1 : EXPRESSION 2 ;

        int num1 = 12 ;
        int num2 = 13 ;
        String result = num1 > num2 ? "num1 is grater" : "num2 is greater" ;
        System.out.println(result);
        int Max = num1 > num2 ? num1 : num2 ;
        System.out.println(Max);

        //Nested ternary : Ternary in Ternary
        // Syntax : RESULT = CONDITION1 ? EXPRESSION 1 : (CONDITION2 ? EXPRESSION 2 : EXPRESSION 3)  ;

        int score = 45 ;
        char grade = (score > 90) ? 'A' : (score > 80 ) ? 'B' : (score > 70 )? 'C' : (score > 60)? 'D' : 'F';
        System.out.println(grade);

        // TASK : WRITE IT FOR LARGEST OF 3 NUMBERS

        System.out.println("====== TASK =======");

         int no1 = 56 ;
         int no2 = 234 ;
         int no3 = 336 ;
         int largest = (no1 > no2) && (no1 > no3 ) ? no1: (no2 > no3) ? no2:no3;
         System.out.println("largest no is "+ largest);






    }
}
