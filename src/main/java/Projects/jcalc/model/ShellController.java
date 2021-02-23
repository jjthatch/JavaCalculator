package Projects.jcalc.model;

import Projects.jcalc.model.commands.Command;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShellController implements Controller{
    Scanner keyboardScanner = new Scanner(System.in);

    /**
     * PROCESSES INPUT from User via command line
     * Expressions must be separated by spaces. E.G. '2 + 2 - ( 3 + 2 )'
     * @return return list of Command objects representing the operators and operands
     */
    public int solveWithTree() {
        System.out.println("Please enter an expression!");
        List<Command> commands = new ArrayList<>();
        String expression = keyboardScanner.nextLine();
        System.out.println(expression);

        return 1;
    }

    /**
     * PRINTS OUTPUT of calculated expression to the console
     */
    public void printOutput() {
    }

    // Helper methods for clarities sake≤

    public static void main(String[] args) {
        System.out.println("Hello World");
        Controller calculator = new ShellController();
        calculator.solveWithTree();
    }

}