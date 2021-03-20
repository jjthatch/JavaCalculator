package Projects.jcalc.model;

import Projects.jcalc.model.commands.Command;

public class CommandTreeVisitor implements CommandVisitor {
    private final static CommandTreeVisitor instance = new CommandTreeVisitor();
    public CommandTreeVisitor() {}

    public static CommandTreeVisitor getInstance() {return instance;}

    public void printTree(Command rootCommand) {
        rootCommand.accept(this);
    }

    public void visitAddition(Command command) {
        command.visitLeft(this);
        command.visitRight(this);
        System.out.println("+ node");
    }
    public void visitSubtraction(Command command) {
        command.visitLeft(this);
        command.visitRight(this);
        System.out.println("- node");
    }
    public void visitMultiplication(Command command) {
        command.visitLeft(this);
        command.visitRight(this);
        System.out.println("* node");
    }
    public void visitDivision(Command command) {
        command.visitLeft(this);
        command.visitRight(this);
        System.out.println("/ node");
    }
    public void visitNumber(Command command) {
        command.visitLeft(this);
        command.visitRight(this);
        System.out.println("NumeroUno");
    }
}