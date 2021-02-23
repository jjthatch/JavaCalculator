package Projects.jcalc.model;

public class CommandTreeBuilder {
    private static CommandTreeBuilder instance = new CommandTreeBuilder();
    CommandTreeBuilder(){}

    public static CommandTreeBuilder getInstance() {
        return instance;
    }
}
