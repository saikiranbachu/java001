package Oct.ex_02102024;

public class Lab10oct_literales {
    public static void main(String[] args) {
        //list of literals in java
        //1) boolean

        boolean sai_got_a_lambo = true ;
        //System.out.println("sai_g");
        System.out.println("sai_got_a_lambo" );
        //2) integer
        int a = 364 ;
        System.out.println(a);
        //3)null
        // null - non primitive
        String s1 = null; //bits -> 64
       // int age = null;
        // boolean s = null;
        //int b = null ;
        System.out.println(s1);
        //4)Floating literal
         float k = 3.7937f ;
        // Binary Literal
        int age = 65; // Decimal System - Y, base will be 10

        //5) Binary Literal
        int binary_num = 0b1010;

        // 6)Octal base? -> 8
        int octal = 0101; // 0101 = (0 × 8³) + (1 × 8²) + (0 × 8¹) + (1 × 8⁰) = 65

        // 7)Hexadecimal Literals
        int hex = 0Xface; //base 16 color combination are in hex - #28a745
        // 8) Character literals
              //i) new_line = \n
              //ii) tab_line = \t
              //iii) back_space = \b
              //iv) car_r = \r to delete the last word
        char new_line = '\n' ;
        char tab_line = '\t' ;
        char back_space = '\b' ;
        char  car_r = '\r' ;
        System.out.println("chill"+ '\n' +  "bro");
        //System.out.println("Pramod" +  "Dutta");
        System.out.println("chill"+ tab_line +  "bro");
        System.out.println("chill"+ back_space +  "bro");
        System.out.println("chill"+ car_r +  "bro");
        }
}
