package Projects.jcalc.model.commands;

import Projects.jcalc.model.CommandVisitor;

public class Subtraction_Command extends Command{
    int precedence = 1;
    @Override
    public void accept(CommandVisitor v) {
        visitor.visitSubtraction(this);
    }
}
