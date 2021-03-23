package Projects.jcalc.model;

import Projects.jcalc.model.commands.*;

import java.util.Stack;

public class CommandTreeBuilder {

    Stack<Command> tempCommands = new Stack<>();
    Stack<Command> postfix = new Stack<>();
    Command inboundNode;
    Command swap;

    public Command getRoot() {
        return tempCommands.peek();
    }
    public void buildNumber(String command) {
        Double.valueOf(command);
        inboundNode = new Number_Command();
        Number_Command numCommand = (Number_Command)inboundNode;
        numCommand.setOperand(Double.valueOf(command));
        postfix.push(numCommand);
    }
    public void buildAddition() {
        inboundNode = new Addition_Command();
        addNodeLogic(inboundNode);
    }
    public void buildSubtraction() {
        inboundNode = new Subtraction_Command();
        addNodeLogic(inboundNode);
    }
    public void buildMultiplication() {
        inboundNode = new Multiplication_Command();
        addNodeLogic(inboundNode);
    }
    public void buildDivision() {
        inboundNode = new Division_Command();
        addNodeLogic(inboundNode);
    }
//    public void buildModulus() {
//        inboundNode = new A();
//        addNodeLogic(inboundNode);
//    }
    public void reset() {

        while ( !tempCommands.isEmpty()) {
            swap = tempCommands.pop();
            swap.setRight(postfix.pop());
            swap.setLeft(postfix.pop());
            postfix.push(swap);
        }

        tempCommands.clear();
        postfix.clear();
        inboundNode = null;
        swap = null;
    }
    private void addNodeLogic(Command inboundNode) {
        if (tempCommands.empty()) {
            tempCommands.push(inboundNode);
            return;
        } else {
            Command top = tempCommands.peek();
            while ((inboundNode.getPrecedence() <= top.getPrecedence()) && !tempCommands.isEmpty()) {
                swap = tempCommands.pop();
                swap.setRight(postfix.pop());
                swap.setLeft(postfix.pop());
                postfix.push(swap);
            }

            if (tempCommands.isEmpty() || (inboundNode.getPrecedence() > tempCommands.peek().getPrecedence())) {
                tempCommands.push(inboundNode);
            }
        }
    }
}
