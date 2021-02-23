package Projects.jcalc.model;

public class CommandTreeVisitor implements CommandVisitor {
    private static CommandTreeVisitor instance = new CommandTreeVisitor();
    CommandTreeVisitor(){}

    public static CommandTreeVisitor getInstance() {
        return instance;
    }

    @Override
    public void add() {

    }

    @Override
    public void subtract() {

    }

    @Override
    public void multiply() {

    }

    @Override
    public void divide() {

    }

    @Override
    public void popnum() {

    }
}
