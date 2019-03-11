// Generated from Calculator.g4 by ANTLR 4.7.2

    import java.util.Hashtable;
    import java.lang.Math;
    import java.util.*;
    import java.io.Console;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(CalculatorParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(CalculatorParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(CalculatorParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#varAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssign(CalculatorParser.VarAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#topExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopExpr(CalculatorParser.TopExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(CalculatorParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(CalculatorParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Read}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(CalculatorParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(CalculatorParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(CalculatorParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ln}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLn(CalculatorParser.LnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParen(CalculatorParser.ExprParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(CalculatorParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cos}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(CalculatorParser.CosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sqrt}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrt(CalculatorParser.SqrtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(CalculatorParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivTimesMod}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivTimesMod(CalculatorParser.DivTimesModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEquals}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEquals(CalculatorParser.NotEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThanEquals}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanEquals(CalculatorParser.GreaterThanEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(CalculatorParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(CalculatorParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarRead}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarRead(CalculatorParser.VarReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(CalculatorParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostCrement}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostCrement(CalculatorParser.PostCrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sin}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSin(CalculatorParser.SinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(CalculatorParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate(CalculatorParser.NegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Exp}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(CalculatorParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreCrement}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreCrement(CalculatorParser.PreCrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThanEquals}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanEquals(CalculatorParser.LessThanEqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(CalculatorParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link CalculatorParser#loops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(CalculatorParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link CalculatorParser#loops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(CalculatorParser.ForLoopContext ctx);
}