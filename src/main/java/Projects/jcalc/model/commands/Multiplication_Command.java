package Projects.jcalc.model.commands;

import Projects.jcalc.model.CommandVisitor;

public class Multiplication_Command extends Command{
    int precedence = 2;
    @Override
    public void accept(CommandVisitor v) {
        visitor.visitMultiplication(this);
    }
}
