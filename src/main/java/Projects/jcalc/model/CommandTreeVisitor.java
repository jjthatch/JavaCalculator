package Projects.jcalc.model;

import Projects.jcalc.model.commands.Command;
import Projects.jcalc.model.commands.Number_Command;

import java.util.Stack;

public class CommandTreeVisitor implements CommandVisitor {
    private final static CommandTreeVisitor instance = new CommandTreeVisitor();
    private CommandTreeVisitor() {}

    public static CommandTreeVisitor getInstance() {return instance;}

    private Stack<Double> result = new Stack<>();

    public void printTree(Command rootCommand) {
        rootCommand.accept(this);
    }

    public Double getResult() {
        return result.pop();
    }

    public void visitAddition(Command command) {
        command.visitLeft(this);
        command.visitRight(this);
        System.out.println("+ node");

        Double right = result.pop();
        Double left = result.pop();
        result.push(left + right);

    }
    public void visitSubtraction(Command command) {
        command.visitLeft(this);
        command.visitRight(this);
        System.out.println("- node");

        Double right = result.pop();
        Double left = result.pop();
        result.push(left - right);
    }
    public void visitMultiplication(Command command) {
        command.visitLeft(this);
        command.visitRight(this);
        System.out.println("* node");

        Double right = result.pop();
        Double left = result.pop();
        result.push(left * right);
    }
    public void visitDivision(Command command) {
        command.visitLeft(this);
        command.visitRight(this);
        System.out.println("/ node");

        Double right = result.pop();
        Double left = result.pop();
        result.push(left / right);
    }
    public void visitNumber(Command command) {
        command.visitLeft(this);
        command.visitRight(this);
        System.out.println("NumeroUno");

        Number_Command numberCommand = (Number_Command)command;
        result.push(numberCommand.getOperand());
    }
}