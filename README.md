# bc-antlr-implementation
### Running the Calculator

In order to run the calculator, clone the repo and run the following commands in a terminal window

```
antlr4 Calculator.g4 -visitor -no-listener
javac Calculator*.java
javac FunctionContainer.java EvalVisitor.java bc.java
```

With the code compiled, type `java bc` to enter the Calculator. By default, it is in command line mode and will act as normal bc does: input is typed and every line is evalauated. If the line contains multiple expressions, each expression will return a value to the console.  Otherwise, you can run pass in a file as a command line argument and have the calculator evaluate the text file all at once: `java bc input.txt`

Test cases are containted in test.txt and can be passed in as one input file. 



