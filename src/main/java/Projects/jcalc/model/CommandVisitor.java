package Projects.jcalc.model;

/**
 * Visits data structure that stores calculator commands. It actually implements the logic behind each command node.
 */
public interface CommandVisitor {
    public void add();
    public void subtract();
    public void multiply();
    public void divide();
    public void popnum();
}
