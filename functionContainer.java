import java.util.Hashtable;
import java.lang.Math;
import java.util.*;
import java.io.Console;


public class FunctionContainer{
    private List<CalculatorParser.ExprContext> listOfExpressions;
    private List<CalculatorParser.IdContext> listOfParams;

    public FunctionContainer(){
        this.listOfExpressions = null;
        this.listOfParams = null;
    }

    public FunctionContainer(List<CalculatorParser.ExprContext> expressions, List<CalculatorParser.IdContext> params){
        this.listOfExpressions = expressions;
        this.listOfParams = params;
    }

    public List<CalculatorParser.ExprContext> getListOfExpressions(){
        return this.listOfExpressions;
    }

    public List<CalculatorParser.IdContext> getListOfParams(){
        return this.listOfParams;
    }

    
}