import java.util.Hashtable;
import java.lang.Math;
import java.util.*;
import java.io.Console;



public class EvalVisitor extends CalculatorBaseVisitor<Double>{
    @Override
    public Double visitNegate(CalculatorParser.NegateContext ctx){
        System.out.println("Made it into the neg eval visitor");
        double value = visit(ctx.expr());
        System.out.println(value);
        return value * -1;
    }
    @Override
	public Double visitDouble(CalculatorParser.DoubleContext ctx){
        System.out.println("Made it into the double eval visitor");
        double value = Double.valueOf(ctx.DOUBLE().getText());
        System.out.println("Value of double is " + value);
        return value;
    }
    @Override
    public Double visitInput(CalculatorParser.InputContext ctx){
        Double value = visit(ctx.topExpr(0));
        System.out.println("Result:" + value);
        return 0.0;
    }
    @Override
    public Double visitTopExpr(CalculatorParser.TopExprContext ctx){
        System.out.println("Made it into the visitTopExpr eval Visitor");
        double value = visit(ctx.expr());
        System.out.println("Result: " + value);
        return 0.0;//Makes java happy by returning a dummy value
    }
    @Override 
    public Double visitInt(CalculatorParser.IntContext ctx){
        System.out.println("Made it into the visitInt eval Visitor");
        double value = Double.valueOf(ctx.INT().getText());
        return value;
    }
    @Override
    public Double visitAddSub(CalculatorParser.AddSubContext ctx){
        double left = visit(ctx.el);
        double right = visit(ctx.er);
        double value;
        if(ctx.op.getText().equals("+")){
            return left + right;
        }else{
            return left - right;
        }
    }
    public Double visitDivTimesMod(CalculatorParser.DivTimesModContext ctx){
        double left = visit(ctx.el);
        double right = visit(ctx.er);
        double value;
        if(ctx.op.getText().equals("%")){
            return left % right;
        }else if(ctx.op.getText().equals("/")){
            return left / right;
        }else{
            return left * right;
        }
    }
}