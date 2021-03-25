# java-calculator

# Instructions for running calculator

This is a maven java project and has been tested and run on IntelliJ as well as Eclipse.

To use, Clone master onto machine.
In given ide, run the main() function from the shellview java class.
Instructions should appear on shell utility.

# Calculator design and general usage
 Simple Command Line Calculator to translate an old C++ Calculator Project into the Java framework.
 This calculator is designed to be more generic and eventually allow for multiple algorithm to solve the same problem of calculating a math expression.
 
 Currently, this calculator works in the command line.
 Main() must be run from the class shellview, which allows for mathematical expression to be entered via the current shell
 
 The basic operations of the Java language are for only two numbers.
 * 3 + 3
 * 3 - 3
 * 3 / 3
 * 3 * 3

Precedence and grouping is handled by the application itself
 * 3 + 3 / 3
 * ( 3 + 3 ) - ( 2 + 2 )
 * 3 * 4 / 2 * 1

This is accomplished by implementing an expression parsing tree to track the precedence of the operators.

Currently implemented algorithms
 * Recursive Parse tree.
   * Going from left to right, a subexpression is recursively selected from the first found pair of parenthesis. Each subexpression becomes a parse tree and solved.
   * Example
   * 3 * ( 3 - 2 ) -> sub expression 3 - 2 is calculated and returned. now 3 * 1 is calculated
 
Planned algorithm
 * Parse tree that handles parenthesis
   * based on received parenthesis, the express tree builder will go up or down various nodes to construct the proper expressoon.
