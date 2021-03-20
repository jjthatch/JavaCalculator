package Projects.jcalc.model;

import Projects.jcalc.model.commands.Command;

/**
 * Visits data structure that stores calculator commands. It actually implements the logic behind each command node.
 */
public interface CommandVisitor {
    public abstract void visitAddition(Command command);
    public abstract void visitSubtraction(Command command);
    public abstract void visitMultiplication(Command command);
    public abstract void visitDivision(Command command);
    public abstract void visitNumber(Command command);
}
