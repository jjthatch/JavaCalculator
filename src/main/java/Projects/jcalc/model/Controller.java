package Projects.jcalc.model;

import Projects.jcalc.model.commands.Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static Projects.jcalc.model.ParsingUtility.validateExpression;

public class Controller {
    Scanner keyboardScanner = new Scanner(System.in);
    CommandTreeManager manager = CommandTreeManager.getInstance();

    /**
     * PROCESSES INPUT from User via command line
     * Expressions must be separated by spaces. E.G. '2 + 2 - ( 3 + 2 )'
     * @return return list of Command objects representing the operators and operands
     */
    public int solveWithTree(List<Command> commands) {
        for ( Command command : commands) {
            System.out.println(command.toString());
        }

        return 1;
    }

    public List<Command> parseInfix(List<String> commands) {
        return new ArrayList<Command>();
    }

    /**
     * PRINTS OUTPUT of calculated expression to the console
     */
    public void printOutput() {
    }

    // Helper methods for clarities sake≤

}
