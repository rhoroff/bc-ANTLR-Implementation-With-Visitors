import java.util.Hashtable;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

import java.lang.Math;
import java.util.*;
import java.io.Console;

public class EvalVisitor extends CalculatorBaseVisitor<Double>{
    Hashtable<String, Double> variables = new Hashtable<String,Double>();

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

    @Override
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

    @Override
    public Double visitPow(CalculatorParser.PowContext ctx){
        double base = visit(ctx.el);
        double power = visit(ctx.er);
        return Math.pow(base,power);
    }

    @Override
    public Double visitSin(CalculatorParser.SinContext ctx){
        double operand = visit(ctx.ex);
        return Math.sin(operand);
    }

    @Override
    public Double visitCos(CalculatorParser.CosContext ctx){
        double operand = visit(ctx.ex);
        return Math.cos(operand);
    }

    @Override
    public Double visitLn(CalculatorParser.LnContext ctx){
        double operand = visit(ctx.ex);
        return Math.log(operand);
    }

    @Override
    public Double visitExp(CalculatorParser.ExpContext ctx){
        double operand = visit(ctx.ex);
        return Math.exp(operand);
    }

    public Double visitSqrt(CalculatorParser.SqrtContext ctx){
        double operand = visit(ctx.ex);
        return Math.sqrt(operand);
    }

    @Override 
    public Double visitParen(CalculatorParser.ParenContext ctx){
        double value = visit(ctx.ex);
        return value;
    }
    @Override
    public Double visitVarRead(CalculatorParser.VarReadContext ctx){
        if(variables.get(ctx.var.getText()) == null){
            return 0.0;
        }else{
            return variables.get(ctx.var.getText());
        }
    }

    @Override
    public Double visitVarAssign(CalculatorParser.VarAssignContext ctx){
        double value = visit(ctx.ex);
        variables.put(ctx.varName.getText(), value);
        return 0.0;
    }

    @Override
    public Double visitPreCrement(CalculatorParser.PreCrementContext ctx){
        if(ctx.op.getText().equals("++")){
            if(variables.get(ctx.variable.getText()) == null){
                variables.put(ctx.variable.getText(), 1.0);
                return 1.0;
            }else{ 
                double value = variables.get(ctx.variable.getText()) + 1;//Value after increment +1
                variables.put(ctx.variable.getText(), value);//Increment the value in the variable table
                return value;//return modified value
            }
        }
        if(ctx.op.getText().equals("--")){
            if(variables.get(ctx.variable.getText()) == null){
                variables.put(ctx.variable.getText(), -1.0);
                return -1.0;
            }else{ 
                double value = variables.get(ctx.variable.getText()) - 1;//Value before increment
                variables.put(ctx.variable.getText(), value);//Increment the value in the variable table
                return value;//return modified value
            }
        }else{
            return 0.0;
        }
    }

    @Override
    public Double visitPostCrement(CalculatorParser.PostCrementContext ctx){
        variables.put("x", 21.0);
        if(ctx.op.getText().equals("++")){
            if(variables.get(ctx.variable.getText()) == null){
                variables.put(ctx.variable.getText(), 1.0);
                return 0.0;
            }else{ 
                double value = variables.get(ctx.variable.getText());//Value before increment
                variables.put(ctx.variable.getText(), value + 1);//Increment the value in the variable table
                return value;//return unmodified value
            }
        }
        if(ctx.op.getText().equals("--")){
            if(variables.get(ctx.variable.getText()) == null){
                variables.put(ctx.variable.getText(), -1.0);
                return 0.0;
            }else{ 
                double value = variables.get(ctx.variable.getText());//Value before decrement
                variables.put(ctx.variable.getText(), value - 1);//Increment the value in the variable table
                return value;//return unmodified value
            }
        }else{
            return 0.0;
        }
    }


}