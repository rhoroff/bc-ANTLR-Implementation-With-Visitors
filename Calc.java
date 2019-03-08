import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import org.antlr.v4.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) {
            inputFile = args[0];
            InputStream is = new FileInputStream(inputFile);
            ANTLRInputStream input = new ANTLRInputStream(is);
            CalculatorLexer lexer = new CalculatorLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CalculatorParser parser = new CalculatorParser(tokens);
            ParseTree tree = parser.input();
            EvalVisitor eval = new EvalVisitor();
            eval.visit(tree);
        }else{
            Scanner input = new Scanner(System.in);
            EvalVisitor eval = new EvalVisitor();
            while(input.hasNextLine()){
                ANTLRInputStream ANTLRinput = new ANTLRInputStream(input.nextLine());
                CalculatorLexer lexer = new CalculatorLexer(ANTLRinput);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                CalculatorParser parser = new CalculatorParser(tokens);
                ParseTree tree = parser.input();
                eval.visit(tree);
            }
        }
    }
}