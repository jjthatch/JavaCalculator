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
            if (command.matches("[1234567890]") && operandNext) {
                operandNext = false;
            } else if (command.equals("(") && operandNext) {
                numClosingParenthesisNeeded = 1;
                operandNext = true;
            } else if (command.matches("[+/*%-]") && !operandNext) {
                operandNext = true;
            } else if (!operandNext && command.equals(")")) {
                numClosingParenthesisNeeded -= 1;
                operandNext = false;
            } else {
                return false;
            }
        }
        if (numClosingParenthesisNeeded != 0) {
            return false;
        }

        return true;
    }
}
