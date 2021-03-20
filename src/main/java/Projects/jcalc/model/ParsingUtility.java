package Projects.jcalc.model;

import Projects.jcalc.model.commands.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class that determines the validity of Expressions
 */
public class ParsingUtility {
    // Cannot instantiate now
    private ParsingUtility(){}

    // Static methods to be called anywhere in the calculator
    public static boolean validateExpression(List<String> infixStringArray) {
        // Flags
        boolean operandNext = true;
        int numClosingParenthesisNeeded = 0;

        // Logic
        for (String command : infixStringArray) {
            // Conditional Logic
//            System.out.print(command + " : ");
            if (command.matches("[1234567890]") && operandNext) {
                operandNext = false;
//                System.out.println("A number, need an operator...");
            } else if (command.equals("(") && operandNext) {
                numClosingParenthesisNeeded = 1;
                operandNext = true;
//                System.out.println("Left Parenthesis, Need number now...");
            } else if (command.matches("[+/*%-]")) {
                operandNext = true;
//                System.out.println("An Operator, now needs a number");
            } else if (!operandNext && command.equals(")")) {
                numClosingParenthesisNeeded -= 1;
                operandNext = false;
//                System.out.println("A right parenthesis, an operator should be coming");
            } else {
//                System.out.println("Your expression has failed");
                return false;
            }
        }
        if (numClosingParenthesisNeeded != 0) {
            System.out.println("Your expression has an innapropriate number of parenthesis. It is important that we maintain parental balance in our equations");
            return false;
        }

        return true;
    }
}
