//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.13.2
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from ExprC.g4 by ANTLR 4.13.2

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using Antlr4.Runtime.Misc;
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="ExprCParser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.13.2")]
[System.CLSCompliant(false)]
public interface IExprCListener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.program"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterProgram([NotNull] ExprCParser.ProgramContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.program"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitProgram([NotNull] ExprCParser.ProgramContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.preprocessorDirective"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPreprocessorDirective([NotNull] ExprCParser.PreprocessorDirectiveContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.preprocessorDirective"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPreprocessorDirective([NotNull] ExprCParser.PreprocessorDirectiveContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.defineDirective"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDefineDirective([NotNull] ExprCParser.DefineDirectiveContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.defineDirective"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDefineDirective([NotNull] ExprCParser.DefineDirectiveContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.mainFunction"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterMainFunction([NotNull] ExprCParser.MainFunctionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.mainFunction"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitMainFunction([NotNull] ExprCParser.MainFunctionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.declaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDeclaration([NotNull] ExprCParser.DeclarationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.declaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDeclaration([NotNull] ExprCParser.DeclarationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.functionDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFunctionDeclaration([NotNull] ExprCParser.FunctionDeclarationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.functionDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFunctionDeclaration([NotNull] ExprCParser.FunctionDeclarationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.parameterList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterParameterList([NotNull] ExprCParser.ParameterListContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.parameterList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitParameterList([NotNull] ExprCParser.ParameterListContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.parameter"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterParameter([NotNull] ExprCParser.ParameterContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.parameter"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitParameter([NotNull] ExprCParser.ParameterContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.variableDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterVariableDeclaration([NotNull] ExprCParser.VariableDeclarationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.variableDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitVariableDeclaration([NotNull] ExprCParser.VariableDeclarationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.variableDeclarator"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterVariableDeclarator([NotNull] ExprCParser.VariableDeclaratorContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.variableDeclarator"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitVariableDeclarator([NotNull] ExprCParser.VariableDeclaratorContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.structDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStructDeclaration([NotNull] ExprCParser.StructDeclarationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.structDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStructDeclaration([NotNull] ExprCParser.StructDeclarationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.structMember"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStructMember([NotNull] ExprCParser.StructMemberContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.structMember"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStructMember([NotNull] ExprCParser.StructMemberContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.unionDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterUnionDeclaration([NotNull] ExprCParser.UnionDeclarationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.unionDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitUnionDeclaration([NotNull] ExprCParser.UnionDeclarationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.unionMember"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterUnionMember([NotNull] ExprCParser.UnionMemberContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.unionMember"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitUnionMember([NotNull] ExprCParser.UnionMemberContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.block"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBlock([NotNull] ExprCParser.BlockContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.block"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBlock([NotNull] ExprCParser.BlockContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStatement([NotNull] ExprCParser.StatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStatement([NotNull] ExprCParser.StatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.expressionStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterExpressionStatement([NotNull] ExprCParser.ExpressionStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.expressionStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitExpressionStatement([NotNull] ExprCParser.ExpressionStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.printfStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPrintfStatement([NotNull] ExprCParser.PrintfStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.printfStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPrintfStatement([NotNull] ExprCParser.PrintfStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.scanfStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterScanfStatement([NotNull] ExprCParser.ScanfStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.scanfStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitScanfStatement([NotNull] ExprCParser.ScanfStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.blockStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBlockStatement([NotNull] ExprCParser.BlockStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.blockStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBlockStatement([NotNull] ExprCParser.BlockStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.ifStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIfStatement([NotNull] ExprCParser.IfStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.ifStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIfStatement([NotNull] ExprCParser.IfStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.switchStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSwitchStatement([NotNull] ExprCParser.SwitchStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.switchStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSwitchStatement([NotNull] ExprCParser.SwitchStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.caseStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterCaseStatement([NotNull] ExprCParser.CaseStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.caseStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitCaseStatement([NotNull] ExprCParser.CaseStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.defaultStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDefaultStatement([NotNull] ExprCParser.DefaultStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.defaultStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDefaultStatement([NotNull] ExprCParser.DefaultStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.forStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterForStatement([NotNull] ExprCParser.ForStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.forStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitForStatement([NotNull] ExprCParser.ForStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.whileStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterWhileStatement([NotNull] ExprCParser.WhileStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.whileStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitWhileStatement([NotNull] ExprCParser.WhileStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.doWhileStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDoWhileStatement([NotNull] ExprCParser.DoWhileStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.doWhileStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDoWhileStatement([NotNull] ExprCParser.DoWhileStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.chamadaStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterChamadaStatement([NotNull] ExprCParser.ChamadaStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.chamadaStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitChamadaStatement([NotNull] ExprCParser.ChamadaStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.returnStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterReturnStatement([NotNull] ExprCParser.ReturnStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.returnStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitReturnStatement([NotNull] ExprCParser.ReturnStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.pointerDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPointerDeclaration([NotNull] ExprCParser.PointerDeclarationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.pointerDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPointerDeclaration([NotNull] ExprCParser.PointerDeclarationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.ternaryStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTernaryStatement([NotNull] ExprCParser.TernaryStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.ternaryStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTernaryStatement([NotNull] ExprCParser.TernaryStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterType([NotNull] ExprCParser.TypeContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitType([NotNull] ExprCParser.TypeContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterExpression([NotNull] ExprCParser.ExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitExpression([NotNull] ExprCParser.ExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.assignmentExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAssignmentExpression([NotNull] ExprCParser.AssignmentExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.assignmentExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAssignmentExpression([NotNull] ExprCParser.AssignmentExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.logicalOrExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLogicalOrExpression([NotNull] ExprCParser.LogicalOrExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.logicalOrExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLogicalOrExpression([NotNull] ExprCParser.LogicalOrExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.logicalAndExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLogicalAndExpression([NotNull] ExprCParser.LogicalAndExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.logicalAndExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLogicalAndExpression([NotNull] ExprCParser.LogicalAndExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.equalityExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterEqualityExpression([NotNull] ExprCParser.EqualityExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.equalityExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitEqualityExpression([NotNull] ExprCParser.EqualityExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.relationalExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterRelationalExpression([NotNull] ExprCParser.RelationalExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.relationalExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitRelationalExpression([NotNull] ExprCParser.RelationalExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.additiveExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAdditiveExpression([NotNull] ExprCParser.AdditiveExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.additiveExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAdditiveExpression([NotNull] ExprCParser.AdditiveExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.multiplicativeExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterMultiplicativeExpression([NotNull] ExprCParser.MultiplicativeExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.multiplicativeExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitMultiplicativeExpression([NotNull] ExprCParser.MultiplicativeExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.unaryExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterUnaryExpression([NotNull] ExprCParser.UnaryExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.unaryExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitUnaryExpression([NotNull] ExprCParser.UnaryExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="ExprCParser.primaryExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPrimaryExpression([NotNull] ExprCParser.PrimaryExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="ExprCParser.primaryExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPrimaryExpression([NotNull] ExprCParser.PrimaryExpressionContext context);
}
