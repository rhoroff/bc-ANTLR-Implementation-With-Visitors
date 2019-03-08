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
	 * Visit a parse tree produced by {@link CalculatorParser#varAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssign(CalculatorParser.VarAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#topBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopBool(CalculatorParser.TopBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(CalculatorParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#topExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopExpr(CalculatorParser.TopExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ln}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLn(CalculatorParser.LnContext ctx);
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
	 * Visit a parse tree produced by the {@code VarAss}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAss(CalculatorParser.VarAssContext ctx);
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
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(CalculatorParser.ParenContext ctx);
}