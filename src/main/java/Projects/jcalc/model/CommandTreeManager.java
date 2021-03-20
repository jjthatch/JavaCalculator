package Projects.jcalc.model;

import Projects.jcalc.model.commands.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton which is in charge of saving and accessing all trees.
 */
public class CommandTreeManager {

    // Singleton pattern commisioned
    private static  CommandTreeManager instance = new CommandTreeManager();
    private CommandTreeManager(){}

    public static CommandTreeManager getInstance() {
        return instance;
    }
    public static void setInstance(CommandTreeManager instance) {
        CommandTreeManager.instance = instance;
    }

    // Visitors and Builders ready to work sir.
    CommandTreeVisitor treeVisitor = CommandTreeVisitor.getInstance();
    CommandTreeBuilder treeBuilder = CommandTreeBuilder.getInstance();


    /**
     * Transforms the given expression into a solution. No questions asked
     */
    public int solveExpression(List<String> commands) {
        buildExpressionTree(commands);

        return -1;
    }
    /**
     * Given an array of commands, will construct the necessary tree and store it.
     */
    private Command buildExpressionTree(List<String> commands) {
        // TODO: Pass everything needed to the buildExpressionTree
        for (String commandToken : commands) {

        }

        return null;
    }

    /**
     * Utilizes given Visitor to traverse and solve expression tree
     * @return returns solution to problem
     */
    private int solveExpressionTree() {
        return 1;
    }
}
