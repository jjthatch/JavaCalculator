package Projects.jcalc.model.commands;

import Projects.jcalc.model.CommandVisitor;

public class Division_Command extends Command {
    int precedence = 2;
    @Override
    public void accept(CommandVisitor v) {
        visitor.visitDivision(this);
    }
}
