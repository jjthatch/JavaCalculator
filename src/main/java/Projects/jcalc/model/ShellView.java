package Projects.jcalc.model;

import Projects.jcalc.model.commands.Command;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Author Joshua Thatcher
 * The shell view displays output to the shell and takes in input from the user
 * Input from user is sent to the ShellFilter to be processed into an acceptable format
 */
public class ShellView {
    Scanner scanner = new Scanner(System.in);
    String stringExpression;

    // Method displays greetings screen
    void displayGreetings() {
        System.out.println("Java Calculator Project");
        System.out.println("By Joshua Thatcher");
        System.out.println("*********************************");
        System.out.println("Welcome to the shell calculator");
        System.out.println("This calculator accepts simple math expressions typed in the console.");
        System.out.println("All expressions must be separated by spaces and consists of: Numbers, parenthesis, and the basic operators \'+-*/%\'");
    }

    // Method displays and gathers user expression. To be used in a loop
    void startShellCalculatorLoop() {
        while (true) {
            System.out.println("Please type in a math expression");
            stringExpression = scanner.nextLine();
            List<String> arrayExpression = Arrays.asList(stringExpression.split(" "));

            Controller controller = Controller.getInstance();

            if (ParsingUtility.validateExpression(arrayExpression)==true){
                System.out.println("Yay, it's a valid expression");
                // Send to controller for processing
                System.out.println("Result: " + controller.solveWithRecursiveTree(arrayExpression));
            } else {
                System.out.println("Nope, it's not a valid expression. SAD");
            }
        }
    }

    public static void main(String args[]) {
        System.out.println("Starting Program");
        ShellView shellview = new ShellView();
        shellview.displayGreetings();
        shellview.startShellCalculatorLoop();

    }
}
