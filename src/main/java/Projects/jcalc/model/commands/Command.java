package Projects.jcalc.model.commands;

import Projects.jcalc.model.CommandVisitor;

/**
 * All operands and operators are Commands.
 * Each command will be placed in a tree so that a visitor can visit the commands to
 */
public abstract class Command {
    protected int precedence;

    /**
     * This method accepts a visitor from the (visitor pattern
     */
    abstract void accept(CommandVisitor v);
    //TODO: Create Command_Visitor
}
