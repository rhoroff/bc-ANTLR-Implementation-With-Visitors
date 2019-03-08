import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import org.antlr.v4.*;
import org.antlr.v4.runtime.ANTLRInputStream;
public class Calc{
    public static void main(String[] args)throws Exception{
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        CalculatorLexer lexer = new CalculatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.topExpr();
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }
}