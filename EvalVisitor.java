import java.util.Hashtable;
import java.lang.Math;
import java.util.*;
import java.io.Console;

public class EvalVisitor extends CalculatorBaseVisitor<Double> {
    Stack<Hashtable> scopes = new Stack<Hashtable>();
    Hashtable<String, Double> globalVariables = new Hashtable<String, Double>();
    Hashtable<String, FunctionContainer> functionTable = new Hashtable<String, FunctionContainer>();

    public EvalVisitor() {
        this.scopes.push(this.globalVariables);
    }

    @Override
    public Double visitInput(CalculatorParser.InputContext ctx) {
        return (visitChildren(ctx));
    }

    @Override
    public Double visitComment(CalculatorParser.CommentContext ctx) {
        return 0.0;
    }

    @Override
    public Double visitString(CalculatorParser.StringContext ctx) {
        String returnValue = ctx.STRING().getText().substring(1, ctx.STRING().getText().length() - 1);
        System.out.println(returnValue);
        return 0.0;
    }

    @Override
    public Double visitVarAssign(CalculatorParser.VarAssignContext ctx) {
        double value = visit(ctx.ex);
        Hashtable<String, Double> variables = scopes.peek();
        variables.put(ctx.varName.getText(), value);
        return 0.0;
    }

    @Override
    public Double visitTopExpr(CalculatorParser.TopExprContext ctx) {
        double value = visit(ctx.expr());
        if ((value == Math.floor(value)) && !Double.isInfinite(value)) {
            System.out.println((int)(value));
        }else{
            System.out.println(value);
        }
        return 0.0;// Makes java happy by returning a dummy value
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
    public Double visitInt(CalculatorParser.IntContext ctx) {
        double value = Double.valueOf(ctx.INT().getText());
        return value;
    }

    @Override
    public Double visitAddSub(CalculatorParser.AddSubContext ctx) {
        double left = visit(ctx.el);
        double right = visit(ctx.er);
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
        Hashtable<String, Double> variables = scopes.peek();
        if (variables.get(ctx.var.getText()) == null) {
            return 0.0;
        } else {
            return variables.get(ctx.var.getText());
        }
    }

    @Override
    public Double visitPreCrement(CalculatorParser.PreCrementContext ctx) {
        Hashtable<String, Double> variables = scopes.peek();
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
        Hashtable<String, Double> variables = scopes.peek();
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
    public Double visitNot(CalculatorParser.NotContext ctx) {
        if (Double.valueOf(visit(ctx.ex)) == 0) {
            return 1.0;
        } else {
            return 0.0;
        }
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
    public Double visitWhileLoop(CalculatorParser.WhileLoopContext ctx) {
        while (visit(ctx.ex) != 0) {
            visit(ctx.action);
        }
        return 0.0;
    }

    @Override
    public Double visitForLoop(CalculatorParser.ForLoopContext ctx) {
        // This method is kind of hacky
        // We don't want to make variable assignments participate in expressions so that
        // they can't be used as arguments to function
        // But we do want a function signature that can take expressions
        // So we have the first part of the loop as optionally an expr or a var
        // assignment
        // If it's an expression, ignore the expression as it won't participate in the
        // evaluation of a variable as the loop termination condition
        // I don't know of a for loop that doesn't do that
        // If it's a variable assignment, update the variable in the table (or define
        // it)
        // EX: for(ex1 = expr; ex2 =expr;expr), expr1 will have no bearing on the
        // evaluation of expression 2, but expression 3 might
        if (ctx.ex1 != null) {

        } else {
            visit(ctx.varAss);
        }

        if (ctx.ex3 != null) {
            while (visit(ctx.ex2) != 0) {
                visit(ctx.action);
                visit(ctx.ex3);
            }
        } else {
            while (visit(ctx.ex2) != 0) {
                visit(ctx.action);
                visit(ctx.varUpdate);
            }
        }

        return 0.0;
    }

    @Override
    public Double visitFunctionCall(CalculatorParser.FunctionCallContext ctx) {
        Hashtable<String, Double> newScope = (Hashtable) scopes.peek().clone();// Global scope is copies and can be
                                                                               // edited without messing with the true
                                                                               // global scope
        scopes.push(newScope);
        double finalValue = 0.0;
        FunctionContainer function = functionTable.get(ctx.funcName.getText());
        List<CalculatorParser.ExprContext> expressions = function.getListOfExpressions();
        List<CalculatorParser.IdContext> paramVars = function.getListOfParams();
        List<CalculatorParser.ExprContext> arguments = ctx.argumentList().expr();
        if (arguments.size() != paramVars.size()) {
            System.out.println("Not enough arguments for function call");
            return 0.0;
        } else {
            for (int i = 0; i < paramVars.size(); i++) {
                newScope.put(paramVars.get(i).ID().getText(), visit(arguments.get(i)));
            }
        }
        for (CalculatorParser.ExprContext expr : expressions) {
            finalValue = visit(expr);
        }
        scopes.pop();
        return finalValue;
    }

    @Override
    public Double visitFunctionDef(CalculatorParser.FunctionDefContext ctx) {
        String functionName = ctx.funcName.getText();
        List<CalculatorParser.ExprContext> expressionList = new ArrayList();
        List<CalculatorParser.IdContext> paramList = new ArrayList();
        if (ctx.exprList() != null) {
            expressionList = ctx.exprList().expr();
        }
        if (ctx.paramList() != null) {
            paramList = ctx.paramList().id();
        }
        expressionList.add(ctx.returnValue);
        FunctionContainer newFunction = new FunctionContainer(expressionList, paramList);
        functionTable.put(functionName, newFunction);
        return 0.0;
    }

}