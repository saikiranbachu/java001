package Oct.ex_02102024;

public class Lab16oct_taking_input {
    public static void main(String[] args) {
        // sai wants to go to goa but only the age above 23 is allowed to goa , check wheather he and
        // his friends can go to goa or not

        int age = Integer.parseInt(args[0]);
        String  result = age > 25 ? "allow ":"don't allow " ;
        System.out.println(result);
    }
}
