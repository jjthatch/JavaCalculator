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
    CommandTreeBuilder treeBuilder = new CommandTreeBuilder();


    /**
     * Transforms the given expression into a solution. No questions asked
     */
    public Double solveExpression(List<String> commands) {

        // Cycles through all commands and constructs an expression tree, THEN records the root of that tree.
        for (String command : commands) {
            switch (command) {
                case "+" : treeBuilder.buildAddition();
                break;
                case "-" : treeBuilder.buildSubtraction();
                break;
                case "*" : treeBuilder.buildMultiplication();
                break;
                case "/" : treeBuilder.buildDivision();
                break;
                default :
                    if (command.matches("\\d+.\\d+|\\d+")) {
                        treeBuilder.buildNumber(command);
                } else {
                	// TODO: an error must be thrown
                    }
            }
        }
        Command root = treeBuilder.getRoot();
        treeBuilder.reset();

        root.accept(treeVisitor);
        Double result = treeVisitor.getResult();

        return result;
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
