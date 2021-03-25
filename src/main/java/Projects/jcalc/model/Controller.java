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
        for ( String command : commands) {
            System.out.println(command);
        }

        // Recursively solves the substrings within parenthesis and creates a modified expression based off those results
        int firstParenthesis = commands.indexOf("(");
        if (firstParenthesis != -1) {
            int lastParenthesis = commands.lastIndexOf(")");
            List<String> subExpression = commands.subList(firstParenthesis+1,lastParenthesis);

            System.out.println("What did we capture in our subexpression?");
            for (String strigoi : subExpression) {
                System.out.print(strigoi);
            }

            List<String> expression;

//            for (int i = 0; i < commands.size(); i++) {
//                if (i == firstParenthesis) {
//                    int subExpressionResult = solveWithRecursiveTree();
//
//                }
//            }
        }

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
