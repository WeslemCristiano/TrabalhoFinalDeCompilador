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
		T__52=53, T__53=54, CONSTANT=55, INT=56, FLOAT=57, CHAR=58, PONTERO=59, 
		ARRAY=60, IDENTIFIER=61, STRING_LITERAL=62, HEADER_FILE=63, WS=64, COMMENT=65, 
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
		RULE_returnStatement = 28, RULE_pointerDeclaration = 29, RULE_ternaryStatement = 30, 
		RULE_type = 31, RULE_expression = 32, RULE_assignmentExpression = 33, 
		RULE_logicalOrExpression = 34, RULE_logicalAndExpression = 35, RULE_equalityExpression = 36, 
		RULE_relationalExpression = 37, RULE_additiveExpression = 38, RULE_multiplicativeExpression = 39, 
		RULE_unaryExpression = 40, RULE_primaryExpression = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "preprocessorDirective", "defineDirective", "mainFunction", 
			"declaration", "functionDeclaration", "parameterList", "parameter", "variableDeclaration", 
			"variableDeclarator", "structDeclaration", "structMember", "unionDeclaration", 
			"unionMember", "block", "statement", "expressionStatement", "printfStatement", 
			"scanfStatement", "blockStatement", "ifStatement", "switchStatement", 
			"caseStatement", "defaultStatement", "forStatement", "whileStatement", 
			"doWhileStatement", "chamadaStatement", "returnStatement", "pointerDeclaration", 
			"ternaryStatement", "type", "expression", "assignmentExpression", "logicalOrExpression", 
			"logicalAndExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"primaryExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'include'", "'<'", "'>'", "'define'", "'int'", "'main'", 
			"'('", "')'", "','", "';'", "'['", "']'", "'='", "'struct'", "'{'", "'}'", 
			"'union'", "'printf'", "'scanf'", "'&'", "'if'", "'else'", "'switch'", 
			"'case'", "':'", "'break'", "'default'", "'for'", "'while'", "'do'", 
			"'return'", "'?'", "'float'", "'void'", "'char'", "'double'", "'short'", 
			"'long'", "'unsigned'", "'||'", "'&&'", "'=='", "'!='", "'<='", "'>='", 
			"'+'", "'-'", "'/'", "'%'", "'!'", "'++'", "'--'", "'sizeof'", null, 
			null, null, null, "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "CONSTANT", "INT", "FLOAT", 
			"CHAR", "PONTERO", "ARRAY", "IDENTIFIER", "STRING_LITERAL", "HEADER_FILE", 
			"WS", "COMMENT", "LINE_COMMENT"
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
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					preprocessorDirective();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(92);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(90);
						declaration();
						}
						break;
					case 2:
						{
						setState(91);
						functionDeclaration();
						}
						break;
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(97);
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
			setState(99);
			match(T__0);
			setState(100);
			match(T__1);
			setState(101);
			match(T__2);
			setState(102);
			match(HEADER_FILE);
			setState(103);
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
			setState(105);
			match(T__0);
			setState(106);
			match(T__4);
			setState(107);
			match(IDENTIFIER);
			setState(108);
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
			setState(110);
			match(T__5);
			setState(111);
			match(T__6);
			setState(112);
			match(T__7);
			setState(113);
			match(T__8);
			setState(114);
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
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				structDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				unionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				defineDirective();
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
			setState(123);
			type();
			setState(124);
			match(IDENTIFIER);
			setState(125);
			match(T__7);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2181843386432L) != 0)) {
				{
				setState(126);
				parameterList();
				}
			}

			setState(129);
			match(T__8);
			setState(130);
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
			setState(132);
			parameter();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(133);
				match(T__9);
				setState(134);
				parameter();
				}
				}
				setState(139);
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
			setState(140);
			type();
			setState(141);
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
			setState(143);
			type();
			setState(144);
			variableDeclarator();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(145);
				match(T__9);
				setState(146);
				variableDeclarator();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
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
		public TerminalNode PONTERO() { return getToken(ExprCParser.PONTERO, 0); }
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
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(IDENTIFIER);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(155);
					match(T__11);
					setState(156);
					match(CONSTANT);
					setState(157);
					match(T__12);
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(163);
					match(T__13);
					setState(164);
					expression();
					}
				}

				}
				break;
			case PONTERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(PONTERO);
				setState(168);
				match(IDENTIFIER);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(169);
					match(T__11);
					setState(170);
					match(CONSTANT);
					setState(171);
					match(T__12);
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(177);
					match(T__13);
					setState(178);
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
			setState(183);
			match(T__14);
			setState(184);
			match(IDENTIFIER);
			setState(185);
			match(T__15);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2181843386432L) != 0)) {
				{
				{
				setState(186);
				structMember();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(T__16);
			setState(193);
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
			setState(195);
			type();
			setState(196);
			match(IDENTIFIER);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(197);
				match(T__11);
				setState(198);
				match(CONSTANT);
				setState(199);
				match(T__12);
				}
			}

			setState(202);
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
			setState(204);
			match(T__17);
			setState(205);
			match(IDENTIFIER);
			setState(206);
			match(T__15);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2181843386432L) != 0)) {
				{
				{
				setState(207);
				unionMember();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(T__16);
			setState(214);
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
			setState(216);
			type();
			setState(217);
			match(IDENTIFIER);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(218);
				match(T__11);
				setState(219);
				match(CONSTANT);
				setState(220);
				match(T__12);
				}
			}

			setState(223);
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
			setState(225);
			match(T__15);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6987759224249450816L) != 0)) {
				{
				{
				setState(226);
				statement();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(T__16);
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
		public TernaryStatementContext ternaryStatement() {
			return getRuleContext(TernaryStatementContext.class,0);
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
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				blockStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				variableDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(240);
				whileStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(241);
				doWhileStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(242);
				switchStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(243);
				scanfStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(244);
				printfStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(245);
				chamadaStatement();
				setState(246);
				match(T__10);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(248);
				returnStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(249);
				pointerDeclaration();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(250);
				ternaryStatement();
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
			setState(253);
			expression();
			setState(254);
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
			setState(256);
			match(T__18);
			setState(257);
			match(T__7);
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(258);
				expression();
				}
				break;
			case 2:
				{
				setState(259);
				match(STRING_LITERAL);
				}
				break;
			}
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(262);
				match(T__9);
				setState(263);
				expression();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			match(T__8);
			setState(270);
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
			setState(272);
			match(T__19);
			setState(273);
			match(T__7);
			setState(274);
			match(STRING_LITERAL);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(275);
				match(T__9);
				{
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(276);
					match(T__20);
					}
				}

				setState(279);
				match(IDENTIFIER);
				}
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			match(T__8);
			setState(286);
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
			setState(288);
			match(T__15);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6987759224249450816L) != 0)) {
				{
				{
				setState(289);
				statement();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			match(T__16);
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
			setState(297);
			match(T__21);
			setState(298);
			match(T__7);
			setState(299);
			expression();
			setState(300);
			match(T__8);
			setState(301);
			statement();
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(302);
				match(T__22);
				setState(303);
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
			setState(306);
			match(T__23);
			setState(307);
			match(T__7);
			setState(308);
			expression();
			setState(309);
			match(T__8);
			setState(310);
			match(T__15);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(311);
				caseStatement();
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(317);
				defaultStatement();
				}
			}

			setState(320);
			match(T__16);
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
			setState(322);
			match(T__24);
			setState(323);
			match(CONSTANT);
			setState(324);
			match(T__25);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6987759224249450816L) != 0)) {
				{
				{
				setState(325);
				statement();
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(331);
			match(T__26);
			setState(332);
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
			setState(334);
			match(T__27);
			setState(335);
			match(T__25);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6987759224249450816L) != 0)) {
				{
				{
				setState(336);
				statement();
				}
				}
				setState(341);
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
			setState(342);
			match(T__28);
			setState(343);
			match(T__7);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6987757034330390784L) != 0)) {
				{
				setState(344);
				expression();
				}
			}

			setState(347);
			match(T__10);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6987757034330390784L) != 0)) {
				{
				setState(348);
				expression();
				}
			}

			setState(351);
			match(T__10);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6987757034330390784L) != 0)) {
				{
				setState(352);
				expression();
				}
			}

			setState(355);
			match(T__8);
			setState(356);
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
			setState(358);
			match(T__29);
			setState(359);
			match(T__7);
			setState(360);
			expression();
			setState(361);
			match(T__8);
			setState(362);
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
			setState(364);
			match(T__30);
			setState(365);
			statement();
			setState(366);
			match(T__29);
			setState(367);
			match(T__7);
			setState(368);
			expression();
			setState(369);
			match(T__8);
			setState(370);
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
			setState(372);
			match(IDENTIFIER);
			setState(373);
			match(T__7);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6987757034330390784L) != 0)) {
				{
				setState(374);
				expression();
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(375);
					match(T__9);
					setState(376);
					expression();
					}
					}
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(384);
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
			setState(386);
			match(T__31);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6987757034330390784L) != 0)) {
				{
				setState(387);
				expression();
				}
			}

			setState(390);
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
		public List<TerminalNode> PONTERO() { return getTokens(ExprCParser.PONTERO); }
		public TerminalNode PONTERO(int i) {
			return getToken(ExprCParser.PONTERO, i);
		}
		public TerminalNode CONSTANT() { return getToken(ExprCParser.CONSTANT, 0); }
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
			setState(392);
			type();
			setState(394); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(393);
				match(PONTERO);
				}
				}
				setState(396); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PONTERO );
			setState(398);
			match(IDENTIFIER);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(399);
				match(T__11);
				setState(400);
				match(CONSTANT);
				setState(401);
				match(T__12);
				}
			}

			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(404);
				match(T__13);
				setState(405);
				match(T__20);
				setState(406);
				match(IDENTIFIER);
				}
			}

			setState(409);
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
	public static class TernaryStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ExprCParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TernaryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryStatement; }
	}

	public final TernaryStatementContext ternaryStatement() throws RecognitionException {
		TernaryStatementContext _localctx = new TernaryStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ternaryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(IDENTIFIER);
			setState(412);
			match(T__13);
			setState(413);
			expression();
			setState(414);
			match(T__32);
			setState(415);
			expression();
			setState(416);
			match(T__25);
			setState(417);
			expression();
			setState(418);
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
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2181843386432L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			assignmentExpression();
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
		enterRule(_localctx, 66, RULE_assignmentExpression);
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(IDENTIFIER);
				setState(425);
				match(T__13);
				setState(426);
				logicalOrExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
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
		enterRule(_localctx, 68, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			logicalAndExpression();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__40) {
				{
				{
				setState(431);
				match(T__40);
				setState(432);
				logicalAndExpression();
				}
				}
				setState(437);
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
		enterRule(_localctx, 70, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			equalityExpression();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__41) {
				{
				{
				setState(439);
				match(T__41);
				setState(440);
				equalityExpression();
				}
				}
				setState(445);
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
		enterRule(_localctx, 72, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			relationalExpression();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42 || _la==T__43) {
				{
				{
				setState(447);
				_la = _input.LA(1);
				if ( !(_la==T__42 || _la==T__43) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(448);
				relationalExpression();
				}
				}
				setState(453);
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
		enterRule(_localctx, 74, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			additiveExpression();
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 105553116266520L) != 0)) {
				{
				{
				setState(455);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 105553116266520L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(456);
				additiveExpression();
				}
				}
				setState(461);
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
		enterRule(_localctx, 76, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			multiplicativeExpression();
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__46 || _la==T__47) {
				{
				{
				setState(463);
				_la = _input.LA(1);
				if ( !(_la==T__46 || _la==T__47) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(464);
				multiplicativeExpression();
				}
				}
				setState(469);
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
		public List<TerminalNode> PONTERO() { return getTokens(ExprCParser.PONTERO); }
		public TerminalNode PONTERO(int i) {
			return getToken(ExprCParser.PONTERO, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			unaryExpression();
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 578149602163687424L) != 0)) {
				{
				{
				setState(471);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 578149602163687424L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(472);
				unaryExpression();
				}
				}
				setState(477);
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
		enterRule(_localctx, 80, RULE_unaryExpression);
		int _la;
		try {
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__53:
			case CONSTANT:
			case IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				primaryExpression();
				}
				break;
			case T__46:
			case T__47:
			case T__50:
			case T__51:
			case T__52:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16184811160862720L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(480);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ExprCParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 82, RULE_primaryExpression);
		try {
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				match(T__7);
				setState(484);
				expression();
				setState(485);
				match(T__8);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				match(IDENTIFIER);
				}
				break;
			case CONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				match(CONSTANT);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
				match(STRING_LITERAL);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 5);
				{
				setState(490);
				match(T__53);
				setState(491);
				match(T__7);
				setState(492);
				type();
				setState(493);
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
		"\u0004\u0001B\u01f2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0001\u0000\u0005\u0000V\b\u0000\n\u0000\f\u0000"+
		"Y\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000]\b\u0000\n\u0000\f\u0000"+
		"`\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004z\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u0080\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0088\b\u0006\n\u0006"+
		"\f\u0006\u008b\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u0094\b\b\n\b\f\b\u0097\t\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u009f\b\t\n\t\f\t\u00a2\t\t\u0001"+
		"\t\u0001\t\u0003\t\u00a6\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u00ad\b\t\n\t\f\t\u00b0\t\t\u0001\t\u0001\t\u0003\t\u00b4\b\t\u0003"+
		"\t\u00b6\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00bc\b\n\n\n\f\n"+
		"\u00bf\t\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00c9\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00d1\b\f\n\f\f\f\u00d4\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00de"+
		"\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000e\u00e4\b\u000e"+
		"\n\u000e\f\u000e\u00e7\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00fc\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0105\b\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0109"+
		"\b\u0011\n\u0011\f\u0011\u010c\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0116\b\u0012\u0001\u0012\u0005\u0012\u0119\b\u0012\n\u0012\f\u0012\u011c"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u0123\b\u0013\n\u0013\f\u0013\u0126\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0131\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0139\b\u0015\n\u0015"+
		"\f\u0015\u013c\t\u0015\u0001\u0015\u0003\u0015\u013f\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u0147\b\u0016\n\u0016\f\u0016\u014a\t\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0152\b\u0017\n"+
		"\u0017\f\u0017\u0155\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u015a\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u015e\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u0162\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u017a\b\u001b\n\u001b\f\u001b\u017d"+
		"\t\u001b\u0003\u001b\u017f\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0185\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0004\u001d\u018b\b\u001d\u000b\u001d\f\u001d\u018c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0193\b\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0198\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0003!\u01ad\b!\u0001\"\u0001\"\u0001"+
		"\"\u0005\"\u01b2\b\"\n\"\f\"\u01b5\t\"\u0001#\u0001#\u0001#\u0005#\u01ba"+
		"\b#\n#\f#\u01bd\t#\u0001$\u0001$\u0001$\u0005$\u01c2\b$\n$\f$\u01c5\t"+
		"$\u0001%\u0001%\u0001%\u0005%\u01ca\b%\n%\f%\u01cd\t%\u0001&\u0001&\u0001"+
		"&\u0005&\u01d2\b&\n&\f&\u01d5\t&\u0001\'\u0001\'\u0001\'\u0005\'\u01da"+
		"\b\'\n\'\f\'\u01dd\t\'\u0001(\u0001(\u0001(\u0003(\u01e2\b(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u01f0\b)\u0001)\u0000\u0000*\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPR\u0000\u0006\u0002\u0000\u0006\u0006\"(\u0001\u0000+,\u0002\u0000"+
		"\u0003\u0004-.\u0001\u0000/0\u0002\u000012;;\u0002\u0000/035\u0208\u0000"+
		"W\u0001\u0000\u0000\u0000\u0002c\u0001\u0000\u0000\u0000\u0004i\u0001"+
		"\u0000\u0000\u0000\u0006n\u0001\u0000\u0000\u0000\by\u0001\u0000\u0000"+
		"\u0000\n{\u0001\u0000\u0000\u0000\f\u0084\u0001\u0000\u0000\u0000\u000e"+
		"\u008c\u0001\u0000\u0000\u0000\u0010\u008f\u0001\u0000\u0000\u0000\u0012"+
		"\u00b5\u0001\u0000\u0000\u0000\u0014\u00b7\u0001\u0000\u0000\u0000\u0016"+
		"\u00c3\u0001\u0000\u0000\u0000\u0018\u00cc\u0001\u0000\u0000\u0000\u001a"+
		"\u00d8\u0001\u0000\u0000\u0000\u001c\u00e1\u0001\u0000\u0000\u0000\u001e"+
		"\u00fb\u0001\u0000\u0000\u0000 \u00fd\u0001\u0000\u0000\u0000\"\u0100"+
		"\u0001\u0000\u0000\u0000$\u0110\u0001\u0000\u0000\u0000&\u0120\u0001\u0000"+
		"\u0000\u0000(\u0129\u0001\u0000\u0000\u0000*\u0132\u0001\u0000\u0000\u0000"+
		",\u0142\u0001\u0000\u0000\u0000.\u014e\u0001\u0000\u0000\u00000\u0156"+
		"\u0001\u0000\u0000\u00002\u0166\u0001\u0000\u0000\u00004\u016c\u0001\u0000"+
		"\u0000\u00006\u0174\u0001\u0000\u0000\u00008\u0182\u0001\u0000\u0000\u0000"+
		":\u0188\u0001\u0000\u0000\u0000<\u019b\u0001\u0000\u0000\u0000>\u01a4"+
		"\u0001\u0000\u0000\u0000@\u01a6\u0001\u0000\u0000\u0000B\u01ac\u0001\u0000"+
		"\u0000\u0000D\u01ae\u0001\u0000\u0000\u0000F\u01b6\u0001\u0000\u0000\u0000"+
		"H\u01be\u0001\u0000\u0000\u0000J\u01c6\u0001\u0000\u0000\u0000L\u01ce"+
		"\u0001\u0000\u0000\u0000N\u01d6\u0001\u0000\u0000\u0000P\u01e1\u0001\u0000"+
		"\u0000\u0000R\u01ef\u0001\u0000\u0000\u0000TV\u0003\u0002\u0001\u0000"+
		"UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000X^\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000Z]\u0003\b\u0004\u0000[]\u0003\n\u0005\u0000\\Z\u0001\u0000"+
		"\u0000\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000ab\u0003\u0006\u0003\u0000b\u0001\u0001\u0000"+
		"\u0000\u0000cd\u0005\u0001\u0000\u0000de\u0005\u0002\u0000\u0000ef\u0005"+
		"\u0003\u0000\u0000fg\u0005?\u0000\u0000gh\u0005\u0004\u0000\u0000h\u0003"+
		"\u0001\u0000\u0000\u0000ij\u0005\u0001\u0000\u0000jk\u0005\u0005\u0000"+
		"\u0000kl\u0005=\u0000\u0000lm\u00057\u0000\u0000m\u0005\u0001\u0000\u0000"+
		"\u0000no\u0005\u0006\u0000\u0000op\u0005\u0007\u0000\u0000pq\u0005\b\u0000"+
		"\u0000qr\u0005\t\u0000\u0000rs\u0003\u001c\u000e\u0000s\u0007\u0001\u0000"+
		"\u0000\u0000tz\u0003\u0010\b\u0000uz\u0003\u001e\u000f\u0000vz\u0003\u0014"+
		"\n\u0000wz\u0003\u0018\f\u0000xz\u0003\u0004\u0002\u0000yt\u0001\u0000"+
		"\u0000\u0000yu\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z\t\u0001\u0000\u0000\u0000"+
		"{|\u0003>\u001f\u0000|}\u0005=\u0000\u0000}\u007f\u0005\b\u0000\u0000"+
		"~\u0080\u0003\f\u0006\u0000\u007f~\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005\t\u0000\u0000\u0082\u0083\u0003\u001c\u000e\u0000\u0083\u000b\u0001"+
		"\u0000\u0000\u0000\u0084\u0089\u0003\u000e\u0007\u0000\u0085\u0086\u0005"+
		"\n\u0000\u0000\u0086\u0088\u0003\u000e\u0007\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\r\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d\u0003>\u001f\u0000"+
		"\u008d\u008e\u0005=\u0000\u0000\u008e\u000f\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0003>\u001f\u0000\u0090\u0095\u0003\u0012\t\u0000\u0091\u0092"+
		"\u0005\n\u0000\u0000\u0092\u0094\u0003\u0012\t\u0000\u0093\u0091\u0001"+
		"\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001"+
		"\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0005"+
		"\u000b\u0000\u0000\u0099\u0011\u0001\u0000\u0000\u0000\u009a\u00a0\u0005"+
		"=\u0000\u0000\u009b\u009c\u0005\f\u0000\u0000\u009c\u009d\u00057\u0000"+
		"\u0000\u009d\u009f\u0005\r\u0000\u0000\u009e\u009b\u0001\u0000\u0000\u0000"+
		"\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u000e\u0000\u0000"+
		"\u00a4\u00a6\u0003@ \u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6\u00b6\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0005;\u0000\u0000\u00a8\u00ae\u0005=\u0000\u0000\u00a9\u00aa\u0005\f"+
		"\u0000\u0000\u00aa\u00ab\u00057\u0000\u0000\u00ab\u00ad\u0005\r\u0000"+
		"\u0000\u00ac\u00a9\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000"+
		"\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000"+
		"\u0000\u00af\u00b3\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0005\u000e\u0000\u0000\u00b2\u00b4\u0003@ \u0000\u00b3"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b5\u009a\u0001\u0000\u0000\u0000\u00b5"+
		"\u00a7\u0001\u0000\u0000\u0000\u00b6\u0013\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0005\u000f\u0000\u0000\u00b8\u00b9\u0005=\u0000\u0000\u00b9\u00bd"+
		"\u0005\u0010\u0000\u0000\u00ba\u00bc\u0003\u0016\u000b\u0000\u00bb\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c0"+
		"\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0005\u0011\u0000\u0000\u00c1\u00c2\u0005\u000b\u0000\u0000\u00c2\u0015"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0003>\u001f\u0000\u00c4\u00c8\u0005"+
		"=\u0000\u0000\u00c5\u00c6\u0005\f\u0000\u0000\u00c6\u00c7\u00057\u0000"+
		"\u0000\u00c7\u00c9\u0005\r\u0000\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0005\u000b\u0000\u0000\u00cb\u0017\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0005\u0012\u0000\u0000\u00cd\u00ce\u0005=\u0000\u0000\u00ce"+
		"\u00d2\u0005\u0010\u0000\u0000\u00cf\u00d1\u0003\u001a\r\u0000\u00d0\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0005\u0011\u0000\u0000\u00d6\u00d7\u0005\u000b\u0000\u0000\u00d7\u0019"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0003>\u001f\u0000\u00d9\u00dd\u0005"+
		"=\u0000\u0000\u00da\u00db\u0005\f\u0000\u0000\u00db\u00dc\u00057\u0000"+
		"\u0000\u00dc\u00de\u0005\r\u0000\u0000\u00dd\u00da\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0005\u000b\u0000\u0000\u00e0\u001b\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e5\u0005\u0010\u0000\u0000\u00e2\u00e4\u0003\u001e\u000f\u0000"+
		"\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0005\u0011\u0000\u0000\u00e9\u001d\u0001\u0000\u0000\u0000"+
		"\u00ea\u00fc\u0003 \u0010\u0000\u00eb\u00fc\u0003&\u0013\u0000\u00ec\u00fc"+
		"\u0003(\u0014\u0000\u00ed\u00fc\u00038\u001c\u0000\u00ee\u00fc\u0003\u0010"+
		"\b\u0000\u00ef\u00fc\u00030\u0018\u0000\u00f0\u00fc\u00032\u0019\u0000"+
		"\u00f1\u00fc\u00034\u001a\u0000\u00f2\u00fc\u0003*\u0015\u0000\u00f3\u00fc"+
		"\u0003$\u0012\u0000\u00f4\u00fc\u0003\"\u0011\u0000\u00f5\u00f6\u0003"+
		"6\u001b\u0000\u00f6\u00f7\u0005\u000b\u0000\u0000\u00f7\u00fc\u0001\u0000"+
		"\u0000\u0000\u00f8\u00fc\u00038\u001c\u0000\u00f9\u00fc\u0003:\u001d\u0000"+
		"\u00fa\u00fc\u0003<\u001e\u0000\u00fb\u00ea\u0001\u0000\u0000\u0000\u00fb"+
		"\u00eb\u0001\u0000\u0000\u0000\u00fb\u00ec\u0001\u0000\u0000\u0000\u00fb"+
		"\u00ed\u0001\u0000\u0000\u0000\u00fb\u00ee\u0001\u0000\u0000\u0000\u00fb"+
		"\u00ef\u0001\u0000\u0000\u0000\u00fb\u00f0\u0001\u0000\u0000\u0000\u00fb"+
		"\u00f1\u0001\u0000\u0000\u0000\u00fb\u00f2\u0001\u0000\u0000\u0000\u00fb"+
		"\u00f3\u0001\u0000\u0000\u0000\u00fb\u00f4\u0001\u0000\u0000\u0000\u00fb"+
		"\u00f5\u0001\u0000\u0000\u0000\u00fb\u00f8\u0001\u0000\u0000\u0000\u00fb"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc"+
		"\u001f\u0001\u0000\u0000\u0000\u00fd\u00fe\u0003@ \u0000\u00fe\u00ff\u0005"+
		"\u000b\u0000\u0000\u00ff!\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u0013"+
		"\u0000\u0000\u0101\u0104\u0005\b\u0000\u0000\u0102\u0105\u0003@ \u0000"+
		"\u0103\u0105\u0005>\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104"+
		"\u0103\u0001\u0000\u0000\u0000\u0105\u010a\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0005\n\u0000\u0000\u0107\u0109\u0003@ \u0000\u0108\u0106\u0001"+
		"\u0000\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010d\u0001"+
		"\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u010e\u0005"+
		"\t\u0000\u0000\u010e\u010f\u0005\u000b\u0000\u0000\u010f#\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0005\u0014\u0000\u0000\u0111\u0112\u0005\b\u0000"+
		"\u0000\u0112\u011a\u0005>\u0000\u0000\u0113\u0115\u0005\n\u0000\u0000"+
		"\u0114\u0116\u0005\u0015\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000"+
		"\u0117\u0119\u0005=\u0000\u0000\u0118\u0113\u0001\u0000\u0000\u0000\u0119"+
		"\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0001\u0000\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c"+
		"\u011a\u0001\u0000\u0000\u0000\u011d\u011e\u0005\t\u0000\u0000\u011e\u011f"+
		"\u0005\u000b\u0000\u0000\u011f%\u0001\u0000\u0000\u0000\u0120\u0124\u0005"+
		"\u0010\u0000\u0000\u0121\u0123\u0003\u001e\u000f\u0000\u0122\u0121\u0001"+
		"\u0000\u0000\u0000\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0127\u0001"+
		"\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u0128\u0005"+
		"\u0011\u0000\u0000\u0128\'\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u0016"+
		"\u0000\u0000\u012a\u012b\u0005\b\u0000\u0000\u012b\u012c\u0003@ \u0000"+
		"\u012c\u012d\u0005\t\u0000\u0000\u012d\u0130\u0003\u001e\u000f\u0000\u012e"+
		"\u012f\u0005\u0017\u0000\u0000\u012f\u0131\u0003\u001e\u000f\u0000\u0130"+
		"\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131"+
		")\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u0018\u0000\u0000\u0133\u0134"+
		"\u0005\b\u0000\u0000\u0134\u0135\u0003@ \u0000\u0135\u0136\u0005\t\u0000"+
		"\u0000\u0136\u013a\u0005\u0010\u0000\u0000\u0137\u0139\u0003,\u0016\u0000"+
		"\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000"+
		"\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000"+
		"\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000"+
		"\u013d\u013f\u0003.\u0017\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013e"+
		"\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140"+
		"\u0141\u0005\u0011\u0000\u0000\u0141+\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0005\u0019\u0000\u0000\u0143\u0144\u00057\u0000\u0000\u0144\u0148\u0005"+
		"\u001a\u0000\u0000\u0145\u0147\u0003\u001e\u000f\u0000\u0146\u0145\u0001"+
		"\u0000\u0000\u0000\u0147\u014a\u0001\u0000\u0000\u0000\u0148\u0146\u0001"+
		"\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014b\u0001"+
		"\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014b\u014c\u0005"+
		"\u001b\u0000\u0000\u014c\u014d\u0005\u000b\u0000\u0000\u014d-\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0005\u001c\u0000\u0000\u014f\u0153\u0005\u001a"+
		"\u0000\u0000\u0150\u0152\u0003\u001e\u000f\u0000\u0151\u0150\u0001\u0000"+
		"\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154/\u0001\u0000\u0000"+
		"\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u0157\u0005\u001d\u0000"+
		"\u0000\u0157\u0159\u0005\b\u0000\u0000\u0158\u015a\u0003@ \u0000\u0159"+
		"\u0158\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a"+
		"\u015b\u0001\u0000\u0000\u0000\u015b\u015d\u0005\u000b\u0000\u0000\u015c"+
		"\u015e\u0003@ \u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015d\u015e\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0161\u0005"+
		"\u000b\u0000\u0000\u0160\u0162\u0003@ \u0000\u0161\u0160\u0001\u0000\u0000"+
		"\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000"+
		"\u0000\u0163\u0164\u0005\t\u0000\u0000\u0164\u0165\u0003\u001e\u000f\u0000"+
		"\u01651\u0001\u0000\u0000\u0000\u0166\u0167\u0005\u001e\u0000\u0000\u0167"+
		"\u0168\u0005\b\u0000\u0000\u0168\u0169\u0003@ \u0000\u0169\u016a\u0005"+
		"\t\u0000\u0000\u016a\u016b\u0003\u001e\u000f\u0000\u016b3\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0005\u001f\u0000\u0000\u016d\u016e\u0003\u001e"+
		"\u000f\u0000\u016e\u016f\u0005\u001e\u0000\u0000\u016f\u0170\u0005\b\u0000"+
		"\u0000\u0170\u0171\u0003@ \u0000\u0171\u0172\u0005\t\u0000\u0000\u0172"+
		"\u0173\u0005\u000b\u0000\u0000\u01735\u0001\u0000\u0000\u0000\u0174\u0175"+
		"\u0005=\u0000\u0000\u0175\u017e\u0005\b\u0000\u0000\u0176\u017b\u0003"+
		"@ \u0000\u0177\u0178\u0005\n\u0000\u0000\u0178\u017a\u0003@ \u0000\u0179"+
		"\u0177\u0001\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b"+
		"\u0179\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c"+
		"\u017f\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017e"+
		"\u0176\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f"+
		"\u0180\u0001\u0000\u0000\u0000\u0180\u0181\u0005\t\u0000\u0000\u01817"+
		"\u0001\u0000\u0000\u0000\u0182\u0184\u0005 \u0000\u0000\u0183\u0185\u0003"+
		"@ \u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000"+
		"\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u0005\u000b\u0000"+
		"\u0000\u01879\u0001\u0000\u0000\u0000\u0188\u018a\u0003>\u001f\u0000\u0189"+
		"\u018b\u0005;\u0000\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018b\u018c"+
		"\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018d"+
		"\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u0192"+
		"\u0005=\u0000\u0000\u018f\u0190\u0005\f\u0000\u0000\u0190\u0191\u0005"+
		"7\u0000\u0000\u0191\u0193\u0005\r\u0000\u0000\u0192\u018f\u0001\u0000"+
		"\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0197\u0001\u0000"+
		"\u0000\u0000\u0194\u0195\u0005\u000e\u0000\u0000\u0195\u0196\u0005\u0015"+
		"\u0000\u0000\u0196\u0198\u0005=\u0000\u0000\u0197\u0194\u0001\u0000\u0000"+
		"\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000"+
		"\u0000\u0199\u019a\u0005\u000b\u0000\u0000\u019a;\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0005=\u0000\u0000\u019c\u019d\u0005\u000e\u0000\u0000\u019d"+
		"\u019e\u0003@ \u0000\u019e\u019f\u0005!\u0000\u0000\u019f\u01a0\u0003"+
		"@ \u0000\u01a0\u01a1\u0005\u001a\u0000\u0000\u01a1\u01a2\u0003@ \u0000"+
		"\u01a2\u01a3\u0005\u000b\u0000\u0000\u01a3=\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a5\u0007\u0000\u0000\u0000\u01a5?\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0003B!\u0000\u01a7A\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005=\u0000"+
		"\u0000\u01a9\u01aa\u0005\u000e\u0000\u0000\u01aa\u01ad\u0003D\"\u0000"+
		"\u01ab\u01ad\u0003D\"\u0000\u01ac\u01a8\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ab\u0001\u0000\u0000\u0000\u01adC\u0001\u0000\u0000\u0000\u01ae\u01b3"+
		"\u0003F#\u0000\u01af\u01b0\u0005)\u0000\u0000\u01b0\u01b2\u0003F#\u0000"+
		"\u01b1\u01af\u0001\u0000\u0000\u0000\u01b2\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b4E\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b6"+
		"\u01bb\u0003H$\u0000\u01b7\u01b8\u0005*\u0000\u0000\u01b8\u01ba\u0003"+
		"H$\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000"+
		"\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000"+
		"\u0000\u01bcG\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000"+
		"\u01be\u01c3\u0003J%\u0000\u01bf\u01c0\u0007\u0001\u0000\u0000\u01c0\u01c2"+
		"\u0003J%\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c4I\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c6\u01cb\u0003L&\u0000\u01c7\u01c8\u0007\u0002\u0000\u0000\u01c8"+
		"\u01ca\u0003L&\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01ca\u01cd\u0001"+
		"\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001"+
		"\u0000\u0000\u0000\u01ccK\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000"+
		"\u0000\u0000\u01ce\u01d3\u0003N\'\u0000\u01cf\u01d0\u0007\u0003\u0000"+
		"\u0000\u01d0\u01d2\u0003N\'\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d5\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4M\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d6\u01db\u0003P(\u0000\u01d7\u01d8\u0007"+
		"\u0004\u0000\u0000\u01d8\u01da\u0003P(\u0000\u01d9\u01d7\u0001\u0000\u0000"+
		"\u0000\u01da\u01dd\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000"+
		"\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dcO\u0001\u0000\u0000\u0000"+
		"\u01dd\u01db\u0001\u0000\u0000\u0000\u01de\u01e2\u0003R)\u0000\u01df\u01e0"+
		"\u0007\u0005\u0000\u0000\u01e0\u01e2\u0003P(\u0000\u01e1\u01de\u0001\u0000"+
		"\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e2Q\u0001\u0000\u0000"+
		"\u0000\u01e3\u01e4\u0005\b\u0000\u0000\u01e4\u01e5\u0003@ \u0000\u01e5"+
		"\u01e6\u0005\t\u0000\u0000\u01e6\u01f0\u0001\u0000\u0000\u0000\u01e7\u01f0"+
		"\u0005=\u0000\u0000\u01e8\u01f0\u00057\u0000\u0000\u01e9\u01f0\u0005>"+
		"\u0000\u0000\u01ea\u01eb\u00056\u0000\u0000\u01eb\u01ec\u0005\b\u0000"+
		"\u0000\u01ec\u01ed\u0003>\u001f\u0000\u01ed\u01ee\u0005\t\u0000\u0000"+
		"\u01ee\u01f0\u0001\u0000\u0000\u0000\u01ef\u01e3\u0001\u0000\u0000\u0000"+
		"\u01ef\u01e7\u0001\u0000\u0000\u0000\u01ef\u01e8\u0001\u0000\u0000\u0000"+
		"\u01ef\u01e9\u0001\u0000\u0000\u0000\u01ef\u01ea\u0001\u0000\u0000\u0000"+
		"\u01f0S\u0001\u0000\u0000\u0000.W\\^y\u007f\u0089\u0095\u00a0\u00a5\u00ae"+
		"\u00b3\u00b5\u00bd\u00c8\u00d2\u00dd\u00e5\u00fb\u0104\u010a\u0115\u011a"+
		"\u0124\u0130\u013a\u013e\u0148\u0153\u0159\u015d\u0161\u017b\u017e\u0184"+
		"\u018c\u0192\u0197\u01ac\u01b3\u01bb\u01c3\u01cb\u01d3\u01db\u01e1\u01ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}