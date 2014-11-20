// Generated from ValueExpression.g by ANTLR 4.3

    package expressionparser;
    import trace.*;
    import org.eclipse.emf.common.util.EList;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ValueExpressionParser}.
 */
public interface ValueExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ValueExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ValueExpressionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValueExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ValueExpressionParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link ValueExpressionParser#arrayDef}.
	 * @param ctx the parse tree
	 */
	void enterArrayDef(@NotNull ValueExpressionParser.ArrayDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValueExpressionParser#arrayDef}.
	 * @param ctx the parse tree
	 */
	void exitArrayDef(@NotNull ValueExpressionParser.ArrayDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link ValueExpressionParser#structDef}.
	 * @param ctx the parse tree
	 */
	void enterStructDef(@NotNull ValueExpressionParser.StructDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValueExpressionParser#structDef}.
	 * @param ctx the parse tree
	 */
	void exitStructDef(@NotNull ValueExpressionParser.StructDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link ValueExpressionParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull ValueExpressionParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValueExpressionParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull ValueExpressionParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link ValueExpressionParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(@NotNull ValueExpressionParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValueExpressionParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(@NotNull ValueExpressionParser.PairContext ctx);
}