import java.util.Scanner;

public class Description {
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        Description ob = new Description();

        System.out.println(ob.interpret(input));
    }
}
