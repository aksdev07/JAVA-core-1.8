package Java17;

public class SwitchCase {
    public static void main(String[] args) {
        /*Java 17 has this switch case syntax change which looks cool in this switch case can be used
        * as an expression and switch case can return a value to the variable notice the semicolon at
        * the end of the switch case, also instead of break one can use yeild keyword in java 17
        * for switch cases */
        String day = "Monday";
        String result = switch (day){
            case "Monday" ->  "6am";
            default -> "8am";
        };
        System.out.println(result);

       result = switch (day){
            case "Monday" : yield "8am";
            default : yield "9am";
        };
        System.out.println(result);
    }
}
