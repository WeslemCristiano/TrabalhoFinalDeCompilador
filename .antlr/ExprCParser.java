// Generated from c:/Users/User/Documents/TrabalhoDeCompilador/CompiladorTianex/ExprC.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, CONSTANT=57, INT=58, FLOAT=59, 
		CHAR=60, IDENTIFIER=61, STRING_LITERAL=62, HEADER_FILE=63, WS=64, COMMENT=65, 
		LINE_COMMENT=66;
	public static final int
		RULE_program = 0, RULE_preprocessorDirective = 1, RULE_defineDirective = 2, 
		RULE_mainFunction = 3, RULE_declaration = 4, RULE_functionDeclaration = 5, 
		RULE_parameterList = 6, RULE_parameter = 7, RULE_variableDeclaration = 8, 
		RULE_variableDeclarator = 9, RULE_structDeclaration = 10, RULE_structMember = 11, 
		RULE_unionDeclaration = 12, RULE_unionMember = 13, RULE_block = 14, RULE_statement = 15, 
		RULE_expressionStatement = 16, RULE_printfStatement = 17, RULE_scanfStatement = 18, 
		RULE_blockStatement = 19, RULE_ifStatement = 20, RULE_switchStatement = 21, 
		RULE_caseStatement = 22, RULE_defaultStatement = 23, RULE_forStatement = 24, 
		RULE_whileStatement = 25, RULE_doWhileStatement = 26, RULE_chamadaStatement = 27, 
		RULE_returnStatement = 28, RULE_pointerDeclaration = 29, RULE_ternaryExpression = 30, 
		RULE_arrayDeclaration = 31, RULE_matrixDeclaration = 32, RULE_arrayInitializer = 33, 
		RULE_type = 34, RULE_expression = 35, RULE_assignmentExpression = 36, 
		RULE_logicalOrExpression = 37, RULE_logicalAndExpression = 38, RULE_equalityExpression = 39, 
		RULE_relationalExpression = 40, RULE_additiveExpression = 41, RULE_multiplicativeExpression = 42, 
		RULE_unaryExpression = 43, RULE_primaryExpression = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "preprocessorDirective", "defineDirective", "mainFunction", 
			"declaration", "functionDeclaration", "parameterList", "parameter", "variableDeclaration", 
			"variableDeclarator", "structDeclaration", "structMember", "unionDeclaration", 
			"unionMember", "block", "statement", "expressionStatement", "printfStatement", 
			"scanfStatement", "blockStatement", "ifStatement", "switchStatement", 
			"caseStatement", "defaultStatement", "forStatement", "whileStatement", 
			"doWhileStatement", "chamadaStatement", "returnStatement", "pointerDeclaration", 
			"ternaryExpression", "arrayDeclaration", "matrixDeclaration", "arrayInitializer", 
			"type", "expression", "assignmentExpression", "logicalOrExpression", 
			"logicalAndExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"primaryExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'include'", "'<'", "'>'", "'define'", "'int'", "'main'", 
			"'('", "')'", "','", "';'", "'['", "']'", "'='", "'*'", "'struct'", "'{'", 
			"'}'", "'union'", "'printf'", "'scanf'", "'&'", "'if'", "'else'", "'switch'", 
			"'case'", "':'", "'break'", "'default'", "'for'", "'while'", "'do'", 
			"'return'", "'?'", "'float'", "'void'", "'char'", "'double'", "'short'", 
			"'long'", "'unsigned'", "'||'", "'&&'", "'=='", "'!='", "'<='", "'>='", 
			"'+'", "'-'", "'/'", "'%'", "'!'", "'++'", "'--'", "'.'", "'sizeof'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "CONSTANT", "INT", 
			"FLOAT", "CHAR", "IDENTIFIER", "STRING_LITERAL", "HEADER_FILE", "WS", 
			"COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ExprC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public List<PreprocessorDirectiveContext> preprocessorDirective() {
			return getRuleContexts(PreprocessorDirectiveContext.class);
		}
		public PreprocessorDirectiveContext preprocessorDirective(int i) {
			return getRuleContext(PreprocessorDirectiveContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					preprocessorDirective();
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(98);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(96);
						declaration();
						}
						break;
					case 2:
						{
						setState(97);
						functionDeclaration();
						}
						break;
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(103);
			mainFunction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PreprocessorDirectiveContext extends ParserRuleContext {
		public TerminalNode HEADER_FILE() { return getToken(ExprCParser.HEADER_FILE, 0); }
		public PreprocessorDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessorDirective; }
	}

	public final PreprocessorDirectiveContext preprocessorDirective() throws RecognitionException {
		PreprocessorDirectiveContext _localctx = new PreprocessorDirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_preprocessorDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__0);
			setState(106);
			match(T__1);
			setState(107);
			match(T__2);
			setState(108);
			match(HEADER_FILE);
			setState(109);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefineDirectiveContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ExprCParser.IDENTIFIER, 0); }
		public TerminalNode CONSTANT() { return getToken(ExprCParser.CONSTANT, 0); }
		public DefineDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineDirective; }
	}

	public final DefineDirectiveContext defineDirective() throws RecognitionException {
		DefineDirectiveContext _localctx = new DefineDirectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_defineDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__0);
			setState(112);
			match(T__4);
			setState(113);
			match(IDENTIFIER);
			setState(114);
			match(CONSTANT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainFunctionContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__5);
			setState(117);
			match(T__6);
			setState(118);
			match(T__7);
			setState(119);
			match(T__8);
			setState(120);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public UnionDeclarationContext unionDeclaration() {
			return getRuleContext(UnionDeclarationContext.class,0);
		}
		public DefineDirectiveContext defineDirective() {
			return getRuleContext(DefineDirectiveContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				structDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				unionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				defineDirective();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(127);
				returnStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ExprCParser.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			type();
			setState(131);
			match(IDENTIFIER);
			setState(132);
			match(T__7);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4363686838336L) != 0)) {
				{
				setState(133);
				parameterList();
				}
			}

			setState(136);
			match(T__8);
			setState(137);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			parameter();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(140);
				match(T__9);
				setState(141);
				parameter();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ExprCParser.IDENTIFIER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			type();
			setState(148);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			type();
			setState(151);
			variableDeclarator();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(152);
				match(T__9);
				setState(153);
				variableDeclarator();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ExprCParser.IDENTIFIER, 0); }
		public List<TerminalNode> CONSTANT() { return getTokens(ExprCParser.CONSTANT); }
		public TerminalNode CONSTANT(int i) {
			return getToken(ExprCParser.CONSTANT, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDeclarator);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(IDENTIFIER);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(162);
					match(T__11);
					setState(163);
					match(CONSTANT);
					setState(164);
					match(T__12);
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(170);
					match(T__13);
					setState(171);
					expression();
					}
				}

				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(T__14);
				setState(175);
				match(IDENTIFIER);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(176);
					match(T__11);
					setState(177);
					match(CONSTANT);
					setState(178);
					match(T__12);
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(184);
					match(T__13);
					setState(185);
					expression();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ExprCParser.IDENTIFIER, 0); }
		public List<StructMemberContext> structMember() {
			return getRuleContexts(StructMemberContext.class);
		}
		public StructMemberContext structMember(int i) {
			return getRuleContext(StructMemberContext.class,i);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__15);
			setState(191);
			match(IDENTIFIER);
			setState(192);
			match(T__16);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4363686838336L) != 0)) {
				{
				{
				setState(193);
				structMember();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(T__17);
			setState(200);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructMemberContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ExprCParser.IDENTIFIER, 0); }
		public TerminalNode CONSTANT() { return getToken(ExprCParser.CONSTANT, 0); }
		public StructMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structMember; }
	}

	public final StructMemberContext structMember() throws RecognitionException {
		StructMemberContext _localctx = new StructMemberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_structMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			type();
			setState(203);
			match(IDENTIFIER);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(204);
				match(T__11);
				setState(205);
				match(CONSTANT);
				setState(206);
				match(T__12);
				}
			}

			setState(209);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnionDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ExprCParser.IDENTIFIER, 0); }
		public List<UnionMemberContext> unionMember() {
			return getRuleContexts(UnionMemberContext.class);
		}
		public UnionMemberContext unionMember(int i) {
			return getRuleContext(UnionMemberContext.class,i);
		}
		public UnionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionDeclaration; }
	}

	public final UnionDeclarationContext unionDeclaration() throws RecognitionException {
		UnionDeclarationContext _localctx = new UnionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__18);
			setState(212);
			match(IDENTIFIER);
			setState(213);
			match(T__16);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4363686838336L) != 0)) {
				{
				{
				setState(214);
				unionMember();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(T__17);
			setState(221);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnionMemberContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ExprCParser.IDENTIFIER, 0); }
		public TerminalNode CONSTANT() { return getToken(ExprCParser.CONSTANT, 0); }
		public UnionMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionMember; }
	}

	public final UnionMemberContext unionMember() throws RecognitionException {
		UnionMemberContext _localctx = new UnionMemberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unionMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			type();
			setState(224);
			match(IDENTIFIER);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(225);
				match(T__11);
				setState(226);
				match(CONSTANT);
				setState(227);
				match(T__12);
				}
			}

			setState(230);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__16);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7166075811919003968L) != 0)) {
				{
				{
				setState(233);
				statement();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ScanfStatementContext scanfStatement() {
			return getRuleContext(ScanfStatementContext.class,0);
		}
		public PrintfStatementContext printfStatement() {
			return getRuleContext(PrintfStatementContext.class,0);
		}
		public ChamadaStatementContext chamadaStatement() {
			return getRuleContext(ChamadaStatementContext.class,0);
		}
		public PointerDeclarationContext pointerDeclaration() {
			return getRuleContext(PointerDeclarationContext.class,0);
		}
		public TernaryExpressionContext ternaryExpression() {
			return getRuleContext(TernaryExpressionContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public MatrixDeclarationContext matrixDeclaration() {
			return getRuleContext(MatrixDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				blockStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				variableDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(247);
				whileStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(248);
				doWhileStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(249);
				switchStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(250);
				scanfStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(251);
				printfStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(252);
				chamadaStatement();
				setState(253);
				match(T__10);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(255);
				returnStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(256);
				pointerDeclaration();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(257);
				ternaryExpression();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(258);
				arrayDeclaration();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(259);
				matrixDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			expression();
			setState(263);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintfStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ExprCParser.STRING_LITERAL, 0); }
		public PrintfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printfStatement; }
	}

	public final PrintfStatementContext printfStatement() throws RecognitionException {
		PrintfStatementContext _localctx = new PrintfStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_printfStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__19);
			setState(266);
			match(T__7);
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(267);
				expression();
				}
				break;
			case 2:
				{
				setState(268);
				match(STRING_LITERAL);
				}
				break;
			}
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(271);
				match(T__9);
				setState(272);
				expression();
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			match(T__8);
			setState(279);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScanfStatementContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(ExprCParser.STRING_LITERAL, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ExprCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ExprCParser.IDENTIFIER, i);
		}
		public ScanfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanfStatement; }
	}

	public final ScanfStatementContext scanfStatement() throws RecognitionException {
		ScanfStatementContext _localctx = new ScanfStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_scanfStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__20);
			setState(282);
			match(T__7);
			setState(283);
			match(STRING_LITERAL);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(284);
				match(T__9);
				{
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(285);
					match(T__21);
					}
				}

				setState(288);
				match(IDENTIFIER);
				}
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			match(T__8);
			setState(295);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__16);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7166075811919003968L) != 0)) {
				{
				{
				setState(298);
				statement();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__22);
			setState(307);
			match(T__7);
			setState(308);
			expression();
			setState(309);
			match(T__8);
			setState(310);
			statement();
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(311);
				match(T__23);
				setState(312);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<CaseStatementContext> caseStatement() {
			return getRuleContexts(CaseStatementContext.class);
		}
		public CaseStatementContext caseStatement(int i) {
			return getRuleContext(CaseStatementContext.class,i);
		}
		public DefaultStatementContext defaultStatement() {
			return getRuleContext(DefaultStatementContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__24);
			setState(316);
			match(T__7);
			setState(317);
			expression();
			setState(318);
			match(T__8);
			setState(319);
			match(T__16);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(320);
				caseStatement();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(326);
				defaultStatement();
				}
			}

			setState(329);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(ExprCParser.CONSTANT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_caseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(T__25);
			setState(332);
			match(CONSTANT);
			setState(333);
			match(T__26);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7166075811919003968L) != 0)) {
				{
				{
				setState(334);
				statement();
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340);
			match(T__27);
			setState(341);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DefaultStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultStatement; }
	}

	public final DefaultStatementContext defaultStatement() throws RecognitionException {
		DefaultStatementContext _localctx = new DefaultStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_defaultStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(T__28);
			setState(344);
			match(T__26);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7166075811919003968L) != 0)) {
				{
				{
				setState(345);
				statement();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(T__29);
			setState(352);
			match(T__7);
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__15:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
				{
				setState(353);
				variableDeclaration();
				}
				break;
			case T__7:
			case T__14:
			case T__21:
			case T__47:
			case T__48:
			case T__51:
			case T__52:
			case T__53:
			case T__55:
			case CONSTANT:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(354);
				expression();
				}
				break;
			case T__10:
				break;
			default:
				break;
			}
			setState(357);
			match(T__10);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7166071432080818432L) != 0)) {
				{
				setState(358);
				expression();
				}
			}

			setState(361);
			match(T__10);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7166071432080818432L) != 0)) {
				{
				setState(362);
				expression();
				}
			}

			setState(365);
			match(T__8);
			setState(366);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(T__30);
			setState(369);
			match(T__7);
			setState(370);
			expression();
			setState(371);
			match(T__8);
			setState(372);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T__31);
			setState(375);
			statement();
			setState(376);
			match(T__30);
			setState(377);
			match(T__7);
			setState(378);
			expression();
			setState(379);
			match(T__8);
			setState(380);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChamadaStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ExprCParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ChamadaStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaStatement; }
	}

	public final ChamadaStatementContext chamadaStatement() throws RecognitionException {
		ChamadaStatementContext _localctx = new ChamadaStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_chamadaStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(IDENTIFIER);
			setState(383);
			match(T__7);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7166071432080818432L) != 0)) {
				{
				setState(384);
				expression();
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(385);
					match(T__9);
					setState(386);
					expression();
					}
					}
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(394);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(T__32);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7166071432080818432L) != 0)) {
				{
				setState(397);
				expression();
				}
			}

			setState(400);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PointerDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ExprCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ExprCParser.IDENTIFIER, i);
		}
		public PointerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerDeclaration; }
	}

	public final PointerDeclarationContext pointerDeclaration() throws RecognitionException {
		PointerDeclarationContext _localctx = new PointerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_pointerDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			type();
			setState(403);
			match(T__14);
			setState(404);
			match(IDENTIFIER);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(405);
				match(T__13);
				setState(406);
				match(T__21);
				setState(407);
				match(IDENTIFIER);
				}
			}

			setState(410);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TernaryExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TernaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryExpression; }
	}

	public final TernaryExpressionContext ternaryExpression() throws RecognitionException {
		TernaryExpressionContext _localctx = new TernaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ternaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			logicalOrExpression();
			setState(413);
			match(T__33);
			setState(414);
			statement();
			setState(415);
			match(T__26);
			setState(416);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ExprCParser.IDENTIFIER, 0); }
		public TerminalNode CONSTANT() { return getToken(ExprCParser.CONSTANT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			type();
			setState(419);
			match(IDENTIFIER);
			setState(420);
			match(T__11);
			setState(421);
			match(CONSTANT);
			setState(422);
			match(T__12);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(423);
				match(T__13);
				setState(424);
				match(T__16);
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7166071432080818432L) != 0)) {
					{
					setState(425);
					expression();
					setState(430);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(426);
						match(T__9);
						setState(427);
						expression();
						}
						}
						setState(432);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(435);
				match(T__17);
				}
			}

			setState(438);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatrixDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ExprCParser.IDENTIFIER, 0); }
		public List<TerminalNode> CONSTANT() { return getTokens(ExprCParser.CONSTANT); }
		public TerminalNode CONSTANT(int i) {
			return getToken(ExprCParser.CONSTANT, i);
		}
		public List<ArrayInitializerContext> arrayInitializer() {
			return getRuleContexts(ArrayInitializerContext.class);
		}
		public ArrayInitializerContext arrayInitializer(int i) {
			return getRuleContext(ArrayInitializerContext.class,i);
		}
		public MatrixDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixDeclaration; }
	}

	public final MatrixDeclarationContext matrixDeclaration() throws RecognitionException {
		MatrixDeclarationContext _localctx = new MatrixDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_matrixDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			type();
			setState(441);
			match(IDENTIFIER);
			setState(442);
			match(T__11);
			setState(443);
			match(CONSTANT);
			setState(444);
			match(T__12);
			setState(445);
			match(T__11);
			setState(446);
			match(CONSTANT);
			setState(447);
			match(T__12);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(448);
				match(T__13);
				setState(449);
				match(T__16);
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(450);
					arrayInitializer();
					setState(455);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(451);
						match(T__9);
						setState(452);
						arrayInitializer();
						}
						}
						setState(457);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(460);
				match(T__17);
				}
			}

			setState(463);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(T__16);
			setState(466);
			expression();
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(467);
				match(T__9);
				setState(468);
				expression();
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ExprCParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_type);
		try {
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				match(T__5);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 5);
				{
				setState(480);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 6);
				{
				setState(481);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 7);
				{
				setState(482);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 8);
				{
				setState(483);
				match(T__40);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 9);
				{
				setState(484);
				match(T__15);
				setState(485);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TernaryExpressionContext ternaryExpression() {
			return getRuleContext(TernaryExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expression);
		try {
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				assignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				ternaryExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ExprCParser.IDENTIFIER, 0); }
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_assignmentExpression);
		try {
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				match(IDENTIFIER);
				setState(493);
				match(T__13);
				setState(494);
				logicalOrExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				logicalOrExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			logicalAndExpression();
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__41) {
				{
				{
				setState(499);
				match(T__41);
				setState(500);
				logicalAndExpression();
				}
				}
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			equalityExpression();
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(507);
				match(T__42);
				setState(508);
				equalityExpression();
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			relationalExpression();
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__43 || _la==T__44) {
				{
				{
				setState(515);
				_la = _input.LA(1);
				if ( !(_la==T__43 || _la==T__44) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(516);
				relationalExpression();
				}
				}
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			additiveExpression();
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 211106232533016L) != 0)) {
				{
				{
				setState(523);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 211106232533016L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(524);
				additiveExpression();
				}
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			multiplicativeExpression();
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__47 || _la==T__48) {
				{
				{
				setState(531);
				_la = _input.LA(1);
				if ( !(_la==T__47 || _la==T__48) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(532);
				multiplicativeExpression();
				}
				}
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			unaryExpression();
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3377699720560640L) != 0)) {
				{
				{
				setState(539);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3377699720560640L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(540);
				unaryExpression();
				}
				}
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_unaryExpression);
		int _la;
		try {
			setState(549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__55:
			case CONSTANT:
			case IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				primaryExpression();
				}
				break;
			case T__14:
			case T__21:
			case T__47:
			case T__48:
			case T__51:
			case T__52:
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32369622325952512L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(548);
				unaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ExprCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ExprCParser.IDENTIFIER, i);
		}
		public TerminalNode CONSTANT() { return getToken(ExprCParser.CONSTANT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ExprCParser.STRING_LITERAL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_primaryExpression);
		int _la;
		try {
			setState(579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				match(T__7);
				setState(552);
				expression();
				setState(553);
				match(T__8);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				match(IDENTIFIER);
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__54) {
					{
					{
					setState(556);
					match(T__54);
					setState(557);
					match(IDENTIFIER);
					}
					}
					setState(562);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(563);
					match(T__11);
					setState(564);
					expression();
					setState(565);
					match(T__12);
					}
					}
					setState(571);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(572);
				match(CONSTANT);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(573);
				match(STRING_LITERAL);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 5);
				{
				setState(574);
				match(T__55);
				setState(575);
				match(T__7);
				setState(576);
				type();
				setState(577);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001B\u0246\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0001"+
		"\u0000\u0005\u0000\\\b\u0000\n\u0000\f\u0000_\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000c\b\u0000\n\u0000\f\u0000f\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u0081\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0087\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u008f\b\u0006\n\u0006\f\u0006\u0092\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u009b\b\b\n\b\f\b\u009e\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0005\t\u00a6\b\t\n\t\f\t\u00a9\t\t\u0001\t\u0001\t\u0003\t\u00ad"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00b4\b\t\n\t\f\t"+
		"\u00b7\t\t\u0001\t\u0001\t\u0003\t\u00bb\b\t\u0003\t\u00bd\b\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0005\n\u00c3\b\n\n\n\f\n\u00c6\t\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00d0\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00d8\b\f\n\f\f\f\u00db\t\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00e5\b\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0005\u000e\u00eb\b\u000e\n\u000e\f\u000e\u00ee"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0105\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u010e\b\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0112"+
		"\b\u0011\n\u0011\f\u0011\u0115\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u011f\b\u0012\u0001\u0012\u0005\u0012\u0122\b\u0012\n\u0012\f\u0012\u0125"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u012c\b\u0013\n\u0013\f\u0013\u012f\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u013a\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0142\b\u0015\n\u0015"+
		"\f\u0015\u0145\t\u0015\u0001\u0015\u0003\u0015\u0148\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u0150\b\u0016\n\u0016\f\u0016\u0153\t\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u015b\b\u0017\n"+
		"\u0017\f\u0017\u015e\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0164\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0168"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u016c\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0184\b\u001b\n\u001b"+
		"\f\u001b\u0187\t\u001b\u0003\u001b\u0189\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u018f\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u0199\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0005\u001f\u01ad\b\u001f\n\u001f\f\u001f\u01b0"+
		"\t\u001f\u0003\u001f\u01b2\b\u001f\u0001\u001f\u0003\u001f\u01b5\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u01c6\b \n \f \u01c9"+
		"\t \u0003 \u01cb\b \u0001 \u0003 \u01ce\b \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001!\u0005!\u01d6\b!\n!\f!\u01d9\t!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003"+
		"\"\u01e7\b\"\u0001#\u0001#\u0003#\u01eb\b#\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u01f1\b$\u0001%\u0001%\u0001%\u0005%\u01f6\b%\n%\f%\u01f9\t%"+
		"\u0001&\u0001&\u0001&\u0005&\u01fe\b&\n&\f&\u0201\t&\u0001\'\u0001\'\u0001"+
		"\'\u0005\'\u0206\b\'\n\'\f\'\u0209\t\'\u0001(\u0001(\u0001(\u0005(\u020e"+
		"\b(\n(\f(\u0211\t(\u0001)\u0001)\u0001)\u0005)\u0216\b)\n)\f)\u0219\t"+
		")\u0001*\u0001*\u0001*\u0005*\u021e\b*\n*\f*\u0221\t*\u0001+\u0001+\u0001"+
		"+\u0003+\u0226\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0005"+
		",\u022f\b,\n,\f,\u0232\t,\u0001,\u0001,\u0001,\u0001,\u0005,\u0238\b,"+
		"\n,\f,\u023b\t,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003"+
		",\u0244\b,\u0001,\u0000\u0000-\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVX\u0000\u0005\u0001\u0000,-\u0002\u0000\u0003\u0004./\u0001\u000001"+
		"\u0002\u0000\u000f\u000f23\u0004\u0000\u000f\u000f\u0016\u00160146\u026d"+
		"\u0000]\u0001\u0000\u0000\u0000\u0002i\u0001\u0000\u0000\u0000\u0004o"+
		"\u0001\u0000\u0000\u0000\u0006t\u0001\u0000\u0000\u0000\b\u0080\u0001"+
		"\u0000\u0000\u0000\n\u0082\u0001\u0000\u0000\u0000\f\u008b\u0001\u0000"+
		"\u0000\u0000\u000e\u0093\u0001\u0000\u0000\u0000\u0010\u0096\u0001\u0000"+
		"\u0000\u0000\u0012\u00bc\u0001\u0000\u0000\u0000\u0014\u00be\u0001\u0000"+
		"\u0000\u0000\u0016\u00ca\u0001\u0000\u0000\u0000\u0018\u00d3\u0001\u0000"+
		"\u0000\u0000\u001a\u00df\u0001\u0000\u0000\u0000\u001c\u00e8\u0001\u0000"+
		"\u0000\u0000\u001e\u0104\u0001\u0000\u0000\u0000 \u0106\u0001\u0000\u0000"+
		"\u0000\"\u0109\u0001\u0000\u0000\u0000$\u0119\u0001\u0000\u0000\u0000"+
		"&\u0129\u0001\u0000\u0000\u0000(\u0132\u0001\u0000\u0000\u0000*\u013b"+
		"\u0001\u0000\u0000\u0000,\u014b\u0001\u0000\u0000\u0000.\u0157\u0001\u0000"+
		"\u0000\u00000\u015f\u0001\u0000\u0000\u00002\u0170\u0001\u0000\u0000\u0000"+
		"4\u0176\u0001\u0000\u0000\u00006\u017e\u0001\u0000\u0000\u00008\u018c"+
		"\u0001\u0000\u0000\u0000:\u0192\u0001\u0000\u0000\u0000<\u019c\u0001\u0000"+
		"\u0000\u0000>\u01a2\u0001\u0000\u0000\u0000@\u01b8\u0001\u0000\u0000\u0000"+
		"B\u01d1\u0001\u0000\u0000\u0000D\u01e6\u0001\u0000\u0000\u0000F\u01ea"+
		"\u0001\u0000\u0000\u0000H\u01f0\u0001\u0000\u0000\u0000J\u01f2\u0001\u0000"+
		"\u0000\u0000L\u01fa\u0001\u0000\u0000\u0000N\u0202\u0001\u0000\u0000\u0000"+
		"P\u020a\u0001\u0000\u0000\u0000R\u0212\u0001\u0000\u0000\u0000T\u021a"+
		"\u0001\u0000\u0000\u0000V\u0225\u0001\u0000\u0000\u0000X\u0243\u0001\u0000"+
		"\u0000\u0000Z\\\u0003\u0002\u0001\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^d\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`c\u0003\b\u0004\u0000"+
		"ac\u0003\n\u0005\u0000b`\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000"+
		"cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gh\u0003\u0006"+
		"\u0003\u0000h\u0001\u0001\u0000\u0000\u0000ij\u0005\u0001\u0000\u0000"+
		"jk\u0005\u0002\u0000\u0000kl\u0005\u0003\u0000\u0000lm\u0005?\u0000\u0000"+
		"mn\u0005\u0004\u0000\u0000n\u0003\u0001\u0000\u0000\u0000op\u0005\u0001"+
		"\u0000\u0000pq\u0005\u0005\u0000\u0000qr\u0005=\u0000\u0000rs\u00059\u0000"+
		"\u0000s\u0005\u0001\u0000\u0000\u0000tu\u0005\u0006\u0000\u0000uv\u0005"+
		"\u0007\u0000\u0000vw\u0005\b\u0000\u0000wx\u0005\t\u0000\u0000xy\u0003"+
		"\u001c\u000e\u0000y\u0007\u0001\u0000\u0000\u0000z\u0081\u0003\u0010\b"+
		"\u0000{\u0081\u0003\u001e\u000f\u0000|\u0081\u0003\u0014\n\u0000}\u0081"+
		"\u0003\u0018\f\u0000~\u0081\u0003\u0004\u0002\u0000\u007f\u0081\u0003"+
		"8\u001c\u0000\u0080z\u0001\u0000\u0000\u0000\u0080{\u0001\u0000\u0000"+
		"\u0000\u0080|\u0001\u0000\u0000\u0000\u0080}\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\t"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0003D\"\u0000\u0083\u0084\u0005"+
		"=\u0000\u0000\u0084\u0086\u0005\b\u0000\u0000\u0085\u0087\u0003\f\u0006"+
		"\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0005\t\u0000\u0000"+
		"\u0089\u008a\u0003\u001c\u000e\u0000\u008a\u000b\u0001\u0000\u0000\u0000"+
		"\u008b\u0090\u0003\u000e\u0007\u0000\u008c\u008d\u0005\n\u0000\u0000\u008d"+
		"\u008f\u0003\u000e\u0007\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f"+
		"\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0001\u0000\u0000\u0000\u0091\r\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0003D\"\u0000\u0094\u0095\u0005"+
		"=\u0000\u0000\u0095\u000f\u0001\u0000\u0000\u0000\u0096\u0097\u0003D\""+
		"\u0000\u0097\u009c\u0003\u0012\t\u0000\u0098\u0099\u0005\n\u0000\u0000"+
		"\u0099\u009b\u0003\u0012\t\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b"+
		"\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e"+
		"\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u000b\u0000\u0000\u00a0"+
		"\u0011\u0001\u0000\u0000\u0000\u00a1\u00a7\u0005=\u0000\u0000\u00a2\u00a3"+
		"\u0005\f\u0000\u0000\u00a3\u00a4\u00059\u0000\u0000\u00a4\u00a6\u0005"+
		"\r\u0000\u0000\u00a5\u00a2\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u00ac\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0005\u000e\u0000\u0000\u00ab\u00ad\u0003F#\u0000"+
		"\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ad\u00bd\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u000f\u0000\u0000"+
		"\u00af\u00b5\u0005=\u0000\u0000\u00b0\u00b1\u0005\f\u0000\u0000\u00b1"+
		"\u00b2\u00059\u0000\u0000\u00b2\u00b4\u0005\r\u0000\u0000\u00b3\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00ba"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0005\u000e\u0000\u0000\u00b9\u00bb\u0003F#\u0000\u00ba\u00b8\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bc\u00a1\u0001\u0000\u0000\u0000\u00bc\u00ae\u0001\u0000"+
		"\u0000\u0000\u00bd\u0013\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0010"+
		"\u0000\u0000\u00bf\u00c0\u0005=\u0000\u0000\u00c0\u00c4\u0005\u0011\u0000"+
		"\u0000\u00c1\u00c3\u0003\u0016\u000b\u0000\u00c2\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0012\u0000"+
		"\u0000\u00c8\u00c9\u0005\u000b\u0000\u0000\u00c9\u0015\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0003D\"\u0000\u00cb\u00cf\u0005=\u0000\u0000\u00cc"+
		"\u00cd\u0005\f\u0000\u0000\u00cd\u00ce\u00059\u0000\u0000\u00ce\u00d0"+
		"\u0005\r\u0000\u0000\u00cf\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005"+
		"\u000b\u0000\u0000\u00d2\u0017\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005"+
		"\u0013\u0000\u0000\u00d4\u00d5\u0005=\u0000\u0000\u00d5\u00d9\u0005\u0011"+
		"\u0000\u0000\u00d6\u00d8\u0003\u001a\r\u0000\u00d7\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00dc\u0001\u0000\u0000"+
		"\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u0012\u0000"+
		"\u0000\u00dd\u00de\u0005\u000b\u0000\u0000\u00de\u0019\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0003D\"\u0000\u00e0\u00e4\u0005=\u0000\u0000\u00e1"+
		"\u00e2\u0005\f\u0000\u0000\u00e2\u00e3\u00059\u0000\u0000\u00e3\u00e5"+
		"\u0005\r\u0000\u0000\u00e4\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005"+
		"\u000b\u0000\u0000\u00e7\u001b\u0001\u0000\u0000\u0000\u00e8\u00ec\u0005"+
		"\u0011\u0000\u0000\u00e9\u00eb\u0003\u001e\u000f\u0000\u00ea\u00e9\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005"+
		"\u0012\u0000\u0000\u00f0\u001d\u0001\u0000\u0000\u0000\u00f1\u0105\u0003"+
		" \u0010\u0000\u00f2\u0105\u0003&\u0013\u0000\u00f3\u0105\u0003(\u0014"+
		"\u0000\u00f4\u0105\u00038\u001c\u0000\u00f5\u0105\u0003\u0010\b\u0000"+
		"\u00f6\u0105\u00030\u0018\u0000\u00f7\u0105\u00032\u0019\u0000\u00f8\u0105"+
		"\u00034\u001a\u0000\u00f9\u0105\u0003*\u0015\u0000\u00fa\u0105\u0003$"+
		"\u0012\u0000\u00fb\u0105\u0003\"\u0011\u0000\u00fc\u00fd\u00036\u001b"+
		"\u0000\u00fd\u00fe\u0005\u000b\u0000\u0000\u00fe\u0105\u0001\u0000\u0000"+
		"\u0000\u00ff\u0105\u00038\u001c\u0000\u0100\u0105\u0003:\u001d\u0000\u0101"+
		"\u0105\u0003<\u001e\u0000\u0102\u0105\u0003>\u001f\u0000\u0103\u0105\u0003"+
		"@ \u0000\u0104\u00f1\u0001\u0000\u0000\u0000\u0104\u00f2\u0001\u0000\u0000"+
		"\u0000\u0104\u00f3\u0001\u0000\u0000\u0000\u0104\u00f4\u0001\u0000\u0000"+
		"\u0000\u0104\u00f5\u0001\u0000\u0000\u0000\u0104\u00f6\u0001\u0000\u0000"+
		"\u0000\u0104\u00f7\u0001\u0000\u0000\u0000\u0104\u00f8\u0001\u0000\u0000"+
		"\u0000\u0104\u00f9\u0001\u0000\u0000\u0000\u0104\u00fa\u0001\u0000\u0000"+
		"\u0000\u0104\u00fb\u0001\u0000\u0000\u0000\u0104\u00fc\u0001\u0000\u0000"+
		"\u0000\u0104\u00ff\u0001\u0000\u0000\u0000\u0104\u0100\u0001\u0000\u0000"+
		"\u0000\u0104\u0101\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000"+
		"\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0105\u001f\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0003F#\u0000\u0107\u0108\u0005\u000b\u0000\u0000\u0108"+
		"!\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u0014\u0000\u0000\u010a\u010d"+
		"\u0005\b\u0000\u0000\u010b\u010e\u0003F#\u0000\u010c\u010e\u0005>\u0000"+
		"\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010c\u0001\u0000\u0000"+
		"\u0000\u010e\u0113\u0001\u0000\u0000\u0000\u010f\u0110\u0005\n\u0000\u0000"+
		"\u0110\u0112\u0003F#\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0115"+
		"\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u0001\u0000\u0000\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115\u0113"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0005\t\u0000\u0000\u0117\u0118\u0005"+
		"\u000b\u0000\u0000\u0118#\u0001\u0000\u0000\u0000\u0119\u011a\u0005\u0015"+
		"\u0000\u0000\u011a\u011b\u0005\b\u0000\u0000\u011b\u0123\u0005>\u0000"+
		"\u0000\u011c\u011e\u0005\n\u0000\u0000\u011d\u011f\u0005\u0016\u0000\u0000"+
		"\u011e\u011d\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0122\u0005=\u0000\u0000\u0121"+
		"\u011c\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123"+
		"\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124"+
		"\u0126\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0005\t\u0000\u0000\u0127\u0128\u0005\u000b\u0000\u0000\u0128%"+
		"\u0001\u0000\u0000\u0000\u0129\u012d\u0005\u0011\u0000\u0000\u012a\u012c"+
		"\u0003\u001e\u000f\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c\u012f"+
		"\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0001\u0000\u0000\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u012d"+
		"\u0001\u0000\u0000\u0000\u0130\u0131\u0005\u0012\u0000\u0000\u0131\'\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0005\u0017\u0000\u0000\u0133\u0134\u0005"+
		"\b\u0000\u0000\u0134\u0135\u0003F#\u0000\u0135\u0136\u0005\t\u0000\u0000"+
		"\u0136\u0139\u0003\u001e\u000f\u0000\u0137\u0138\u0005\u0018\u0000\u0000"+
		"\u0138\u013a\u0003\u001e\u000f\u0000\u0139\u0137\u0001\u0000\u0000\u0000"+
		"\u0139\u013a\u0001\u0000\u0000\u0000\u013a)\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0005\u0019\u0000\u0000\u013c\u013d\u0005\b\u0000\u0000\u013d\u013e"+
		"\u0003F#\u0000\u013e\u013f\u0005\t\u0000\u0000\u013f\u0143\u0005\u0011"+
		"\u0000\u0000\u0140\u0142\u0003,\u0016\u0000\u0141\u0140\u0001\u0000\u0000"+
		"\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000"+
		"\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0148\u0003.\u0017\u0000"+
		"\u0147\u0146\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0005\u0012\u0000\u0000"+
		"\u014a+\u0001\u0000\u0000\u0000\u014b\u014c\u0005\u001a\u0000\u0000\u014c"+
		"\u014d\u00059\u0000\u0000\u014d\u0151\u0005\u001b\u0000\u0000\u014e\u0150"+
		"\u0003\u001e\u000f\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u0150\u0153"+
		"\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0001\u0000\u0000\u0000\u0152\u0154\u0001\u0000\u0000\u0000\u0153\u0151"+
		"\u0001\u0000\u0000\u0000\u0154\u0155\u0005\u001c\u0000\u0000\u0155\u0156"+
		"\u0005\u000b\u0000\u0000\u0156-\u0001\u0000\u0000\u0000\u0157\u0158\u0005"+
		"\u001d\u0000\u0000\u0158\u015c\u0005\u001b\u0000\u0000\u0159\u015b\u0003"+
		"\u001e\u000f\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015b\u015e\u0001"+
		"\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d\u0001"+
		"\u0000\u0000\u0000\u015d/\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000"+
		"\u0000\u0000\u015f\u0160\u0005\u001e\u0000\u0000\u0160\u0163\u0005\b\u0000"+
		"\u0000\u0161\u0164\u0003\u0010\b\u0000\u0162\u0164\u0003F#\u0000\u0163"+
		"\u0161\u0001\u0000\u0000\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165"+
		"\u0167\u0005\u000b\u0000\u0000\u0166\u0168\u0003F#\u0000\u0167\u0166\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0169\u0001"+
		"\u0000\u0000\u0000\u0169\u016b\u0005\u000b\u0000\u0000\u016a\u016c\u0003"+
		"F#\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000"+
		"\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0005\t\u0000\u0000"+
		"\u016e\u016f\u0003\u001e\u000f\u0000\u016f1\u0001\u0000\u0000\u0000\u0170"+
		"\u0171\u0005\u001f\u0000\u0000\u0171\u0172\u0005\b\u0000\u0000\u0172\u0173"+
		"\u0003F#\u0000\u0173\u0174\u0005\t\u0000\u0000\u0174\u0175\u0003\u001e"+
		"\u000f\u0000\u01753\u0001\u0000\u0000\u0000\u0176\u0177\u0005 \u0000\u0000"+
		"\u0177\u0178\u0003\u001e\u000f\u0000\u0178\u0179\u0005\u001f\u0000\u0000"+
		"\u0179\u017a\u0005\b\u0000\u0000\u017a\u017b\u0003F#\u0000\u017b\u017c"+
		"\u0005\t\u0000\u0000\u017c\u017d\u0005\u000b\u0000\u0000\u017d5\u0001"+
		"\u0000\u0000\u0000\u017e\u017f\u0005=\u0000\u0000\u017f\u0188\u0005\b"+
		"\u0000\u0000\u0180\u0185\u0003F#\u0000\u0181\u0182\u0005\n\u0000\u0000"+
		"\u0182\u0184\u0003F#\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u0187"+
		"\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0185\u0186"+
		"\u0001\u0000\u0000\u0000\u0186\u0189\u0001\u0000\u0000\u0000\u0187\u0185"+
		"\u0001\u0000\u0000\u0000\u0188\u0180\u0001\u0000\u0000\u0000\u0188\u0189"+
		"\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018b"+
		"\u0005\t\u0000\u0000\u018b7\u0001\u0000\u0000\u0000\u018c\u018e\u0005"+
		"!\u0000\u0000\u018d\u018f\u0003F#\u0000\u018e\u018d\u0001\u0000\u0000"+
		"\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000"+
		"\u0000\u0190\u0191\u0005\u000b\u0000\u0000\u01919\u0001\u0000\u0000\u0000"+
		"\u0192\u0193\u0003D\"\u0000\u0193\u0194\u0005\u000f\u0000\u0000\u0194"+
		"\u0198\u0005=\u0000\u0000\u0195\u0196\u0005\u000e\u0000\u0000\u0196\u0197"+
		"\u0005\u0016\u0000\u0000\u0197\u0199\u0005=\u0000\u0000\u0198\u0195\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019a\u0001"+
		"\u0000\u0000\u0000\u019a\u019b\u0005\u000b\u0000\u0000\u019b;\u0001\u0000"+
		"\u0000\u0000\u019c\u019d\u0003J%\u0000\u019d\u019e\u0005\"\u0000\u0000"+
		"\u019e\u019f\u0003\u001e\u000f\u0000\u019f\u01a0\u0005\u001b\u0000\u0000"+
		"\u01a0\u01a1\u0003\u001e\u000f\u0000\u01a1=\u0001\u0000\u0000\u0000\u01a2"+
		"\u01a3\u0003D\"\u0000\u01a3\u01a4\u0005=\u0000\u0000\u01a4\u01a5\u0005"+
		"\f\u0000\u0000\u01a5\u01a6\u00059\u0000\u0000\u01a6\u01b4\u0005\r\u0000"+
		"\u0000\u01a7\u01a8\u0005\u000e\u0000\u0000\u01a8\u01b1\u0005\u0011\u0000"+
		"\u0000\u01a9\u01ae\u0003F#\u0000\u01aa\u01ab\u0005\n\u0000\u0000\u01ab"+
		"\u01ad\u0003F#\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad\u01b0\u0001"+
		"\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af\u0001"+
		"\u0000\u0000\u0000\u01af\u01b2\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001"+
		"\u0000\u0000\u0000\u01b1\u01a9\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b5\u0005"+
		"\u0012\u0000\u0000\u01b4\u01a7\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005"+
		"\u000b\u0000\u0000\u01b7?\u0001\u0000\u0000\u0000\u01b8\u01b9\u0003D\""+
		"\u0000\u01b9\u01ba\u0005=\u0000\u0000\u01ba\u01bb\u0005\f\u0000\u0000"+
		"\u01bb\u01bc\u00059\u0000\u0000\u01bc\u01bd\u0005\r\u0000\u0000\u01bd"+
		"\u01be\u0005\f\u0000\u0000\u01be\u01bf\u00059\u0000\u0000\u01bf\u01cd"+
		"\u0005\r\u0000\u0000\u01c0\u01c1\u0005\u000e\u0000\u0000\u01c1\u01ca\u0005"+
		"\u0011\u0000\u0000\u01c2\u01c7\u0003B!\u0000\u01c3\u01c4\u0005\n\u0000"+
		"\u0000\u01c4\u01c6\u0003B!\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c9\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c8\u0001\u0000\u0000\u0000\u01c8\u01cb\u0001\u0000\u0000\u0000\u01c9"+
		"\u01c7\u0001\u0000\u0000\u0000\u01ca\u01c2\u0001\u0000\u0000\u0000\u01ca"+
		"\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc"+
		"\u01ce\u0005\u0012\u0000\u0000\u01cd\u01c0\u0001\u0000\u0000\u0000\u01cd"+
		"\u01ce\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d0\u0005\u000b\u0000\u0000\u01d0A\u0001\u0000\u0000\u0000\u01d1\u01d2"+
		"\u0005\u0011\u0000\u0000\u01d2\u01d7\u0003F#\u0000\u01d3\u01d4\u0005\n"+
		"\u0000\u0000\u01d4\u01d6\u0003F#\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d9\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01da\u0001\u0000\u0000\u0000"+
		"\u01d9\u01d7\u0001\u0000\u0000\u0000\u01da\u01db\u0005\u0012\u0000\u0000"+
		"\u01dbC\u0001\u0000\u0000\u0000\u01dc\u01e7\u0005\u0006\u0000\u0000\u01dd"+
		"\u01e7\u0005#\u0000\u0000\u01de\u01e7\u0005$\u0000\u0000\u01df\u01e7\u0005"+
		"%\u0000\u0000\u01e0\u01e7\u0005&\u0000\u0000\u01e1\u01e7\u0005\'\u0000"+
		"\u0000\u01e2\u01e7\u0005(\u0000\u0000\u01e3\u01e7\u0005)\u0000\u0000\u01e4"+
		"\u01e5\u0005\u0010\u0000\u0000\u01e5\u01e7\u0005=\u0000\u0000\u01e6\u01dc"+
		"\u0001\u0000\u0000\u0000\u01e6\u01dd\u0001\u0000\u0000\u0000\u01e6\u01de"+
		"\u0001\u0000\u0000\u0000\u01e6\u01df\u0001\u0000\u0000\u0000\u01e6\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e6\u01e1\u0001\u0000\u0000\u0000\u01e6\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e6\u01e3\u0001\u0000\u0000\u0000\u01e6\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e7E\u0001\u0000\u0000\u0000\u01e8\u01eb\u0003"+
		"H$\u0000\u01e9\u01eb\u0003<\u001e\u0000\u01ea\u01e8\u0001\u0000\u0000"+
		"\u0000\u01ea\u01e9\u0001\u0000\u0000\u0000\u01ebG\u0001\u0000\u0000\u0000"+
		"\u01ec\u01ed\u0005=\u0000\u0000\u01ed\u01ee\u0005\u000e\u0000\u0000\u01ee"+
		"\u01f1\u0003J%\u0000\u01ef\u01f1\u0003J%\u0000\u01f0\u01ec\u0001\u0000"+
		"\u0000\u0000\u01f0\u01ef\u0001\u0000\u0000\u0000\u01f1I\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f7\u0003L&\u0000\u01f3\u01f4\u0005*\u0000\u0000\u01f4"+
		"\u01f6\u0003L&\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6\u01f9\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001"+
		"\u0000\u0000\u0000\u01f8K\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001\u0000"+
		"\u0000\u0000\u01fa\u01ff\u0003N\'\u0000\u01fb\u01fc\u0005+\u0000\u0000"+
		"\u01fc\u01fe\u0003N\'\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe"+
		"\u0201\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff"+
		"\u0200\u0001\u0000\u0000\u0000\u0200M\u0001\u0000\u0000\u0000\u0201\u01ff"+
		"\u0001\u0000\u0000\u0000\u0202\u0207\u0003P(\u0000\u0203\u0204\u0007\u0000"+
		"\u0000\u0000\u0204\u0206\u0003P(\u0000\u0205\u0203\u0001\u0000\u0000\u0000"+
		"\u0206\u0209\u0001\u0000\u0000\u0000\u0207\u0205\u0001\u0000\u0000\u0000"+
		"\u0207\u0208\u0001\u0000\u0000\u0000\u0208O\u0001\u0000\u0000\u0000\u0209"+
		"\u0207\u0001\u0000\u0000\u0000\u020a\u020f\u0003R)\u0000\u020b\u020c\u0007"+
		"\u0001\u0000\u0000\u020c\u020e\u0003R)\u0000\u020d\u020b\u0001\u0000\u0000"+
		"\u0000\u020e\u0211\u0001\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000"+
		"\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210Q\u0001\u0000\u0000\u0000"+
		"\u0211\u020f\u0001\u0000\u0000\u0000\u0212\u0217\u0003T*\u0000\u0213\u0214"+
		"\u0007\u0002\u0000\u0000\u0214\u0216\u0003T*\u0000\u0215\u0213\u0001\u0000"+
		"\u0000\u0000\u0216\u0219\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000"+
		"\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218S\u0001\u0000\u0000"+
		"\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u021a\u021f\u0003V+\u0000\u021b"+
		"\u021c\u0007\u0003\u0000\u0000\u021c\u021e\u0003V+\u0000\u021d\u021b\u0001"+
		"\u0000\u0000\u0000\u021e\u0221\u0001\u0000\u0000\u0000\u021f\u021d\u0001"+
		"\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220U\u0001\u0000"+
		"\u0000\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0222\u0226\u0003X,\u0000"+
		"\u0223\u0224\u0007\u0004\u0000\u0000\u0224\u0226\u0003V+\u0000\u0225\u0222"+
		"\u0001\u0000\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0226W\u0001"+
		"\u0000\u0000\u0000\u0227\u0228\u0005\b\u0000\u0000\u0228\u0229\u0003F"+
		"#\u0000\u0229\u022a\u0005\t\u0000\u0000\u022a\u0244\u0001\u0000\u0000"+
		"\u0000\u022b\u0230\u0005=\u0000\u0000\u022c\u022d\u00057\u0000\u0000\u022d"+
		"\u022f\u0005=\u0000\u0000\u022e\u022c\u0001\u0000\u0000\u0000\u022f\u0232"+
		"\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0230\u0231"+
		"\u0001\u0000\u0000\u0000\u0231\u0239\u0001\u0000\u0000\u0000\u0232\u0230"+
		"\u0001\u0000\u0000\u0000\u0233\u0234\u0005\f\u0000\u0000\u0234\u0235\u0003"+
		"F#\u0000\u0235\u0236\u0005\r\u0000\u0000\u0236\u0238\u0001\u0000\u0000"+
		"\u0000\u0237\u0233\u0001\u0000\u0000\u0000\u0238\u023b\u0001\u0000\u0000"+
		"\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u0239\u023a\u0001\u0000\u0000"+
		"\u0000\u023a\u0244\u0001\u0000\u0000\u0000\u023b\u0239\u0001\u0000\u0000"+
		"\u0000\u023c\u0244\u00059\u0000\u0000\u023d\u0244\u0005>\u0000\u0000\u023e"+
		"\u023f\u00058\u0000\u0000\u023f\u0240\u0005\b\u0000\u0000\u0240\u0241"+
		"\u0003D\"\u0000\u0241\u0242\u0005\t\u0000\u0000\u0242\u0244\u0001\u0000"+
		"\u0000\u0000\u0243\u0227\u0001\u0000\u0000\u0000\u0243\u022b\u0001\u0000"+
		"\u0000\u0000\u0243\u023c\u0001\u0000\u0000\u0000\u0243\u023d\u0001\u0000"+
		"\u0000\u0000\u0243\u023e\u0001\u0000\u0000\u0000\u0244Y\u0001\u0000\u0000"+
		"\u00007]bd\u0080\u0086\u0090\u009c\u00a7\u00ac\u00b5\u00ba\u00bc\u00c4"+
		"\u00cf\u00d9\u00e4\u00ec\u0104\u010d\u0113\u011e\u0123\u012d\u0139\u0143"+
		"\u0147\u0151\u015c\u0163\u0167\u016b\u0185\u0188\u018e\u0198\u01ae\u01b1"+
		"\u01b4\u01c7\u01ca\u01cd\u01d7\u01e6\u01ea\u01f0\u01f7\u01ff\u0207\u020f"+
		"\u0217\u021f\u0225\u0230\u0239\u0243";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}