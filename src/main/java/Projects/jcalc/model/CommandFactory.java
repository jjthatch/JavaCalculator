package Projects.jcalc.model;

import Projects.jcalc.model.commands.Addition_Command;
import Projects.jcalc.model.commands.Division_Command;
import Projects.jcalc.model.commands.Multiplication_Command;
import Projects.jcalc.model.commands.Subtraction_Command;

public class CommandFactory {
    public static Addition_Command buildAdditionCommand() {
        return new Addition_Command();
    }
    public static Subtraction_Command buildSubtractionCommand() {
        return new Subtraction_Command();
    }
    public static Division_Command buildDivisionCommand() {
        return new Division_Command();
    }
    public static Multiplication_Command buildMultiplicationCommand() {
        return new Multiplication_Command();
    }
}
