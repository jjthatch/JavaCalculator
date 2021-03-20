package Projects.jcalc.model.commands;

import Projects.jcalc.model.CommandVisitor;

public class Number_Command extends Command{

    double operand;

    @Override
    public void accept(CommandVisitor v) {
        v.visitNumber(this);
    }

    public double getOperand() {
        return operand;
    }

    public void setOperand(double operand) {
        this.operand = operand;
    }
}
