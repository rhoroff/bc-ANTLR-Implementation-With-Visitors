import java.util.Hashtable;

import CalculatorParser.ExprContext;

import java.lang.Math;
import java.util.*;
import java.io.Console;

public class functionContainer{
    private String functionName;
    private List<CalculatorParser.ExprContext> listOfExpressions;
    private List<CalculatorParser.ExprContext> listOfParams;

    public String getFunctionName(){
        return this.functionName;
    }

    public String setFunctionName(String name){
        this.functionName = newName;
    }

    public List<CalculatorParser.ExprContext> getListofExpressions(){
        return this.listOfExpressions;
    }

    public List<CalculatorParser.ExprContext> getListOfParams(){
        return this.listOfParams;
    }

    public evaluateFunction()

}