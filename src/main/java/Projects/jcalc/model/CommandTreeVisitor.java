package Projects.jcalc.model;

public class CommandTreeVisitor {
    private final static CommandTreeVisitor instance = new CommandTreeVisitor();
    private CommandTreeVisitor() {}

    public static CommandTreeVisitor getInstance() {return instance;}
}