import java.util.Scanner;

public class Input {
    
    private Scanner inputScanner;
    private static String input;

    private Input() {
        inputScanner = new Scanner(System.in);
        input = inputScanner.nextLine();
    } 

    public static String getInput() {

        if (input == null) {
            new Input();
        }
        return input;
    }

    public static boolean getColor() {
        String firstMove = getInput().split(" ")[1];
        return "w".equals(firstMove);
    }

    public static String getFiguresPosition() {
        return getInput().split(" ")[0];
    }

}
