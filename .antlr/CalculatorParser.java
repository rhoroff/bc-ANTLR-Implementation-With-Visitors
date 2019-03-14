// Generated from /Users/ryanhoroff/OneDrive/Spring 2019 School Work/COP4020/P2/Calculator.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		DEFINE=32, STRING=33, IF=34, ELSE=35, WHILE=36, FOR=37, COMMENT=38, ID=39, 
		INT=40, DOUBLE=41, WS=42;
	public static final int
		RULE_input = 0, RULE_id = 1, RULE_paramList = 2, RULE_argumentList = 3, 
		RULE_exprList = 4, RULE_comment = 5, RULE_string = 6, RULE_varAssign = 7, 
		RULE_functionCall = 8, RULE_topExpr = 9, RULE_expr = 10, RULE_ifStatement = 11, 
		RULE_loops = 12, RULE_functionDef = 13;
	public static final String[] ruleNames = {
		"input", "id", "paramList", "argumentList", "exprList", "comment", "string", 
		"varAssign", "functionCall", "topExpr", "expr", "ifStatement", "loops", 
		"functionDef"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "','", "'='", "'('", "')'", "'-'", "'++'", "'--'", "'^'", 
		"'/'", "'*'", "'%'", "'+'", "'s('", "'c('", "'l('", "'e('", "'sqrt('", 
		"'read()'", "'=='", "'<'", "'>'", "'>='", "'<='", "'!='", "'&&'", "'||'", 
		"'!'", "'{'", "'return '", "'}'", "'define'", null, "'if'", "'else'", 
		"'while'", "'for'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "DEFINE", "STRING", "IF", 
		"ELSE", "WHILE", "FOR", "COMMENT", "ID", "INT", "DOUBLE", "WS"
	};
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
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(28);
					comment();
					}
					} 
				}
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(34);
					varAssign();
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__27) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(40);
				topExpr();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(46);
					match(T__0);
					setState(47);
					topExpr();
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(53);
				comment();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHILE || _la==FOR) {
				{
				{
				setState(59);
				loops();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF) {
				{
				{
				setState(65);
				ifStatement();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(71);
				string();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFINE) {
				{
				{
				setState(77);
				functionDef();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(83);
					match(T__0);
					setState(84);
					string();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					match(T__0);
					setState(91);
					loops();
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(97);
					match(T__0);
					setState(98);
					varAssign();
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					match(T__0);
					setState(105);
					topExpr();
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					match(T__0);
					setState(112);
					functionDef();
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(118);
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
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_paramList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			id();
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(124);
					match(T__1);
					setState(125);
					id();
					}
					} 
				}
				setState(130);
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
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argumentList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__27) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(131);
				expr(0);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(137);
					match(T__1);
					setState(138);
					expr(0);
					}
					} 
				}
				setState(143);
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
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exprList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				expr(0);
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__27) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0) );
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(149);
					match(T__0);
					setState(150);
					expr(0);
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(156);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(CalculatorParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
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
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
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
	}

	public final VarAssignContext varAssign() throws RecognitionException {
		VarAssignContext _localctx = new VarAssignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			((VarAssignContext)_localctx).varName = match(ID);
			setState(164);
			match(T__2);
			setState(165);
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
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((FunctionCallContext)_localctx).funcName = match(ID);
			setState(168);
			match(T__3);
			setState(169);
			argumentList();
			setState(170);
			match(T__4);
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
	}

	public final TopExprContext topExpr() throws RecognitionException {
		TopExprContext _localctx = new TopExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_topExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
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
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(CalculatorParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ReadContext extends ExprContext {
		public ReadContext(ExprContext ctx) { copyFrom(ctx); }
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
	}
	public static class ExprFunctionCallContext extends ExprContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExprFunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LnContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LnContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprParenContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParenContext(ExprContext ctx) { copyFrom(ctx); }
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
	}
	public static class CosContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CosContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SqrtContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SqrtContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DoubleContext extends ExprContext {
		public TerminalNode DOUBLE() { return getToken(CalculatorParser.DOUBLE, 0); }
		public DoubleContext(ExprContext ctx) { copyFrom(ctx); }
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
	}
	public static class NotContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
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
	}
	public static class VarReadContext extends ExprContext {
		public Token var;
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public VarReadContext(ExprContext ctx) { copyFrom(ctx); }
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
	}
	public static class PostCrementContext extends ExprContext {
		public ExprContext variable;
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PostCrementContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SinContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SinContext(ExprContext ctx) { copyFrom(ctx); }
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
	}
	public static class NegateContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExpContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class PreCrementContext extends ExprContext {
		public Token op;
		public ExprContext variable;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PreCrementContext(ExprContext ctx) { copyFrom(ctx); }
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
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(175);
				match(T__5);
				setState(176);
				((NegateContext)_localctx).ex = expr(26);
				}
				break;
			case 2:
				{
				_localctx = new ExprParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(T__3);
				setState(178);
				((ExprParenContext)_localctx).ex = expr(0);
				setState(179);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new ExprFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				functionCall();
				}
				break;
			case 4:
				{
				_localctx = new PreCrementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				((PreCrementContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
					((PreCrementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(183);
				((PreCrementContext)_localctx).variable = expr(22);
				}
				break;
			case 5:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(DOUBLE);
				}
				break;
			case 7:
				{
				_localctx = new VarReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				((VarReadContext)_localctx).var = match(ID);
				}
				break;
			case 8:
				{
				_localctx = new SinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(T__13);
				setState(188);
				((SinContext)_localctx).ex = expr(0);
				setState(189);
				match(T__4);
				}
				break;
			case 9:
				{
				_localctx = new CosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(T__14);
				setState(192);
				((CosContext)_localctx).ex = expr(0);
				setState(193);
				match(T__4);
				}
				break;
			case 10:
				{
				_localctx = new LnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(T__15);
				setState(196);
				((LnContext)_localctx).ex = expr(0);
				setState(197);
				match(T__4);
				}
				break;
			case 11:
				{
				_localctx = new ExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(T__16);
				setState(200);
				((ExpContext)_localctx).ex = expr(0);
				setState(201);
				match(T__4);
				}
				break;
			case 12:
				{
				_localctx = new SqrtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				match(T__17);
				setState(204);
				((SqrtContext)_localctx).ex = expr(0);
				setState(205);
				match(T__4);
				}
				break;
			case 13:
				{
				_localctx = new ReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(T__18);
				}
				break;
			case 14:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				match(T__27);
				{
				setState(209);
				((NotContext)_localctx).ex = expr(0);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(247);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExprContext(_parentctx, _parentState));
						((PowContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(213);
						((PowContext)_localctx).op = match(T__8);
						setState(214);
						((PowContext)_localctx).er = expr(22);
						}
						break;
					case 2:
						{
						_localctx = new DivTimesModContext(new ExprContext(_parentctx, _parentState));
						((DivTimesModContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(215);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(216);
						((DivTimesModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
							((DivTimesModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(217);
						((DivTimesModContext)_localctx).er = expr(21);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						((AddSubContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(218);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(219);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__12) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(220);
						((AddSubContext)_localctx).er = expr(20);
						}
						break;
					case 4:
						{
						_localctx = new EqualsContext(new ExprContext(_parentctx, _parentState));
						((EqualsContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(221);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(222);
						((EqualsContext)_localctx).op = match(T__19);
						setState(223);
						((EqualsContext)_localctx).er = expr(10);
						}
						break;
					case 5:
						{
						_localctx = new LessThanContext(new ExprContext(_parentctx, _parentState));
						((LessThanContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(225);
						((LessThanContext)_localctx).op = match(T__20);
						setState(226);
						((LessThanContext)_localctx).er = expr(9);
						}
						break;
					case 6:
						{
						_localctx = new GreaterThanContext(new ExprContext(_parentctx, _parentState));
						((GreaterThanContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(227);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(228);
						((GreaterThanContext)_localctx).op = match(T__21);
						setState(229);
						((GreaterThanContext)_localctx).er = expr(8);
						}
						break;
					case 7:
						{
						_localctx = new GreaterThanEqualsContext(new ExprContext(_parentctx, _parentState));
						((GreaterThanEqualsContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(231);
						((GreaterThanEqualsContext)_localctx).op = match(T__22);
						setState(232);
						((GreaterThanEqualsContext)_localctx).er = expr(7);
						}
						break;
					case 8:
						{
						_localctx = new LessThanEqualsContext(new ExprContext(_parentctx, _parentState));
						((LessThanEqualsContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(234);
						((LessThanEqualsContext)_localctx).op = match(T__23);
						setState(235);
						((LessThanEqualsContext)_localctx).er = expr(6);
						}
						break;
					case 9:
						{
						_localctx = new NotEqualsContext(new ExprContext(_parentctx, _parentState));
						((NotEqualsContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(237);
						((NotEqualsContext)_localctx).op = match(T__24);
						setState(238);
						((NotEqualsContext)_localctx).er = expr(5);
						}
						break;
					case 10:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						((AndContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(240);
						((AndContext)_localctx).op = match(T__25);
						setState(241);
						((AndContext)_localctx).er = expr(4);
						}
						break;
					case 11:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						((OrContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(243);
						((OrContext)_localctx).op = match(T__26);
						setState(244);
						((OrContext)_localctx).er = expr(3);
						}
						break;
					case 12:
						{
						_localctx = new PostCrementContext(new ExprContext(_parentctx, _parentState));
						((PostCrementContext)_localctx).variable = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(246);
						((PostCrementContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__7) ) {
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
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(IF);
			setState(253);
			match(T__3);
			setState(255); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(254);
				((IfStatementContext)_localctx).cond = expr(0);
				}
				}
				setState(257); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__27) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0) );
			setState(259);
			match(T__4);
			setState(260);
			((IfStatementContext)_localctx).action = topExpr();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				{
				setState(261);
				match(ELSE);
				}
				{
				setState(262);
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
	}
	public static class WhileLoopContext extends LoopsContext {
		public ExprContext ex;
		public TopExprContext action;
		public TerminalNode WHILE() { return getToken(CalculatorParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TopExprContext topExpr() {
			return getRuleContext(TopExprContext.class,0);
		}
		public WhileLoopContext(LoopsContext ctx) { copyFrom(ctx); }
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_loops);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(WHILE);
				setState(266);
				match(T__3);
				setState(267);
				((WhileLoopContext)_localctx).ex = expr(0);
				setState(268);
				match(T__4);
				setState(269);
				((WhileLoopContext)_localctx).action = topExpr();
				}
				break;
			case FOR:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(FOR);
				setState(272);
				match(T__3);
				setState(275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(273);
					((ForLoopContext)_localctx).ex1 = expr(0);
					}
					break;
				case 2:
					{
					setState(274);
					((ForLoopContext)_localctx).varAss = varAssign();
					}
					break;
				}
				setState(277);
				match(T__0);
				setState(278);
				((ForLoopContext)_localctx).ex2 = expr(0);
				setState(279);
				match(T__0);
				setState(282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(280);
					((ForLoopContext)_localctx).ex3 = expr(0);
					}
					break;
				case 2:
					{
					setState(281);
					((ForLoopContext)_localctx).varUpdate = varAssign();
					}
					break;
				}
				setState(284);
				match(T__4);
				setState(285);
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
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(DEFINE);
			setState(290);
			((FunctionDefContext)_localctx).funcName = match(ID);
			setState(291);
			match(T__3);
			setState(292);
			((FunctionDefContext)_localctx).idList = paramList();
			setState(293);
			match(T__4);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(294);
				match(WS);
				}
			}

			setState(297);
			match(T__28);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__27) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0)) {
				{
				setState(298);
				exprList();
				}
			}

			setState(301);
			match(T__29);
			setState(302);
			((FunctionDefContext)_localctx).returnValue = expr(0);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(303);
				match(T__0);
				}
			}

			setState(306);
			match(T__30);
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
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 20);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 23);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0137\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2\3"+
		"\2\7\2&\n\2\f\2\16\2)\13\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\7\2\63"+
		"\n\2\f\2\16\2\66\13\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\7\2?\n\2\f\2\16"+
		"\2B\13\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\2\7"+
		"\2Q\n\2\f\2\16\2T\13\2\3\2\3\2\7\2X\n\2\f\2\16\2[\13\2\3\2\3\2\7\2_\n"+
		"\2\f\2\16\2b\13\2\3\2\3\2\7\2f\n\2\f\2\16\2i\13\2\3\2\3\2\7\2m\n\2\f\2"+
		"\16\2p\13\2\3\2\3\2\7\2t\n\2\f\2\16\2w\13\2\3\2\5\2z\n\2\3\3\3\3\3\4\3"+
		"\4\3\4\7\4\u0081\n\4\f\4\16\4\u0084\13\4\3\5\7\5\u0087\n\5\f\5\16\5\u008a"+
		"\13\5\3\5\3\5\7\5\u008e\n\5\f\5\16\5\u0091\13\5\3\6\6\6\u0094\n\6\r\6"+
		"\16\6\u0095\3\6\3\6\7\6\u009a\n\6\f\6\16\6\u009d\13\6\3\6\5\6\u00a0\n"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00d5\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\7\f\u00fa\n\f\f\f\16\f\u00fd\13\f\3\r\3\r\3\r\6\r\u0102\n"+
		"\r\r\r\16\r\u0103\3\r\3\r\3\r\3\r\5\r\u010a\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u0116\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u011d\n\16\3\16\3\16\3\16\5\16\u0122\n\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u012a\n\17\3\17\3\17\5\17\u012e\n\17\3\17\3\17\3\17\5\17"+
		"\u0133\n\17\3\17\3\17\3\17\4\u0082\u008f\3\26\20\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\2\5\3\2\t\n\3\2\f\16\4\2\b\b\17\17\2\u015e\2!\3\2\2\2"+
		"\4{\3\2\2\2\6}\3\2\2\2\b\u0088\3\2\2\2\n\u0093\3\2\2\2\f\u00a1\3\2\2\2"+
		"\16\u00a3\3\2\2\2\20\u00a5\3\2\2\2\22\u00a9\3\2\2\2\24\u00ae\3\2\2\2\26"+
		"\u00d4\3\2\2\2\30\u00fe\3\2\2\2\32\u0121\3\2\2\2\34\u0123\3\2\2\2\36 "+
		"\5\f\7\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\'\3\2\2\2#!"+
		"\3\2\2\2$&\5\20\t\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(-\3\2\2"+
		"\2)\'\3\2\2\2*,\5\24\13\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\64"+
		"\3\2\2\2/-\3\2\2\2\60\61\7\3\2\2\61\63\5\24\13\2\62\60\3\2\2\2\63\66\3"+
		"\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65:\3\2\2\2\66\64\3\2\2\2\679\5\f\7"+
		"\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;@\3\2\2\2<:\3\2\2\2=?\5\32"+
		"\16\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AF\3\2\2\2B@\3\2\2\2CE\5"+
		"\30\r\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GL\3\2\2\2HF\3\2\2\2IK"+
		"\5\16\b\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MR\3\2\2\2NL\3\2\2\2"+
		"OQ\5\34\17\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SY\3\2\2\2TR\3\2\2"+
		"\2UV\7\3\2\2VX\5\16\b\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z`\3\2"+
		"\2\2[Y\3\2\2\2\\]\7\3\2\2]_\5\32\16\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`"+
		"a\3\2\2\2ag\3\2\2\2b`\3\2\2\2cd\7\3\2\2df\5\20\t\2ec\3\2\2\2fi\3\2\2\2"+
		"ge\3\2\2\2gh\3\2\2\2hn\3\2\2\2ig\3\2\2\2jk\7\3\2\2km\5\24\13\2lj\3\2\2"+
		"\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2ou\3\2\2\2pn\3\2\2\2qr\7\3\2\2rt\5\34"+
		"\17\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2\2xz\7"+
		"\3\2\2yx\3\2\2\2yz\3\2\2\2z\3\3\2\2\2{|\7)\2\2|\5\3\2\2\2}\u0082\5\4\3"+
		"\2~\177\7\4\2\2\177\u0081\5\4\3\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\7\3\2\2\2\u0084\u0082\3\2\2\2"+
		"\u0085\u0087\5\26\f\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008f\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008c\7\4\2\2\u008c\u008e\5\26\f\2\u008d\u008b\3\2\2\2\u008e\u0091\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\t\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0092\u0094\5\26\f\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2"+
		"\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u009b\3\2\2\2\u0097\u0098"+
		"\7\3\2\2\u0098\u009a\5\26\f\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2"+
		"\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u00a0\7\3\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\13\3\2\2\2\u00a1\u00a2\7(\2\2\u00a2\r\3\2\2\2\u00a3\u00a4\7#\2\2\u00a4"+
		"\17\3\2\2\2\u00a5\u00a6\7)\2\2\u00a6\u00a7\7\5\2\2\u00a7\u00a8\5\26\f"+
		"\2\u00a8\21\3\2\2\2\u00a9\u00aa\7)\2\2\u00aa\u00ab\7\6\2\2\u00ab\u00ac"+
		"\5\b\5\2\u00ac\u00ad\7\7\2\2\u00ad\23\3\2\2\2\u00ae\u00af\5\26\f\2\u00af"+
		"\25\3\2\2\2\u00b0\u00b1\b\f\1\2\u00b1\u00b2\7\b\2\2\u00b2\u00d5\5\26\f"+
		"\34\u00b3\u00b4\7\6\2\2\u00b4\u00b5\5\26\f\2\u00b5\u00b6\7\7\2\2\u00b6"+
		"\u00d5\3\2\2\2\u00b7\u00d5\5\22\n\2\u00b8\u00b9\t\2\2\2\u00b9\u00d5\5"+
		"\26\f\30\u00ba\u00d5\7*\2\2\u00bb\u00d5\7+\2\2\u00bc\u00d5\7)\2\2\u00bd"+
		"\u00be\7\20\2\2\u00be\u00bf\5\26\f\2\u00bf\u00c0\7\7\2\2\u00c0\u00d5\3"+
		"\2\2\2\u00c1\u00c2\7\21\2\2\u00c2\u00c3\5\26\f\2\u00c3\u00c4\7\7\2\2\u00c4"+
		"\u00d5\3\2\2\2\u00c5\u00c6\7\22\2\2\u00c6\u00c7\5\26\f\2\u00c7\u00c8\7"+
		"\7\2\2\u00c8\u00d5\3\2\2\2\u00c9\u00ca\7\23\2\2\u00ca\u00cb\5\26\f\2\u00cb"+
		"\u00cc\7\7\2\2\u00cc\u00d5\3\2\2\2\u00cd\u00ce\7\24\2\2\u00ce\u00cf\5"+
		"\26\f\2\u00cf\u00d0\7\7\2\2\u00d0\u00d5\3\2\2\2\u00d1\u00d5\7\25\2\2\u00d2"+
		"\u00d3\7\36\2\2\u00d3\u00d5\5\26\f\2\u00d4\u00b0\3\2\2\2\u00d4\u00b3\3"+
		"\2\2\2\u00d4\u00b7\3\2\2\2\u00d4\u00b8\3\2\2\2\u00d4\u00ba\3\2\2\2\u00d4"+
		"\u00bb\3\2\2\2\u00d4\u00bc\3\2\2\2\u00d4\u00bd\3\2\2\2\u00d4\u00c1\3\2"+
		"\2\2\u00d4\u00c5\3\2\2\2\u00d4\u00c9\3\2\2\2\u00d4\u00cd\3\2\2\2\u00d4"+
		"\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00fb\3\2\2\2\u00d6\u00d7\f\27"+
		"\2\2\u00d7\u00d8\7\13\2\2\u00d8\u00fa\5\26\f\30\u00d9\u00da\f\26\2\2\u00da"+
		"\u00db\t\3\2\2\u00db\u00fa\5\26\f\27\u00dc\u00dd\f\25\2\2\u00dd\u00de"+
		"\t\4\2\2\u00de\u00fa\5\26\f\26\u00df\u00e0\f\13\2\2\u00e0\u00e1\7\26\2"+
		"\2\u00e1\u00fa\5\26\f\f\u00e2\u00e3\f\n\2\2\u00e3\u00e4\7\27\2\2\u00e4"+
		"\u00fa\5\26\f\13\u00e5\u00e6\f\t\2\2\u00e6\u00e7\7\30\2\2\u00e7\u00fa"+
		"\5\26\f\n\u00e8\u00e9\f\b\2\2\u00e9\u00ea\7\31\2\2\u00ea\u00fa\5\26\f"+
		"\t\u00eb\u00ec\f\7\2\2\u00ec\u00ed\7\32\2\2\u00ed\u00fa\5\26\f\b\u00ee"+
		"\u00ef\f\6\2\2\u00ef\u00f0\7\33\2\2\u00f0\u00fa\5\26\f\7\u00f1\u00f2\f"+
		"\5\2\2\u00f2\u00f3\7\34\2\2\u00f3\u00fa\5\26\f\6\u00f4\u00f5\f\4\2\2\u00f5"+
		"\u00f6\7\35\2\2\u00f6\u00fa\5\26\f\5\u00f7\u00f8\f\31\2\2\u00f8\u00fa"+
		"\t\2\2\2\u00f9\u00d6\3\2\2\2\u00f9\u00d9\3\2\2\2\u00f9\u00dc\3\2\2\2\u00f9"+
		"\u00df\3\2\2\2\u00f9\u00e2\3\2\2\2\u00f9\u00e5\3\2\2\2\u00f9\u00e8\3\2"+
		"\2\2\u00f9\u00eb\3\2\2\2\u00f9\u00ee\3\2\2\2\u00f9\u00f1\3\2\2\2\u00f9"+
		"\u00f4\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\27\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff"+
		"\7$\2\2\u00ff\u0101\7\6\2\2\u0100\u0102\5\26\f\2\u0101\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0106\7\7\2\2\u0106\u0109\5\24\13\2\u0107\u0108\7%\2\2\u0108"+
		"\u010a\5\24\13\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\31\3\2"+
		"\2\2\u010b\u010c\7&\2\2\u010c\u010d\7\6\2\2\u010d\u010e\5\26\f\2\u010e"+
		"\u010f\7\7\2\2\u010f\u0110\5\24\13\2\u0110\u0122\3\2\2\2\u0111\u0112\7"+
		"\'\2\2\u0112\u0115\7\6\2\2\u0113\u0116\5\26\f\2\u0114\u0116\5\20\t\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7\3"+
		"\2\2\u0118\u0119\5\26\f\2\u0119\u011c\7\3\2\2\u011a\u011d\5\26\f\2\u011b"+
		"\u011d\5\20\t\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d\u011e\3"+
		"\2\2\2\u011e\u011f\7\7\2\2\u011f\u0120\5\24\13\2\u0120\u0122\3\2\2\2\u0121"+
		"\u010b\3\2\2\2\u0121\u0111\3\2\2\2\u0122\33\3\2\2\2\u0123\u0124\7\"\2"+
		"\2\u0124\u0125\7)\2\2\u0125\u0126\7\6\2\2\u0126\u0127\5\6\4\2\u0127\u0129"+
		"\7\7\2\2\u0128\u012a\7,\2\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012d\7\37\2\2\u012c\u012e\5\n\6\2\u012d\u012c\3"+
		"\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\7 \2\2\u0130"+
		"\u0132\5\26\f\2\u0131\u0133\7\3\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3"+
		"\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7!\2\2\u0135\35\3\2\2\2\"!\'-\64"+
		":@FLRY`gnuy\u0082\u0088\u008f\u0095\u009b\u009f\u00d4\u00f9\u00fb\u0103"+
		"\u0109\u0115\u011c\u0121\u0129\u012d\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}