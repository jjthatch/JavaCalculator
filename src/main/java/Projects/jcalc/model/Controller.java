package Projects.jcalc.model;

import Projects.jcalc.model.commands.Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static Projects.jcalc.model.ParsingUtility.validateExpression;

public class Controller {

    // Singleton pattern commissioned
    private static  Controller instance = new Controller();
    private Controller(){}

    public static Controller getInstance() {
        return instance;
    }
    public static void setInstance(Controller instance) {
        Controller.instance = instance;
    }


    Scanner keyboardScanner = new Scanner(System.in);
    CommandTreeManager manager = CommandTreeManager.getInstance();

    /**
     * PROCESSES INPUT from User via command line
     * Expressions must be separated by spaces. E.G. '2 + 2 - ( 3 + 2 )'
     * @return return list of Command objects representing the operators and operands
     */
    public Double solveWithRecursiveTree(List<String> commands) {
//        for ( String command : commands) {
//        }
        // Recursively solves the substrings within parenthesis and creates a modified expression based off those results
        int firstParenthesis = commands.indexOf("(");
        while (firstParenthesis != -1) {
            int lastParenthesis = -1;
            int numFirstParenthesis = 0;
            for (int i = 0; i < commands.size(); i++) {
                String token = commands.get(i);
                if (token.equals("(")) {
                    numFirstParenthesis++;
                } else if (token.equals(")")) {
                    if (numFirstParenthesis == 1) {
                        lastParenthesis = i;
                        break;
                    }
                    numFirstParenthesis--;
                }
            }
            List<String> subExpression = commands.subList(firstParenthesis+1,lastParenthesis);

            for (String strigoi : subExpression) {
                System.out.print(strigoi);
            }

            List<String> expression = new ArrayList<>();

            for (int i = 0; i < commands.size(); i++) {
                if (i == firstParenthesis) {
                    Double subResult = solveWithRecursiveTree(subExpression);
                    expression.add(String.valueOf(subResult));
                    i = lastParenthesis;
                } else {
                    expression.add(commands.get(i));
                }
            }
            commands = expression;
            firstParenthesis = commands.indexOf("(");
        } // End of Loops.
        // Now we tell the treemanager what expression we want solved using a tree!
        return manager.solveExpression(commands);
    }

    public Double solveWithTree(List<String> commands) {

        return Double.valueOf(1);
    }

    /**
     * PRINTS OUTPUT of calculated expression to the console
     */
    public void printOutput() {
    }

    // Helper methods for clarities sake≤

}
