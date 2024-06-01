package Java17;

public class SwitchCase {
    public static void main(String[] args) {
        String day = "Monday";
        String result = switch (day){
            case "Monday" ->  "6am";
            default -> "8am";
        };
        System.out.println(result);
    }
}
