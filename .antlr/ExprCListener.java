// Generated from c:/Users/User/Documents/TrabalhoDeCompilador/CompiladorTianex/ExprC.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprCParser}.
 */
public interface ExprCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExprCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExprCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#preprocessorDirective}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessorDirective(ExprCParser.PreprocessorDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#preprocessorDirective}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessorDirective(ExprCParser.PreprocessorDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ExprCParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ExprCParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(ExprCParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(ExprCParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(ExprCParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(ExprCParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(ExprCParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(ExprCParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ExprCParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ExprCParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(ExprCParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(ExprCParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#structMember}.
	 * @param ctx the parse tree
	 */
	void enterStructMember(ExprCParser.StructMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#structMember}.
	 * @param ctx the parse tree
	 */
	void exitStructMember(ExprCParser.StructMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#unionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUnionDeclaration(ExprCParser.UnionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#unionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUnionDeclaration(ExprCParser.UnionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#unionMember}.
	 * @param ctx the parse tree
	 */
	void enterUnionMember(ExprCParser.UnionMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#unionMember}.
	 * @param ctx the parse tree
	 */
	void exitUnionMember(ExprCParser.UnionMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ExprCParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ExprCParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ExprCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ExprCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(ExprCParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(ExprCParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#printfStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintfStatement(ExprCParser.PrintfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#printfStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintfStatement(ExprCParser.PrintfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#scanfStatement}.
	 * @param ctx the parse tree
	 */
	void enterScanfStatement(ExprCParser.ScanfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#scanfStatement}.
	 * @param ctx the parse tree
	 */
	void exitScanfStatement(ExprCParser.ScanfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(ExprCParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(ExprCParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ExprCParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ExprCParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(ExprCParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(ExprCParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(ExprCParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(ExprCParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#defaultStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefaultStatement(ExprCParser.DefaultStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#defaultStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefaultStatement(ExprCParser.DefaultStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ExprCParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ExprCParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ExprCParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ExprCParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(ExprCParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(ExprCParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ExprCParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ExprCParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ExprCParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ExprCParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ExprCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ExprCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(ExprCParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(ExprCParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(ExprCParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(ExprCParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(ExprCParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(ExprCParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(ExprCParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(ExprCParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ExprCParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ExprCParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ExprCParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ExprCParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ExprCParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ExprCParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(ExprCParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(ExprCParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprCParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(ExprCParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprCParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(ExprCParser.PrimaryExpressionContext ctx);
}