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
		RULE_input = 0, RULE_paramList = 1, RULE_argumentList = 2, RULE_exprList = 3, 
		RULE_comment = 4, RULE_string = 5, RULE_varAssign = 6, RULE_functionCall = 7, 
		RULE_topExpr = 8, RULE_expr = 9, RULE_ifStatement = 10, RULE_loops = 11, 
		RULE_functionDef = 12;
	public static final String[] ruleNames = {
		"input", "paramList", "argumentList", "exprList", "comment", "string", 
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
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(26);
					comment();
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(32);
					varAssign();
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__27) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(38);
				topExpr();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(44);
					match(T__0);
					setState(45);
					topExpr();
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(51);
				comment();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHILE || _la==FOR) {
				{
				{
				setState(57);
				loops();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF) {
				{
				{
				setState(63);
				ifStatement();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(69);
				string();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFINE) {
				{
				{
				setState(75);
				functionDef();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81);
					match(T__0);
					setState(82);
					string();
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					match(T__0);
					setState(89);
					loops();
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(95);
					match(T__0);
					setState(96);
					varAssign();
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					match(T__0);
					setState(103);
					topExpr();
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(109);
					match(T__0);
					setState(110);
					functionDef();
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(116);
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

	public static class ParamListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CalculatorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CalculatorParser.ID, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_paramList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(120);
					match(T__1);
					setState(121);
					match(ID);
					}
					} 
				}
				setState(126);
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
		public List<TerminalNode> INT() { return getTokens(CalculatorParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CalculatorParser.INT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(CalculatorParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(CalculatorParser.DOUBLE, i);
		}
		public List<TerminalNode> ID() { return getTokens(CalculatorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CalculatorParser.ID, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_argumentList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(127);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(133);
					match(T__1);
					setState(134);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(139);
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
		enterRule(_localctx, 6, RULE_exprList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(140);
				expr(0);
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__27) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0) );
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					match(T__0);
					setState(146);
					expr(0);
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(152);
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
		enterRule(_localctx, 8, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
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
		enterRule(_localctx, 10, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
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
		enterRule(_localctx, 12, RULE_varAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			((VarAssignContext)_localctx).varName = match(ID);
			setState(160);
			match(T__2);
			setState(161);
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
		enterRule(_localctx, 14, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			((FunctionCallContext)_localctx).funcName = match(ID);
			setState(164);
			match(T__3);
			setState(165);
			argumentList();
			setState(166);
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
		enterRule(_localctx, 16, RULE_topExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(171);
				match(T__5);
				setState(172);
				((NegateContext)_localctx).ex = expr(26);
				}
				break;
			case 2:
				{
				_localctx = new ExprParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(T__3);
				setState(174);
				((ExprParenContext)_localctx).ex = expr(0);
				setState(175);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new ExprFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				functionCall();
				}
				break;
			case 4:
				{
				_localctx = new PreCrementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
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
				setState(179);
				((PreCrementContext)_localctx).variable = expr(22);
				}
				break;
			case 5:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(DOUBLE);
				}
				break;
			case 7:
				{
				_localctx = new VarReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				((VarReadContext)_localctx).var = match(ID);
				}
				break;
			case 8:
				{
				_localctx = new SinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(T__13);
				setState(184);
				((SinContext)_localctx).ex = expr(0);
				setState(185);
				match(T__4);
				}
				break;
			case 9:
				{
				_localctx = new CosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(T__14);
				setState(188);
				((CosContext)_localctx).ex = expr(0);
				setState(189);
				match(T__4);
				}
				break;
			case 10:
				{
				_localctx = new LnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(T__15);
				setState(192);
				((LnContext)_localctx).ex = expr(0);
				setState(193);
				match(T__4);
				}
				break;
			case 11:
				{
				_localctx = new ExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(T__16);
				setState(196);
				((ExpContext)_localctx).ex = expr(0);
				setState(197);
				match(T__4);
				}
				break;
			case 12:
				{
				_localctx = new SqrtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(T__17);
				setState(200);
				((SqrtContext)_localctx).ex = expr(0);
				setState(201);
				match(T__4);
				}
				break;
			case 13:
				{
				_localctx = new ReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				match(T__18);
				}
				break;
			case 14:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				match(T__27);
				{
				setState(205);
				((NotContext)_localctx).ex = expr(0);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExprContext(_parentctx, _parentState));
						((PowContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(208);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(209);
						((PowContext)_localctx).op = match(T__8);
						setState(210);
						((PowContext)_localctx).er = expr(22);
						}
						break;
					case 2:
						{
						_localctx = new DivTimesModContext(new ExprContext(_parentctx, _parentState));
						((DivTimesModContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(211);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(212);
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
						setState(213);
						((DivTimesModContext)_localctx).er = expr(21);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						((AddSubContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(214);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(215);
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
						setState(216);
						((AddSubContext)_localctx).er = expr(20);
						}
						break;
					case 4:
						{
						_localctx = new EqualsContext(new ExprContext(_parentctx, _parentState));
						((EqualsContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(217);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(218);
						((EqualsContext)_localctx).op = match(T__19);
						setState(219);
						((EqualsContext)_localctx).er = expr(10);
						}
						break;
					case 5:
						{
						_localctx = new LessThanContext(new ExprContext(_parentctx, _parentState));
						((LessThanContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(220);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(221);
						((LessThanContext)_localctx).op = match(T__20);
						setState(222);
						((LessThanContext)_localctx).er = expr(9);
						}
						break;
					case 6:
						{
						_localctx = new GreaterThanContext(new ExprContext(_parentctx, _parentState));
						((GreaterThanContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(223);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(224);
						((GreaterThanContext)_localctx).op = match(T__21);
						setState(225);
						((GreaterThanContext)_localctx).er = expr(8);
						}
						break;
					case 7:
						{
						_localctx = new GreaterThanEqualsContext(new ExprContext(_parentctx, _parentState));
						((GreaterThanEqualsContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(226);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(227);
						((GreaterThanEqualsContext)_localctx).op = match(T__22);
						setState(228);
						((GreaterThanEqualsContext)_localctx).er = expr(7);
						}
						break;
					case 8:
						{
						_localctx = new LessThanEqualsContext(new ExprContext(_parentctx, _parentState));
						((LessThanEqualsContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(229);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(230);
						((LessThanEqualsContext)_localctx).op = match(T__23);
						setState(231);
						((LessThanEqualsContext)_localctx).er = expr(6);
						}
						break;
					case 9:
						{
						_localctx = new NotEqualsContext(new ExprContext(_parentctx, _parentState));
						((NotEqualsContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(232);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(233);
						((NotEqualsContext)_localctx).op = match(T__24);
						setState(234);
						((NotEqualsContext)_localctx).er = expr(5);
						}
						break;
					case 10:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						((AndContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(235);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(236);
						((AndContext)_localctx).op = match(T__25);
						setState(237);
						((AndContext)_localctx).er = expr(4);
						}
						break;
					case 11:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						((OrContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(238);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(239);
						((OrContext)_localctx).op = match(T__26);
						setState(240);
						((OrContext)_localctx).er = expr(3);
						}
						break;
					case 12:
						{
						_localctx = new PostCrementContext(new ExprContext(_parentctx, _parentState));
						((PostCrementContext)_localctx).variable = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(242);
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
				setState(247);
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
		enterRule(_localctx, 20, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(IF);
			setState(249);
			match(T__3);
			setState(251); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(250);
				((IfStatementContext)_localctx).cond = expr(0);
				}
				}
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__27) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0) );
			setState(255);
			match(T__4);
			setState(256);
			((IfStatementContext)_localctx).action = topExpr();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				{
				setState(257);
				match(ELSE);
				}
				{
				setState(258);
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
		enterRule(_localctx, 22, RULE_loops);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(WHILE);
				setState(262);
				match(T__3);
				setState(263);
				((WhileLoopContext)_localctx).ex = expr(0);
				setState(264);
				match(T__4);
				setState(265);
				((WhileLoopContext)_localctx).action = topExpr();
				}
				break;
			case FOR:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(FOR);
				setState(268);
				match(T__3);
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(269);
					((ForLoopContext)_localctx).ex1 = expr(0);
					}
					break;
				case 2:
					{
					setState(270);
					((ForLoopContext)_localctx).varAss = varAssign();
					}
					break;
				}
				setState(273);
				match(T__0);
				setState(274);
				((ForLoopContext)_localctx).ex2 = expr(0);
				setState(275);
				match(T__0);
				setState(278);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(276);
					((ForLoopContext)_localctx).ex3 = expr(0);
					}
					break;
				case 2:
					{
					setState(277);
					((ForLoopContext)_localctx).varUpdate = varAssign();
					}
					break;
				}
				setState(280);
				match(T__4);
				setState(281);
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
		enterRule(_localctx, 24, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(DEFINE);
			setState(286);
			((FunctionDefContext)_localctx).funcName = match(ID);
			setState(287);
			match(T__3);
			setState(288);
			((FunctionDefContext)_localctx).idList = paramList();
			setState(289);
			match(T__4);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(290);
				match(WS);
				}
			}

			setState(293);
			match(T__28);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__27) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0)) {
				{
				setState(294);
				exprList();
				}
			}

			setState(297);
			match(T__29);
			setState(298);
			((FunctionDefContext)_localctx).returnValue = expr(0);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(299);
				match(T__0);
				}
			}

			setState(302);
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
		case 9:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0133\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\7\2$\n"+
		"\2\f\2\16\2\'\13\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\7\2\61\n\2\f\2"+
		"\16\2\64\13\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\7\2=\n\2\f\2\16\2@\13"+
		"\2\3\2\7\2C\n\2\f\2\16\2F\13\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\2\7\2O\n"+
		"\2\f\2\16\2R\13\2\3\2\3\2\7\2V\n\2\f\2\16\2Y\13\2\3\2\3\2\7\2]\n\2\f\2"+
		"\16\2`\13\2\3\2\3\2\7\2d\n\2\f\2\16\2g\13\2\3\2\3\2\7\2k\n\2\f\2\16\2"+
		"n\13\2\3\2\3\2\7\2r\n\2\f\2\16\2u\13\2\3\2\5\2x\n\2\3\3\3\3\3\3\7\3}\n"+
		"\3\f\3\16\3\u0080\13\3\3\4\7\4\u0083\n\4\f\4\16\4\u0086\13\4\3\4\3\4\7"+
		"\4\u008a\n\4\f\4\16\4\u008d\13\4\3\5\6\5\u0090\n\5\r\5\16\5\u0091\3\5"+
		"\3\5\7\5\u0096\n\5\f\5\16\5\u0099\13\5\3\5\5\5\u009c\n\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00d1\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u00f6\n\13\f\13\16\13\u00f9\13\13\3\f\3\f\3\f\6\f\u00fe\n\f\r\f\16\f"+
		"\u00ff\3\f\3\f\3\f\3\f\5\f\u0106\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u0112\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u0119\n\r\3\r\3\r\3\r\5\r"+
		"\u011e\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0126\n\16\3\16\3\16\5\16"+
		"\u012a\n\16\3\16\3\16\3\16\5\16\u012f\n\16\3\16\3\16\3\16\4~\u008b\3\24"+
		"\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\6\3\2)+\3\2\t\n\3\2\f\16\4\2\b"+
		"\b\17\17\2\u015b\2\37\3\2\2\2\4y\3\2\2\2\6\u0084\3\2\2\2\b\u008f\3\2\2"+
		"\2\n\u009d\3\2\2\2\f\u009f\3\2\2\2\16\u00a1\3\2\2\2\20\u00a5\3\2\2\2\22"+
		"\u00aa\3\2\2\2\24\u00d0\3\2\2\2\26\u00fa\3\2\2\2\30\u011d\3\2\2\2\32\u011f"+
		"\3\2\2\2\34\36\5\n\6\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2"+
		"\2\2 %\3\2\2\2!\37\3\2\2\2\"$\5\16\b\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2"+
		"%&\3\2\2\2&+\3\2\2\2\'%\3\2\2\2(*\5\22\n\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2"+
		"\2+,\3\2\2\2,\62\3\2\2\2-+\3\2\2\2./\7\3\2\2/\61\5\22\n\2\60.\3\2\2\2"+
		"\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\638\3\2\2\2\64\62\3\2\2\2\65"+
		"\67\5\n\6\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29>\3\2\2\2"+
		":8\3\2\2\2;=\5\30\r\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?D\3\2\2"+
		"\2@>\3\2\2\2AC\5\26\f\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EJ\3\2"+
		"\2\2FD\3\2\2\2GI\5\f\7\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KP\3\2"+
		"\2\2LJ\3\2\2\2MO\5\32\16\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QW\3"+
		"\2\2\2RP\3\2\2\2ST\7\3\2\2TV\5\f\7\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3"+
		"\2\2\2X^\3\2\2\2YW\3\2\2\2Z[\7\3\2\2[]\5\30\r\2\\Z\3\2\2\2]`\3\2\2\2^"+
		"\\\3\2\2\2^_\3\2\2\2_e\3\2\2\2`^\3\2\2\2ab\7\3\2\2bd\5\16\b\2ca\3\2\2"+
		"\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fl\3\2\2\2ge\3\2\2\2hi\7\3\2\2ik\5\22"+
		"\n\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2ms\3\2\2\2nl\3\2\2\2op\7\3"+
		"\2\2pr\5\32\16\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2us\3"+
		"\2\2\2vx\7\3\2\2wv\3\2\2\2wx\3\2\2\2x\3\3\2\2\2y~\7)\2\2z{\7\4\2\2{}\7"+
		")\2\2|z\3\2\2\2}\u0080\3\2\2\2~\177\3\2\2\2~|\3\2\2\2\177\5\3\2\2\2\u0080"+
		"~\3\2\2\2\u0081\u0083\t\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2"+
		"\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u008b\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0087\u0088\7\4\2\2\u0088\u008a\t\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\7\3\2\2\2"+
		"\u008d\u008b\3\2\2\2\u008e\u0090\5\24\13\2\u008f\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0097\3\2\2\2\u0093"+
		"\u0094\7\3\2\2\u0094\u0096\5\24\13\2\u0095\u0093\3\2\2\2\u0096\u0099\3"+
		"\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009c\7\3\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\t\3\2\2\2\u009d\u009e\7(\2\2\u009e\13\3\2\2\2\u009f\u00a0\7"+
		"#\2\2\u00a0\r\3\2\2\2\u00a1\u00a2\7)\2\2\u00a2\u00a3\7\5\2\2\u00a3\u00a4"+
		"\5\24\13\2\u00a4\17\3\2\2\2\u00a5\u00a6\7)\2\2\u00a6\u00a7\7\6\2\2\u00a7"+
		"\u00a8\5\6\4\2\u00a8\u00a9\7\7\2\2\u00a9\21\3\2\2\2\u00aa\u00ab\5\24\13"+
		"\2\u00ab\23\3\2\2\2\u00ac\u00ad\b\13\1\2\u00ad\u00ae\7\b\2\2\u00ae\u00d1"+
		"\5\24\13\34\u00af\u00b0\7\6\2\2\u00b0\u00b1\5\24\13\2\u00b1\u00b2\7\7"+
		"\2\2\u00b2\u00d1\3\2\2\2\u00b3\u00d1\5\20\t\2\u00b4\u00b5\t\3\2\2\u00b5"+
		"\u00d1\5\24\13\30\u00b6\u00d1\7*\2\2\u00b7\u00d1\7+\2\2\u00b8\u00d1\7"+
		")\2\2\u00b9\u00ba\7\20\2\2\u00ba\u00bb\5\24\13\2\u00bb\u00bc\7\7\2\2\u00bc"+
		"\u00d1\3\2\2\2\u00bd\u00be\7\21\2\2\u00be\u00bf\5\24\13\2\u00bf\u00c0"+
		"\7\7\2\2\u00c0\u00d1\3\2\2\2\u00c1\u00c2\7\22\2\2\u00c2\u00c3\5\24\13"+
		"\2\u00c3\u00c4\7\7\2\2\u00c4\u00d1\3\2\2\2\u00c5\u00c6\7\23\2\2\u00c6"+
		"\u00c7\5\24\13\2\u00c7\u00c8\7\7\2\2\u00c8\u00d1\3\2\2\2\u00c9\u00ca\7"+
		"\24\2\2\u00ca\u00cb\5\24\13\2\u00cb\u00cc\7\7\2\2\u00cc\u00d1\3\2\2\2"+
		"\u00cd\u00d1\7\25\2\2\u00ce\u00cf\7\36\2\2\u00cf\u00d1\5\24\13\2\u00d0"+
		"\u00ac\3\2\2\2\u00d0\u00af\3\2\2\2\u00d0\u00b3\3\2\2\2\u00d0\u00b4\3\2"+
		"\2\2\u00d0\u00b6\3\2\2\2\u00d0\u00b7\3\2\2\2\u00d0\u00b8\3\2\2\2\u00d0"+
		"\u00b9\3\2\2\2\u00d0\u00bd\3\2\2\2\u00d0\u00c1\3\2\2\2\u00d0\u00c5\3\2"+
		"\2\2\u00d0\u00c9\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00f7\3\2\2\2\u00d2\u00d3\f\27\2\2\u00d3\u00d4\7\13\2\2\u00d4\u00f6\5"+
		"\24\13\30\u00d5\u00d6\f\26\2\2\u00d6\u00d7\t\4\2\2\u00d7\u00f6\5\24\13"+
		"\27\u00d8\u00d9\f\25\2\2\u00d9\u00da\t\5\2\2\u00da\u00f6\5\24\13\26\u00db"+
		"\u00dc\f\13\2\2\u00dc\u00dd\7\26\2\2\u00dd\u00f6\5\24\13\f\u00de\u00df"+
		"\f\n\2\2\u00df\u00e0\7\27\2\2\u00e0\u00f6\5\24\13\13\u00e1\u00e2\f\t\2"+
		"\2\u00e2\u00e3\7\30\2\2\u00e3\u00f6\5\24\13\n\u00e4\u00e5\f\b\2\2\u00e5"+
		"\u00e6\7\31\2\2\u00e6\u00f6\5\24\13\t\u00e7\u00e8\f\7\2\2\u00e8\u00e9"+
		"\7\32\2\2\u00e9\u00f6\5\24\13\b\u00ea\u00eb\f\6\2\2\u00eb\u00ec\7\33\2"+
		"\2\u00ec\u00f6\5\24\13\7\u00ed\u00ee\f\5\2\2\u00ee\u00ef\7\34\2\2\u00ef"+
		"\u00f6\5\24\13\6\u00f0\u00f1\f\4\2\2\u00f1\u00f2\7\35\2\2\u00f2\u00f6"+
		"\5\24\13\5\u00f3\u00f4\f\31\2\2\u00f4\u00f6\t\3\2\2\u00f5\u00d2\3\2\2"+
		"\2\u00f5\u00d5\3\2\2\2\u00f5\u00d8\3\2\2\2\u00f5\u00db\3\2\2\2\u00f5\u00de"+
		"\3\2\2\2\u00f5\u00e1\3\2\2\2\u00f5\u00e4\3\2\2\2\u00f5\u00e7\3\2\2\2\u00f5"+
		"\u00ea\3\2\2\2\u00f5\u00ed\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\25\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7$\2\2\u00fb\u00fd\7\6\2\2"+
		"\u00fc\u00fe\5\24\13\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\7\2\2\u0102"+
		"\u0105\5\22\n\2\u0103\u0104\7%\2\2\u0104\u0106\5\22\n\2\u0105\u0103\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\27\3\2\2\2\u0107\u0108\7&\2\2\u0108\u0109"+
		"\7\6\2\2\u0109\u010a\5\24\13\2\u010a\u010b\7\7\2\2\u010b\u010c\5\22\n"+
		"\2\u010c\u011e\3\2\2\2\u010d\u010e\7\'\2\2\u010e\u0111\7\6\2\2\u010f\u0112"+
		"\5\24\13\2\u0110\u0112\5\16\b\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2"+
		"\2\u0112\u0113\3\2\2\2\u0113\u0114\7\3\2\2\u0114\u0115\5\24\13\2\u0115"+
		"\u0118\7\3\2\2\u0116\u0119\5\24\13\2\u0117\u0119\5\16\b\2\u0118\u0116"+
		"\3\2\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7\7\2\2\u011b"+
		"\u011c\5\22\n\2\u011c\u011e\3\2\2\2\u011d\u0107\3\2\2\2\u011d\u010d\3"+
		"\2\2\2\u011e\31\3\2\2\2\u011f\u0120\7\"\2\2\u0120\u0121\7)\2\2\u0121\u0122"+
		"\7\6\2\2\u0122\u0123\5\4\3\2\u0123\u0125\7\7\2\2\u0124\u0126\7,\2\2\u0125"+
		"\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\7\37"+
		"\2\2\u0128\u012a\5\b\5\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012c\7 \2\2\u012c\u012e\5\24\13\2\u012d\u012f\7"+
		"\3\2\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0131\7!\2\2\u0131\33\3\2\2\2\"\37%+\628>DJPW^elsw~\u0084\u008b\u0091"+
		"\u0097\u009b\u00d0\u00f5\u00f7\u00ff\u0105\u0111\u0118\u011d\u0125\u0129"+
		"\u012e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}