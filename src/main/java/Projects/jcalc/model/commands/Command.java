package Projects.jcalc.model.commands;

import Projects.jcalc.model.CommandTreeVisitor;
import Projects.jcalc.model.CommandVisitor;

import java.util.Objects;

/**
 * All operands and operators are Commands.
 * Each command will be placed in a tree so that a visitor can visit the commands to
 */
public abstract class Command {
    protected int precedence;
    protected Command left;
    protected Command right;
    protected CommandTreeVisitor visitor = CommandTreeVisitor.getInstance();

    /**
     * This method accepts a visitor from the (visitor pattern
     */
    public abstract void accept(CommandVisitor v);

    public Command getLeft() {
        return left;
    }

    public void setLeft(Command left) {
        this.left = left;
    }

    public void visitLeft(CommandTreeVisitor v) {
        if (!Objects.isNull(left)) {
            left.accept(v);
        }
    }
    public void visitRight(CommandTreeVisitor v) {
        if (!Objects.isNull(left)) {
            right.accept(v);
        }

    }

    public int getPrecedence() {
        return precedence;
    }

    public void setPrecedence(int precedence) {
        this.precedence = precedence;
    }
    public Command getRight() {
        return right;
    }

    public void setRight(Command right) {
        this.right = right;
    }
}
