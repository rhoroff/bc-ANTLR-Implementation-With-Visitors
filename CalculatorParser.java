// Generated from Calculator.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		CONTINUE=32, BREAK=33, DEFINE=34, STRING=35, IF=36, ELSE=37, WHILE=38, 
		FOR=39, COMMENT=40, ID=41, INT=42, DOUBLE=43, WS=44;
	public static final int
		RULE_input = 0, RULE_id = 1, RULE_paramList = 2, RULE_argumentList = 3, 
		RULE_exprList = 4, RULE_statementList = 5, RULE_comment = 6, RULE_string = 7, 
		RULE_varAssign = 8, RULE_functionCall = 9, RULE_topExpr = 10, RULE_expr = 11, 
		RULE_ifStatement = 12, RULE_loops = 13, RULE_functionDef = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"input", "id", "paramList", "argumentList", "exprList", "statementList", 
			"comment", "string", "varAssign", "functionCall", "topExpr", "expr", 
			"ifStatement", "loops", "functionDef"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'{'", "'}'", "'='", "'('", "')'", "'-'", "'++'", 
			"'--'", "'^'", "'/'", "'*'", "'%'", "'+'", "'s('", "'c('", "'l('", "'e('", 
			"'sqrt('", "'read()'", "'=='", "'<'", "'>'", "'>='", "'<='", "'!='", 
			"'&&'", "'||'", "'!'", "'return '", "'continue'", "'break'", "'define'", 
			null, "'if'", "'else'", "'while'", "'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "CONTINUE", "BREAK", 
			"DEFINE", "STRING", "IF", "ELSE", "WHILE", "FOR", "COMMENT", "ID", "INT", 
			"DOUBLE", "WS"
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
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InputContext extends ParserRuleContext {
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<VarAssignContext> varAssign() {
			return getRuleContexts(VarAssignContext.class);
		}
		public VarAssignContext varAssign(int i) {
			return getRuleContext(VarAssignContext.class,i);
		}
		public List<TopExprContext> topExpr() {
			return getRuleContexts(TopExprContext.class);
		}
		public TopExprContext topExpr(int i) {
			return getRuleContext(TopExprContext.class,i);
		}
		public List<LoopsContext> loops() {
			return getRuleContexts(LoopsContext.class);
		}
		public LoopsContext loops(int i) {
			return getRuleContext(LoopsContext.class,i);
		}
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<FunctionDefContext> functionDef() {
			return getRuleContexts(FunctionDefContext.class);
		}
		public FunctionDefContext functionDef(int i) {
			return getRuleContext(FunctionDefContext.class,i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					comment();
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(36);
					varAssign();
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__29) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(42);
				topExpr();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(48);
					match(T__0);
					setState(49);
					topExpr();
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(55);
				comment();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHILE || _la==FOR) {
				{
				{
				setState(61);
				loops();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF) {
				{
				{
				setState(67);
				ifStatement();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(73);
				string();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFINE) {
				{
				{
				setState(79);
				functionDef();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(85);
					match(T__0);
					setState(86);
					string();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					match(T__0);
					setState(93);
					loops();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(99);
					match(T__0);
					setState(100);
					varAssign();
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(106);
					match(T__0);
					setState(107);
					topExpr();
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113);
					match(T__0);
					setState(114);
					functionDef();
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(120);
				match(T__0);
				}
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(ID);
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

	public static class ParamListContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_paramList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			id();
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(126);
					match(T__1);
					setState(127);
					id();
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argumentList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__29) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(133);
				expr(0);
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(139);
					match(T__1);
					setState(140);
					expr(0);
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exprList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				expr(0);
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__29) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0) );
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					match(T__0);
					setState(152);
					expr(0);
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(158);
				match(T__0);
				}
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

	public static class StatementListContext extends ParserRuleContext {
		public List<TopExprContext> topExpr() {
			return getRuleContexts(TopExprContext.class);
		}
		public TopExprContext topExpr(int i) {
			return getRuleContext(TopExprContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__2);
			setState(162);
			topExpr();
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(163);
					match(T__0);
					setState(164);
					topExpr();
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(170);
				match(T__0);
				}
			}

			setState(173);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(CalculatorParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(COMMENT);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CalculatorParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(STRING);
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

	public static class VarAssignContext extends ParserRuleContext {
		public Token varName;
		public ExprContext ex;
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitVarAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignContext varAssign() throws RecognitionException {
		VarAssignContext _localctx = new VarAssignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			((VarAssignContext)_localctx).varName = match(ID);
			setState(180);
			match(T__4);
			setState(181);
			((VarAssignContext)_localctx).ex = expr(0);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public Token funcName;
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			((FunctionCallContext)_localctx).funcName = match(ID);
			setState(184);
			match(T__5);
			setState(185);
			argumentList();
			setState(186);
			match(T__6);
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

	public static class TopExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TopExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitTopExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopExprContext topExpr() throws RecognitionException {
		TopExprContext _localctx = new TopExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_topExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public double i;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.i = ctx.i;
		}
	}
	public static class OrContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(CalculatorParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadContext extends ExprContext {
		public ReadContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessThanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFunctionCallContext extends ExprContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExprFunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitExprFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LnContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LnContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitLn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParenContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitExprParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarAssignExpressionContext extends ExprContext {
		public VarAssignContext varAssign() {
			return getRuleContext(VarAssignContext.class,0);
		}
		public VarAssignExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitVarAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CosContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CosContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitCos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SqrtContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SqrtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitSqrt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleContext extends ExprContext {
		public TerminalNode DOUBLE() { return getToken(CalculatorParser.DOUBLE, 0); }
		public DoubleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivTimesModContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivTimesModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitDivTimesMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualsContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NotEqualsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitNotEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanEqualsContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanEqualsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitGreaterThanEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarReadContext extends ExprContext {
		public Token var;
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public VarReadContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitVarRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostCrementContext extends ExprContext {
		public ExprContext variable;
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PostCrementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitPostCrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SinContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SinContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitSin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegateContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreCrementContext extends ExprContext {
		public Token op;
		public ExprContext variable;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PreCrementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitPreCrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanEqualsContext extends ExprContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessThanEqualsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitLessThanEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(191);
				match(T__7);
				setState(192);
				((NegateContext)_localctx).ex = expr(27);
				}
				break;
			case 2:
				{
				_localctx = new ExprParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(T__5);
				setState(194);
				((ExprParenContext)_localctx).ex = expr(0);
				setState(195);
				match(T__6);
				}
				break;
			case 3:
				{
				_localctx = new ExprFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				functionCall();
				}
				break;
			case 4:
				{
				_localctx = new PreCrementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				((PreCrementContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
					((PreCrementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(199);
				((PreCrementContext)_localctx).variable = expr(23);
				}
				break;
			case 5:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				match(DOUBLE);
				}
				break;
			case 7:
				{
				_localctx = new VarReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				((VarReadContext)_localctx).var = match(ID);
				}
				break;
			case 8:
				{
				_localctx = new SinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				match(T__15);
				setState(204);
				((SinContext)_localctx).ex = expr(0);
				setState(205);
				match(T__6);
				}
				break;
			case 9:
				{
				_localctx = new CosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(T__16);
				setState(208);
				((CosContext)_localctx).ex = expr(0);
				setState(209);
				match(T__6);
				}
				break;
			case 10:
				{
				_localctx = new LnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(T__17);
				setState(212);
				((LnContext)_localctx).ex = expr(0);
				setState(213);
				match(T__6);
				}
				break;
			case 11:
				{
				_localctx = new ExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(T__18);
				setState(216);
				((ExpContext)_localctx).ex = expr(0);
				setState(217);
				match(T__6);
				}
				break;
			case 12:
				{
				_localctx = new SqrtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(T__19);
				setState(220);
				((SqrtContext)_localctx).ex = expr(0);
				setState(221);
				match(T__6);
				}
				break;
			case 13:
				{
				_localctx = new ReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(T__20);
				}
				break;
			case 14:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(T__29);
				{
				setState(225);
				((NotContext)_localctx).ex = expr(0);
				}
				}
				break;
			case 15:
				{
				_localctx = new VarAssignExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				varAssign();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(264);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExprContext(_parentctx, _parentState));
						((PowContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(229);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(230);
						((PowContext)_localctx).op = match(T__10);
						setState(231);
						((PowContext)_localctx).er = expr(23);
						}
						break;
					case 2:
						{
						_localctx = new DivTimesModContext(new ExprContext(_parentctx, _parentState));
						((DivTimesModContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(232);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(233);
						((DivTimesModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
							((DivTimesModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(234);
						((DivTimesModContext)_localctx).er = expr(22);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						((AddSubContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(235);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(236);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__14) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(237);
						((AddSubContext)_localctx).er = expr(21);
						}
						break;
					case 4:
						{
						_localctx = new EqualsContext(new ExprContext(_parentctx, _parentState));
						((EqualsContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(238);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(239);
						((EqualsContext)_localctx).op = match(T__21);
						setState(240);
						((EqualsContext)_localctx).er = expr(11);
						}
						break;
					case 5:
						{
						_localctx = new LessThanContext(new ExprContext(_parentctx, _parentState));
						((LessThanContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(242);
						((LessThanContext)_localctx).op = match(T__22);
						setState(243);
						((LessThanContext)_localctx).er = expr(10);
						}
						break;
					case 6:
						{
						_localctx = new GreaterThanContext(new ExprContext(_parentctx, _parentState));
						((GreaterThanContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(245);
						((GreaterThanContext)_localctx).op = match(T__23);
						setState(246);
						((GreaterThanContext)_localctx).er = expr(9);
						}
						break;
					case 7:
						{
						_localctx = new GreaterThanEqualsContext(new ExprContext(_parentctx, _parentState));
						((GreaterThanEqualsContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(247);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(248);
						((GreaterThanEqualsContext)_localctx).op = match(T__24);
						setState(249);
						((GreaterThanEqualsContext)_localctx).er = expr(8);
						}
						break;
					case 8:
						{
						_localctx = new LessThanEqualsContext(new ExprContext(_parentctx, _parentState));
						((LessThanEqualsContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(250);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(251);
						((LessThanEqualsContext)_localctx).op = match(T__25);
						setState(252);
						((LessThanEqualsContext)_localctx).er = expr(7);
						}
						break;
					case 9:
						{
						_localctx = new NotEqualsContext(new ExprContext(_parentctx, _parentState));
						((NotEqualsContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(254);
						((NotEqualsContext)_localctx).op = match(T__26);
						setState(255);
						((NotEqualsContext)_localctx).er = expr(6);
						}
						break;
					case 10:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						((AndContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(256);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(257);
						((AndContext)_localctx).op = match(T__27);
						setState(258);
						((AndContext)_localctx).er = expr(5);
						}
						break;
					case 11:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						((OrContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(259);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(260);
						((OrContext)_localctx).op = match(T__28);
						setState(261);
						((OrContext)_localctx).er = expr(4);
						}
						break;
					case 12:
						{
						_localctx = new PostCrementContext(new ExprContext(_parentctx, _parentState));
						((PostCrementContext)_localctx).variable = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(262);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(263);
						((PostCrementContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__9) ) {
							((PostCrementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public ExprContext cond;
		public TopExprContext action;
		public TopExprContext altAction;
		public TerminalNode IF() { return getToken(CalculatorParser.IF, 0); }
		public List<TopExprContext> topExpr() {
			return getRuleContexts(TopExprContext.class);
		}
		public TopExprContext topExpr(int i) {
			return getRuleContext(TopExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CalculatorParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(IF);
			setState(270);
			match(T__5);
			setState(272); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(271);
				((IfStatementContext)_localctx).cond = expr(0);
				}
				}
				setState(274); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__29) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0) );
			setState(276);
			match(T__6);
			setState(277);
			((IfStatementContext)_localctx).action = topExpr();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				{
				setState(278);
				match(ELSE);
				}
				{
				setState(279);
				((IfStatementContext)_localctx).altAction = topExpr();
				}
				}
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

	public static class LoopsContext extends ParserRuleContext {
		public LoopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loops; }
	 
		public LoopsContext() { }
		public void copyFrom(LoopsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForLoopContext extends LoopsContext {
		public ExprContext ex1;
		public VarAssignContext varAss;
		public ExprContext ex2;
		public ExprContext ex3;
		public VarAssignContext varUpdate;
		public TopExprContext action;
		public TerminalNode FOR() { return getToken(CalculatorParser.FOR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TopExprContext topExpr() {
			return getRuleContext(TopExprContext.class,0);
		}
		public List<VarAssignContext> varAssign() {
			return getRuleContexts(VarAssignContext.class);
		}
		public VarAssignContext varAssign(int i) {
			return getRuleContext(VarAssignContext.class,i);
		}
		public ForLoopContext(LoopsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLoopContext extends LoopsContext {
		public ExprContext ex;
		public TopExprContext action;
		public StatementListContext statements;
		public TerminalNode WHILE() { return getToken(CalculatorParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TopExprContext topExpr() {
			return getRuleContext(TopExprContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public WhileLoopContext(LoopsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_loops);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(WHILE);
				setState(283);
				match(T__5);
				setState(284);
				((WhileLoopContext)_localctx).ex = expr(0);
				setState(285);
				match(T__6);
				setState(288);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
				case T__7:
				case T__8:
				case T__9:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__29:
				case ID:
				case INT:
				case DOUBLE:
					{
					setState(286);
					((WhileLoopContext)_localctx).action = topExpr();
					}
					break;
				case T__2:
					{
					setState(287);
					((WhileLoopContext)_localctx).statements = statementList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case FOR:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(FOR);
				setState(291);
				match(T__5);
				setState(294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(292);
					((ForLoopContext)_localctx).ex1 = expr(0);
					}
					break;
				case 2:
					{
					setState(293);
					((ForLoopContext)_localctx).varAss = varAssign();
					}
					break;
				}
				setState(296);
				match(T__0);
				setState(297);
				((ForLoopContext)_localctx).ex2 = expr(0);
				setState(298);
				match(T__0);
				setState(301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(299);
					((ForLoopContext)_localctx).ex3 = expr(0);
					}
					break;
				case 2:
					{
					setState(300);
					((ForLoopContext)_localctx).varUpdate = varAssign();
					}
					break;
				}
				setState(303);
				match(T__6);
				setState(304);
				((ForLoopContext)_localctx).action = topExpr();
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

	public static class FunctionDefContext extends ParserRuleContext {
		public Token funcName;
		public ParamListContext idList;
		public ExprContext returnValue;
		public TerminalNode DEFINE() { return getToken(CalculatorParser.DEFINE, 0); }
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode WS() { return getToken(CalculatorParser.WS, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(DEFINE);
			setState(309);
			((FunctionDefContext)_localctx).funcName = match(ID);
			setState(310);
			match(T__5);
			setState(311);
			((FunctionDefContext)_localctx).idList = paramList();
			setState(312);
			match(T__6);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(313);
				match(WS);
				}
			}

			setState(316);
			match(T__2);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__29) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0)) {
				{
				setState(317);
				exprList();
				}
			}

			setState(320);
			match(T__30);
			setState(321);
			((FunctionDefContext)_localctx).returnValue = expr(0);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(322);
				match(T__0);
				}
			}

			setState(325);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 22);
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 24);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u014a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\7\2.\n\2\f\2\16\2\61\13\2\3\2"+
		"\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\7\2A\n"+
		"\2\f\2\16\2D\13\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\2\7\2M\n\2\f\2\16\2P\13"+
		"\2\3\2\7\2S\n\2\f\2\16\2V\13\2\3\2\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2"+
		"\7\2a\n\2\f\2\16\2d\13\2\3\2\3\2\7\2h\n\2\f\2\16\2k\13\2\3\2\3\2\7\2o"+
		"\n\2\f\2\16\2r\13\2\3\2\3\2\7\2v\n\2\f\2\16\2y\13\2\3\2\5\2|\n\2\3\3\3"+
		"\3\3\4\3\4\3\4\7\4\u0083\n\4\f\4\16\4\u0086\13\4\3\5\7\5\u0089\n\5\f\5"+
		"\16\5\u008c\13\5\3\5\3\5\7\5\u0090\n\5\f\5\16\5\u0093\13\5\3\6\6\6\u0096"+
		"\n\6\r\6\16\6\u0097\3\6\3\6\7\6\u009c\n\6\f\6\16\6\u009f\13\6\3\6\5\6"+
		"\u00a2\n\6\3\7\3\7\3\7\3\7\7\7\u00a8\n\7\f\7\16\7\u00ab\13\7\3\7\5\7\u00ae"+
		"\n\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00e6\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u010b\n\r\f\r\16\r\u010e\13\r\3\16"+
		"\3\16\3\16\6\16\u0113\n\16\r\16\16\16\u0114\3\16\3\16\3\16\3\16\5\16\u011b"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0123\n\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0129\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u0130\n\17\3\17\3\17\3"+
		"\17\5\17\u0135\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u013d\n\20\3\20"+
		"\3\20\5\20\u0141\n\20\3\20\3\20\3\20\5\20\u0146\n\20\3\20\3\20\3\20\5"+
		"\u0084\u0091\u00a9\3\30\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\5"+
		"\3\2\13\f\3\2\16\20\4\2\n\n\21\21\2\u0174\2#\3\2\2\2\4}\3\2\2\2\6\177"+
		"\3\2\2\2\b\u008a\3\2\2\2\n\u0095\3\2\2\2\f\u00a3\3\2\2\2\16\u00b1\3\2"+
		"\2\2\20\u00b3\3\2\2\2\22\u00b5\3\2\2\2\24\u00b9\3\2\2\2\26\u00be\3\2\2"+
		"\2\30\u00e5\3\2\2\2\32\u010f\3\2\2\2\34\u0134\3\2\2\2\36\u0136\3\2\2\2"+
		" \"\5\16\b\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$)\3\2\2\2%#\3\2"+
		"\2\2&(\5\22\n\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*/\3\2\2\2+)"+
		"\3\2\2\2,.\5\26\f\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\66"+
		"\3\2\2\2\61/\3\2\2\2\62\63\7\3\2\2\63\65\5\26\f\2\64\62\3\2\2\2\658\3"+
		"\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67<\3\2\2\28\66\3\2\2\29;\5\16\b\2"+
		":9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=B\3\2\2\2><\3\2\2\2?A\5\34\17"+
		"\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CH\3\2\2\2DB\3\2\2\2EG\5\32"+
		"\16\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IN\3\2\2\2JH\3\2\2\2KM\5"+
		"\20\t\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OT\3\2\2\2PN\3\2\2\2QS"+
		"\5\36\20\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U[\3\2\2\2VT\3\2\2\2"+
		"WX\7\3\2\2XZ\5\20\t\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\b\3\2"+
		"\2\2][\3\2\2\2^_\7\3\2\2_a\5\34\17\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3"+
		"\2\2\2ci\3\2\2\2db\3\2\2\2ef\7\3\2\2fh\5\22\n\2ge\3\2\2\2hk\3\2\2\2ig"+
		"\3\2\2\2ij\3\2\2\2jp\3\2\2\2ki\3\2\2\2lm\7\3\2\2mo\5\26\f\2nl\3\2\2\2"+
		"or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qw\3\2\2\2rp\3\2\2\2st\7\3\2\2tv\5\36\20"+
		"\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x{\3\2\2\2yw\3\2\2\2z|\7\3\2"+
		"\2{z\3\2\2\2{|\3\2\2\2|\3\3\2\2\2}~\7+\2\2~\5\3\2\2\2\177\u0084\5\4\3"+
		"\2\u0080\u0081\7\4\2\2\u0081\u0083\5\4\3\2\u0082\u0080\3\2\2\2\u0083\u0086"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\7\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0089\5\30\r\2\u0088\u0087\3\2\2\2\u0089\u008c\3"+
		"\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0091\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008e\7\4\2\2\u008e\u0090\5\30\r\2\u008f\u008d\3"+
		"\2\2\2\u0090\u0093\3\2\2\2\u0091\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\t\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\5\30\r\2\u0095\u0094\3\2\2"+
		"\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009d"+
		"\3\2\2\2\u0099\u009a\7\3\2\2\u009a\u009c\5\30\r\2\u009b\u0099\3\2\2\2"+
		"\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a1"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\7\3\2\2\u00a1\u00a0\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\13\3\2\2\2\u00a3\u00a4\7\5\2\2\u00a4\u00a9\5\26\f"+
		"\2\u00a5\u00a6\7\3\2\2\u00a6\u00a8\5\26\f\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\7\3\2\2\u00ad\u00ac\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7\6\2\2\u00b0\r\3\2\2\2"+
		"\u00b1\u00b2\7*\2\2\u00b2\17\3\2\2\2\u00b3\u00b4\7%\2\2\u00b4\21\3\2\2"+
		"\2\u00b5\u00b6\7+\2\2\u00b6\u00b7\7\7\2\2\u00b7\u00b8\5\30\r\2\u00b8\23"+
		"\3\2\2\2\u00b9\u00ba\7+\2\2\u00ba\u00bb\7\b\2\2\u00bb\u00bc\5\b\5\2\u00bc"+
		"\u00bd\7\t\2\2\u00bd\25\3\2\2\2\u00be\u00bf\5\30\r\2\u00bf\27\3\2\2\2"+
		"\u00c0\u00c1\b\r\1\2\u00c1\u00c2\7\n\2\2\u00c2\u00e6\5\30\r\35\u00c3\u00c4"+
		"\7\b\2\2\u00c4\u00c5\5\30\r\2\u00c5\u00c6\7\t\2\2\u00c6\u00e6\3\2\2\2"+
		"\u00c7\u00e6\5\24\13\2\u00c8\u00c9\t\2\2\2\u00c9\u00e6\5\30\r\31\u00ca"+
		"\u00e6\7,\2\2\u00cb\u00e6\7-\2\2\u00cc\u00e6\7+\2\2\u00cd\u00ce\7\22\2"+
		"\2\u00ce\u00cf\5\30\r\2\u00cf\u00d0\7\t\2\2\u00d0\u00e6\3\2\2\2\u00d1"+
		"\u00d2\7\23\2\2\u00d2\u00d3\5\30\r\2\u00d3\u00d4\7\t\2\2\u00d4\u00e6\3"+
		"\2\2\2\u00d5\u00d6\7\24\2\2\u00d6\u00d7\5\30\r\2\u00d7\u00d8\7\t\2\2\u00d8"+
		"\u00e6\3\2\2\2\u00d9\u00da\7\25\2\2\u00da\u00db\5\30\r\2\u00db\u00dc\7"+
		"\t\2\2\u00dc\u00e6\3\2\2\2\u00dd\u00de\7\26\2\2\u00de\u00df\5\30\r\2\u00df"+
		"\u00e0\7\t\2\2\u00e0\u00e6\3\2\2\2\u00e1\u00e6\7\27\2\2\u00e2\u00e3\7"+
		" \2\2\u00e3\u00e6\5\30\r\2\u00e4\u00e6\5\22\n\2\u00e5\u00c0\3\2\2\2\u00e5"+
		"\u00c3\3\2\2\2\u00e5\u00c7\3\2\2\2\u00e5\u00c8\3\2\2\2\u00e5\u00ca\3\2"+
		"\2\2\u00e5\u00cb\3\2\2\2\u00e5\u00cc\3\2\2\2\u00e5\u00cd\3\2\2\2\u00e5"+
		"\u00d1\3\2\2\2\u00e5\u00d5\3\2\2\2\u00e5\u00d9\3\2\2\2\u00e5\u00dd\3\2"+
		"\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"\u010c\3\2\2\2\u00e7\u00e8\f\30\2\2\u00e8\u00e9\7\r\2\2\u00e9\u010b\5"+
		"\30\r\31\u00ea\u00eb\f\27\2\2\u00eb\u00ec\t\3\2\2\u00ec\u010b\5\30\r\30"+
		"\u00ed\u00ee\f\26\2\2\u00ee\u00ef\t\4\2\2\u00ef\u010b\5\30\r\27\u00f0"+
		"\u00f1\f\f\2\2\u00f1\u00f2\7\30\2\2\u00f2\u010b\5\30\r\r\u00f3\u00f4\f"+
		"\13\2\2\u00f4\u00f5\7\31\2\2\u00f5\u010b\5\30\r\f\u00f6\u00f7\f\n\2\2"+
		"\u00f7\u00f8\7\32\2\2\u00f8\u010b\5\30\r\13\u00f9\u00fa\f\t\2\2\u00fa"+
		"\u00fb\7\33\2\2\u00fb\u010b\5\30\r\n\u00fc\u00fd\f\b\2\2\u00fd\u00fe\7"+
		"\34\2\2\u00fe\u010b\5\30\r\t\u00ff\u0100\f\7\2\2\u0100\u0101\7\35\2\2"+
		"\u0101\u010b\5\30\r\b\u0102\u0103\f\6\2\2\u0103\u0104\7\36\2\2\u0104\u010b"+
		"\5\30\r\7\u0105\u0106\f\5\2\2\u0106\u0107\7\37\2\2\u0107\u010b\5\30\r"+
		"\6\u0108\u0109\f\32\2\2\u0109\u010b\t\2\2\2\u010a\u00e7\3\2\2\2\u010a"+
		"\u00ea\3\2\2\2\u010a\u00ed\3\2\2\2\u010a\u00f0\3\2\2\2\u010a\u00f3\3\2"+
		"\2\2\u010a\u00f6\3\2\2\2\u010a\u00f9\3\2\2\2\u010a\u00fc\3\2\2\2\u010a"+
		"\u00ff\3\2\2\2\u010a\u0102\3\2\2\2\u010a\u0105\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\31\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7&\2\2\u0110\u0112\7\b\2\2"+
		"\u0111\u0113\5\30\r\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7\t\2\2\u0117"+
		"\u011a\5\26\f\2\u0118\u0119\7\'\2\2\u0119\u011b\5\26\f\2\u011a\u0118\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011b\33\3\2\2\2\u011c\u011d\7(\2\2\u011d\u011e"+
		"\7\b\2\2\u011e\u011f\5\30\r\2\u011f\u0122\7\t\2\2\u0120\u0123\5\26\f\2"+
		"\u0121\u0123\5\f\7\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123\u0135"+
		"\3\2\2\2\u0124\u0125\7)\2\2\u0125\u0128\7\b\2\2\u0126\u0129\5\30\r\2\u0127"+
		"\u0129\5\22\n\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\u012a\3"+
		"\2\2\2\u012a\u012b\7\3\2\2\u012b\u012c\5\30\r\2\u012c\u012f\7\3\2\2\u012d"+
		"\u0130\5\30\r\2\u012e\u0130\5\22\n\2\u012f\u012d\3\2\2\2\u012f\u012e\3"+
		"\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\7\t\2\2\u0132\u0133\5\26\f\2\u0133"+
		"\u0135\3\2\2\2\u0134\u011c\3\2\2\2\u0134\u0124\3\2\2\2\u0135\35\3\2\2"+
		"\2\u0136\u0137\7$\2\2\u0137\u0138\7+\2\2\u0138\u0139\7\b\2\2\u0139\u013a"+
		"\5\6\4\2\u013a\u013c\7\t\2\2\u013b\u013d\7.\2\2\u013c\u013b\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\7\5\2\2\u013f\u0141\5\n"+
		"\6\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0143\7!\2\2\u0143\u0145\5\30\r\2\u0144\u0146\7\3\2\2\u0145\u0144\3\2"+
		"\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\7\6\2\2\u0148"+
		"\37\3\2\2\2%#)/\66<BHNT[bipw{\u0084\u008a\u0091\u0097\u009d\u00a1\u00a9"+
		"\u00ad\u00e5\u010a\u010c\u0114\u011a\u0122\u0128\u012f\u0134\u013c\u0140"+
		"\u0145";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}