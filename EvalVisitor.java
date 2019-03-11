import java.util.Hashtable;
import java.lang.Math;
import java.util.*;
import java.io.Console;

public class EvalVisitor extends CalculatorBaseVisitor<Double> {
    Hashtable<String, Double> variables = new Hashtable<String, Double>();

    @Override
    public Double visitInput(CalculatorParser.InputContext ctx) {
        return (visitChildren(ctx));
    }

    @Override
    public Double visitNegate(CalculatorParser.NegateContext ctx) {
        double value = visit(ctx.expr());
        return value * -1;
    }

    @Override
    public Double visitDouble(CalculatorParser.DoubleContext ctx) {
        double value = Double.valueOf(ctx.DOUBLE().getText());
        return value;
    }

    @Override
    public Double visitTopExpr(CalculatorParser.TopExprContext ctx) {
        double value = visit(ctx.expr());
        System.out.println("Result: " + value);
        return 0.0;// Makes java happy by returning a dummy value
    }

    @Override
    public Double visitInt(CalculatorParser.IntContext ctx) {
        double value = Double.valueOf(ctx.INT().getText());
        return value;
    }

    @Override
    public Double visitAddSub(CalculatorParser.AddSubContext ctx) {
        double left = visit(ctx.el);
        double right = visit(ctx.er);
        double value;
        if (ctx.op.getText().equals("+")) {
            return left + right;
        } else {
            return left - right;
        }
    }

    @Override
    public Double visitDivTimesMod(CalculatorParser.DivTimesModContext ctx) {
        double left = visit(ctx.el);
        double right = visit(ctx.er);
        double value;
        if (ctx.op.getText().equals("%")) {
            return left % right;
        } else if (ctx.op.getText().equals("/")) {
            return left / right;
        } else {
            return left * right;
        }
    }

    @Override
    public Double visitPow(CalculatorParser.PowContext ctx) {
        double base = visit(ctx.el);
        double power = visit(ctx.er);
        return Math.pow(base, power);
    }

    @Override
    public Double visitSin(CalculatorParser.SinContext ctx) {
        double operand = visit(ctx.ex);
        return Math.sin(operand);
    }

    @Override
    public Double visitCos(CalculatorParser.CosContext ctx) {
        double operand = visit(ctx.ex);
        return Math.cos(operand);
    }

    @Override
    public Double visitLn(CalculatorParser.LnContext ctx) {
        double operand = visit(ctx.ex);
        return Math.log(operand);
    }

    @Override
    public Double visitExp(CalculatorParser.ExpContext ctx) {
        double operand = visit(ctx.ex);
        return Math.exp(operand);
    }

    public Double visitSqrt(CalculatorParser.SqrtContext ctx) {
        double operand = visit(ctx.ex);
        return Math.sqrt(operand);
    }

    @Override
    public Double visitExprParen(CalculatorParser.ExprParenContext ctx) {
        double value = visit(ctx.ex);
        return value;
    }

    @Override
    public Double visitVarRead(CalculatorParser.VarReadContext ctx) {
        if (variables.get(ctx.var.getText()) == null) {
            return 0.0;
        } else {
            return variables.get(ctx.var.getText());
        }
    }

    @Override
    public Double visitVarAssign(CalculatorParser.VarAssignContext ctx) {
        double value = visit(ctx.ex);
        variables.put(ctx.varName.getText(), value);
        return 0.0;
    }

    @Override
    public Double visitPreCrement(CalculatorParser.PreCrementContext ctx) {
        if (ctx.op.getText().equals("++")) {
            if (variables.get(ctx.variable.getText()) == null) {
                variables.put(ctx.variable.getText(), 1.0);
                return 1.0;
            } else {
                double value = variables.get(ctx.variable.getText()) + 1;// Value after increment +1
                variables.put(ctx.variable.getText(), value);// Increment the value in the variable table
                return value;// return modified value
            }
        }
        if (ctx.op.getText().equals("--")) {
            if (variables.get(ctx.variable.getText()) == null) {
                variables.put(ctx.variable.getText(), -1.0);
                return -1.0;
            } else {
                double value = variables.get(ctx.variable.getText()) - 1;// Value before increment
                variables.put(ctx.variable.getText(), value);// Increment the value in the variable table
                return value;// return modified value
            }
        } else {
            return 0.0;
        }
    }

    @Override
    public Double visitPostCrement(CalculatorParser.PostCrementContext ctx) {
        if (ctx.op.getText().equals("++")) {
            if (variables.get(ctx.variable.getText()) == null) {
                variables.put(ctx.variable.getText(), 1.0);
                return 0.0;
            } else {
                double value = variables.get(ctx.variable.getText());// Value before increment
                variables.put(ctx.variable.getText(), value + 1);// Increment the value in the variable table
                return value;// return unmodified value
            }
        }
        if (ctx.op.getText().equals("--")) {
            if (variables.get(ctx.variable.getText()) == null) {
                variables.put(ctx.variable.getText(), -1.0);
                return 0.0;
            } else {
                double value = variables.get(ctx.variable.getText());// Value before decrement
                variables.put(ctx.variable.getText(), value - 1);// Increment the value in the variable table
                return value;// return unmodified value
            }
        } else {
            return 0.0;
        }
    }

    @Override
    public Double visitComment(CalculatorParser.CommentContext ctx) {
        return 0.0;
    }

    @Override
    public Double visitEquals(CalculatorParser.EqualsContext ctx) {
        if (Double.valueOf(visit(ctx.el)).equals(Double.valueOf(visit(ctx.er)))) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    @Override
    public Double visitLessThan(CalculatorParser.LessThanContext ctx) {
        if (Double.valueOf(visit(ctx.el)) < (Double.valueOf(visit(ctx.er)))) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    @Override
    public Double visitGreaterThan(CalculatorParser.GreaterThanContext ctx) {
        if (Double.valueOf(visit(ctx.el)) > (Double.valueOf(visit(ctx.er)))) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    @Override
    public Double visitLessThanEquals(CalculatorParser.LessThanEqualsContext ctx) {
        if (Double.valueOf(visit(ctx.el)) <= (Double.valueOf(visit(ctx.er)))) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    @Override
    public Double visitGreaterThanEquals(CalculatorParser.GreaterThanEqualsContext ctx) {
        if (Double.valueOf(visit(ctx.el)) >= (Double.valueOf(visit(ctx.er)))) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    @Override
    public Double visitNotEquals(CalculatorParser.NotEqualsContext ctx) {
        if (!Double.valueOf(visit(ctx.el)).equals(Double.valueOf(visit(ctx.er)))) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    @Override
    public Double visitAnd(CalculatorParser.AndContext ctx) {
        if (Double.valueOf(visit(ctx.el)) != 0 && Double.valueOf(visit(ctx.er)) != 0) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    @Override
    public Double visitOr(CalculatorParser.OrContext ctx) {
        if (Double.valueOf(visit(ctx.el)) != 0 || Double.valueOf(visit(ctx.er)) != 0) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    @Override
    public Double visitNot(CalculatorParser.NotContext ctx) {
        if (Double.valueOf(visit(ctx.ex)) == 0) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    @Override
    public Double visitString(CalculatorParser.StringContext ctx) {
        String returnValue = ctx.STRING().getText().substring(1, ctx.STRING().getText().length() - 1);
        System.out.println(returnValue);
        return 0.0;
    }

    @Override
    public Double visitIfStatement(CalculatorParser.IfStatementContext ctx) {
        double ifCond = visit(ctx.cond);// This will either return a number or an expression
        double returnValue;// Value will change depending on the logic of the statement
        if (ifCond != 0) {
            returnValue = visit(ctx.action);
            return returnValue;
        }
        if (ctx.ELSE() != null) {
            returnValue = visit(ctx.altAction);
            return returnValue;
        }
        return 0.0;
    }

    @Override
    public Double visitWhileLoop(CalculatorParser.WhileLoopContext ctx){
        while(visit(ctx.ex) != 0){
            visit(ctx.action);
        }
        return 0.0;
    }

    @Override public Double visitForLoop(CalculatorParser.ForLoopContext ctx){
        double initialValue = visit(ctx.ex1);
        while (visit(ctx.ex2) != 0){
            visit(ctx.action);
            visit(ctx.ex3);
        }
        return 0.0;
    }
}