package Projects.jcalc.model.commands;

import Projects.jcalc.model.CommandVisitor;

public class Addition_Command extends Command{
    int precedence = 1;

    public void accept(CommandVisitor v) {
        visitor.visitAddition(this);
    }
}
