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
using Antlr4.Runtime.Tree;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete generic visitor for a parse tree produced
/// by <see cref="ExprCParser"/>.
/// </summary>
/// <typeparam name="Result">The return type of the visit operation.</typeparam>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.13.2")]
[System.CLSCompliant(false)]
public interface IExprCVisitor<Result> : IParseTreeVisitor<Result> {
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.program"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitProgram([NotNull] ExprCParser.ProgramContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.preprocessorDirective"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPreprocessorDirective([NotNull] ExprCParser.PreprocessorDirectiveContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.defineDirective"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitDefineDirective([NotNull] ExprCParser.DefineDirectiveContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.mainFunction"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitMainFunction([NotNull] ExprCParser.MainFunctionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.declaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitDeclaration([NotNull] ExprCParser.DeclarationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.functionDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitFunctionDeclaration([NotNull] ExprCParser.FunctionDeclarationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.parameterList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitParameterList([NotNull] ExprCParser.ParameterListContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.parameter"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitParameter([NotNull] ExprCParser.ParameterContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.variableDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitVariableDeclaration([NotNull] ExprCParser.VariableDeclarationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.variableDeclarator"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitVariableDeclarator([NotNull] ExprCParser.VariableDeclaratorContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.structDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStructDeclaration([NotNull] ExprCParser.StructDeclarationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.structMember"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStructMember([NotNull] ExprCParser.StructMemberContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.unionDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitUnionDeclaration([NotNull] ExprCParser.UnionDeclarationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.unionMember"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitUnionMember([NotNull] ExprCParser.UnionMemberContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.block"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBlock([NotNull] ExprCParser.BlockContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStatement([NotNull] ExprCParser.StatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.expressionStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitExpressionStatement([NotNull] ExprCParser.ExpressionStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.printfStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPrintfStatement([NotNull] ExprCParser.PrintfStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.scanfStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitScanfStatement([NotNull] ExprCParser.ScanfStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.blockStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBlockStatement([NotNull] ExprCParser.BlockStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.ifStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIfStatement([NotNull] ExprCParser.IfStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.switchStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSwitchStatement([NotNull] ExprCParser.SwitchStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.caseStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitCaseStatement([NotNull] ExprCParser.CaseStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.defaultStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitDefaultStatement([NotNull] ExprCParser.DefaultStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.forStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitForStatement([NotNull] ExprCParser.ForStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.whileStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitWhileStatement([NotNull] ExprCParser.WhileStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.doWhileStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitDoWhileStatement([NotNull] ExprCParser.DoWhileStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.chamadaStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitChamadaStatement([NotNull] ExprCParser.ChamadaStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.returnStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitReturnStatement([NotNull] ExprCParser.ReturnStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.pointerDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPointerDeclaration([NotNull] ExprCParser.PointerDeclarationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.ternaryExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitTernaryExpression([NotNull] ExprCParser.TernaryExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.arrayDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitArrayDeclaration([NotNull] ExprCParser.ArrayDeclarationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.type"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitType([NotNull] ExprCParser.TypeContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitExpression([NotNull] ExprCParser.ExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.assignmentExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitAssignmentExpression([NotNull] ExprCParser.AssignmentExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.logicalOrExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitLogicalOrExpression([NotNull] ExprCParser.LogicalOrExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.logicalAndExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitLogicalAndExpression([NotNull] ExprCParser.LogicalAndExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.equalityExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitEqualityExpression([NotNull] ExprCParser.EqualityExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.relationalExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitRelationalExpression([NotNull] ExprCParser.RelationalExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.additiveExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitAdditiveExpression([NotNull] ExprCParser.AdditiveExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.multiplicativeExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitMultiplicativeExpression([NotNull] ExprCParser.MultiplicativeExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.unaryExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitUnaryExpression([NotNull] ExprCParser.UnaryExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="ExprCParser.primaryExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPrimaryExpression([NotNull] ExprCParser.PrimaryExpressionContext context);
}
