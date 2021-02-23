package Projects.jcalc.model;

import Projects.jcalc.model.commands.Command;

import java.util.ArrayList;

/**
 * Singleton which is in charge of saving and accessing all trees.
 */
public class CommandTreeManager {
    // Visitors and Builders ready to work sir.
    CommandTreeVisitor treeVisitor = CommandTreeVisitor.getInstance();
    CommandTreeBuilder treeBuilder = CommandTreeBuilder.getInstance();
    private static  CommandTreeManager instance = new CommandTreeManager();

    private CommandTreeManager(){}

    public static CommandTreeManager getInstance() {
        return instance;
    }
    public static void setInstance(CommandTreeManager instance) {
        CommandTreeManager.instance = instance;
    }

    /**
     * Transforms the given expression into a solution. No questions asked
     */
    public int solveExpression(ArrayList<Command> commands) {
        return 1;
    }
    /**
     * Given an array of commands, will construct the necessary tree and store it.
     */
    public void buildExpressionTree(ArrayList<Command> commands) {
        // TODO:
    }

    /**
     * Utilizes given Visitor to traverse and solve expression tree
     * @return returns solution to problem
     */
    public int solveExpressionTree() {
        return 1;
    }
}
