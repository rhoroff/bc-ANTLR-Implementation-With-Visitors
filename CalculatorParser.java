// Generated from Calculator.g4 by ANTLR 4.7.2

    import java.util.Hashtable;
    import java.lang.Math;
    import java.util.*;
    import java.io.Console;

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
		DEFINE=32, STRING=33, IF=34, ELSE=35, WHILE=36, FOR=37, COMMENT=38, ID=39, 
		INT=40, DOUBLE=41, WS=42;
	public static final int
		RULE_input = 0, RULE_comment = 1, RULE_string = 2, RULE_varAssign = 3, 
		RULE_functionCall = 4, RULE_topExpr = 5, RULE_expr = 6, RULE_ifStatement = 7, 
		RULE_loops = 8, RULE_functionDef = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"input", "comment", "string", "varAssign", "functionCall", "topExpr", 
			"expr", "ifStatement", "loops", "functionDef"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "','", "')'", "'-'", "'++'", "'--'", "'^'", 
			"'/'", "'*'", "'%'", "'+'", "'s('", "'c('", "'l('", "'e('", "'sqrt('", 
			"'read()'", "'=='", "'<'", "'>'", "'>='", "'<='", "'!='", "'&&'", "'||'", 
			"'!'", "') {'", "'return '", "'}'", "'define'", null, "'if'", "'else'", 
			"'while'", "'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "DEFINE", "STRING", "IF", 
			"ELSE", "WHILE", "FOR", "COMMENT", "ID", "INT", "DOUBLE", "WS"
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
			setState(23);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(20);
					comment();
					}
					} 
				}
				setState(25);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(26);
					varAssign();
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__27) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(32);
				topExpr();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(38);
					match(T__0);
					setState(39);
					topExpr();
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(45);
				comment();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHILE || _la==FOR) {
				{
				{
				setState(51);
				loops();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF) {
				{
				{
				setState(57);
				ifStatement();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(63);
				string();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFINE) {
				{
				{
				setState(69);
				functionDef();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(75);
					match(T__0);
					setState(76);
					string();
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					match(T__0);
					setState(83);
					loops();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(89);
					match(T__0);
					setState(90);
					varAssign();
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(96);
					match(T__0);
					setState(97);
					topExpr();
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					match(T__0);
					setState(104);
					functionDef();
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(110);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
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
		enterRule(_localctx, 4, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
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
		enterRule(_localctx, 6, RULE_varAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			((VarAssignContext)_localctx).varName = match(ID);
			setState(118);
			match(T__1);
			setState(119);
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
		public List<TerminalNode> ID() { return getTokens(CalculatorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CalculatorParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(CalculatorParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CalculatorParser.INT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(CalculatorParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(CalculatorParser.DOUBLE, i);
		}
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
		enterRule(_localctx, 8, RULE_functionCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(ID);
			setState(122);
			match(T__2);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(123);
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
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(129);
					match(T__3);
					setState(130);
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
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(136);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitTopExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopExprContext topExpr() throws RecognitionException {
		TopExprContext _localctx = new TopExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_topExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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
	public static class VarAssignmentContext extends ExprContext {
		public VarAssignContext varAssign() {
			return getRuleContext(VarAssignContext.class,0);
		}
		public VarAssignmentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitVarAssignment(this);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(141);
				match(T__5);
				setState(142);
				((NegateContext)_localctx).ex = expr(27);
				}
				break;
			case 2:
				{
				_localctx = new ExprParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				match(T__2);
				setState(144);
				((ExprParenContext)_localctx).ex = expr(0);
				setState(145);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new ExprFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				functionCall();
				}
				break;
			case 4:
				{
				_localctx = new PreCrementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
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
				setState(149);
				((PreCrementContext)_localctx).variable = expr(23);
				}
				break;
			case 5:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(DOUBLE);
				}
				break;
			case 7:
				{
				_localctx = new VarReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				((VarReadContext)_localctx).var = match(ID);
				}
				break;
			case 8:
				{
				_localctx = new SinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(T__13);
				setState(154);
				((SinContext)_localctx).ex = expr(0);
				setState(155);
				match(T__4);
				}
				break;
			case 9:
				{
				_localctx = new CosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(T__14);
				setState(158);
				((CosContext)_localctx).ex = expr(0);
				setState(159);
				match(T__4);
				}
				break;
			case 10:
				{
				_localctx = new LnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(T__15);
				setState(162);
				((LnContext)_localctx).ex = expr(0);
				setState(163);
				match(T__4);
				}
				break;
			case 11:
				{
				_localctx = new ExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(T__16);
				setState(166);
				((ExpContext)_localctx).ex = expr(0);
				setState(167);
				match(T__4);
				}
				break;
			case 12:
				{
				_localctx = new SqrtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(T__17);
				setState(170);
				((SqrtContext)_localctx).ex = expr(0);
				setState(171);
				match(T__4);
				}
				break;
			case 13:
				{
				_localctx = new ReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(T__18);
				}
				break;
			case 14:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(T__27);
				{
				setState(175);
				((NotContext)_localctx).ex = expr(0);
				}
				}
				break;
			case 15:
				{
				_localctx = new VarAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				varAssign();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(214);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExprContext(_parentctx, _parentState));
						((PowContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(180);
						((PowContext)_localctx).op = match(T__8);
						setState(181);
						((PowContext)_localctx).er = expr(23);
						}
						break;
					case 2:
						{
						_localctx = new DivTimesModContext(new ExprContext(_parentctx, _parentState));
						((DivTimesModContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(183);
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
						setState(184);
						((DivTimesModContext)_localctx).er = expr(22);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						((AddSubContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(186);
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
						setState(187);
						((AddSubContext)_localctx).er = expr(21);
						}
						break;
					case 4:
						{
						_localctx = new EqualsContext(new ExprContext(_parentctx, _parentState));
						((EqualsContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(189);
						((EqualsContext)_localctx).op = match(T__19);
						setState(190);
						((EqualsContext)_localctx).er = expr(11);
						}
						break;
					case 5:
						{
						_localctx = new LessThanContext(new ExprContext(_parentctx, _parentState));
						((LessThanContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(192);
						((LessThanContext)_localctx).op = match(T__20);
						setState(193);
						((LessThanContext)_localctx).er = expr(10);
						}
						break;
					case 6:
						{
						_localctx = new GreaterThanContext(new ExprContext(_parentctx, _parentState));
						((GreaterThanContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(195);
						((GreaterThanContext)_localctx).op = match(T__21);
						setState(196);
						((GreaterThanContext)_localctx).er = expr(9);
						}
						break;
					case 7:
						{
						_localctx = new GreaterThanEqualsContext(new ExprContext(_parentctx, _parentState));
						((GreaterThanEqualsContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(197);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(198);
						((GreaterThanEqualsContext)_localctx).op = match(T__22);
						setState(199);
						((GreaterThanEqualsContext)_localctx).er = expr(8);
						}
						break;
					case 8:
						{
						_localctx = new LessThanEqualsContext(new ExprContext(_parentctx, _parentState));
						((LessThanEqualsContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(200);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(201);
						((LessThanEqualsContext)_localctx).op = match(T__23);
						setState(202);
						((LessThanEqualsContext)_localctx).er = expr(7);
						}
						break;
					case 9:
						{
						_localctx = new NotEqualsContext(new ExprContext(_parentctx, _parentState));
						((NotEqualsContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(203);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(204);
						((NotEqualsContext)_localctx).op = match(T__24);
						setState(205);
						((NotEqualsContext)_localctx).er = expr(6);
						}
						break;
					case 10:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						((AndContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(206);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(207);
						((AndContext)_localctx).op = match(T__25);
						setState(208);
						((AndContext)_localctx).er = expr(5);
						}
						break;
					case 11:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						((OrContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(209);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(210);
						((OrContext)_localctx).op = match(T__26);
						setState(211);
						((OrContext)_localctx).er = expr(4);
						}
						break;
					case 12:
						{
						_localctx = new PostCrementContext(new ExprContext(_parentctx, _parentState));
						((PostCrementContext)_localctx).variable = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(213);
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
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 14, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(IF);
			setState(220);
			match(T__2);
			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				((IfStatementContext)_localctx).cond = expr(0);
				}
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__27) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0) );
			setState(226);
			match(T__4);
			setState(227);
			((IfStatementContext)_localctx).action = topExpr();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				{
				setState(228);
				match(ELSE);
				}
				{
				setState(229);
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
		public ExprContext ex2;
		public ExprContext ex3;
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
		public TerminalNode WHILE() { return getToken(CalculatorParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TopExprContext topExpr() {
			return getRuleContext(TopExprContext.class,0);
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
		enterRule(_localctx, 16, RULE_loops);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(WHILE);
				setState(233);
				match(T__2);
				setState(234);
				((WhileLoopContext)_localctx).ex = expr(0);
				setState(235);
				match(T__4);
				setState(236);
				((WhileLoopContext)_localctx).action = topExpr();
				}
				break;
			case FOR:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(FOR);
				setState(239);
				match(T__2);
				setState(240);
				((ForLoopContext)_localctx).ex1 = expr(0);
				setState(241);
				match(T__0);
				setState(242);
				((ForLoopContext)_localctx).ex2 = expr(0);
				setState(243);
				match(T__0);
				setState(244);
				((ForLoopContext)_localctx).ex3 = expr(0);
				setState(245);
				match(T__4);
				setState(246);
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
		public ExprContext returnValue;
		public TerminalNode DEFINE() { return getToken(CalculatorParser.DEFINE, 0); }
		public List<TerminalNode> ID() { return getTokens(CalculatorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CalculatorParser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 18, RULE_functionDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(DEFINE);
			setState(251);
			match(ID);
			setState(252);
			match(T__2);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(253);
				match(ID);
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(259);
					match(T__3);
					setState(260);
					match(ID);
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(266);
			match(T__28);
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(267);
					expr(0);
					}
					} 
				}
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(273);
				match(T__0);
				setState(274);
				expr(0);
				}
				break;
			}
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(277);
				match(T__0);
				setState(278);
				expr(0);
				setState(279);
				match(T__0);
				}
			}

			setState(283);
			match(T__29);
			setState(284);
			((FunctionDefContext)_localctx).returnValue = expr(0);
			setState(285);
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
		case 6:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0122\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2"+
		"\7\2$\n\2\f\2\16\2\'\13\2\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\7\2\61\n"+
		"\2\f\2\16\2\64\13\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\7\2=\n\2\f\2\16"+
		"\2@\13\2\3\2\7\2C\n\2\f\2\16\2F\13\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\2\3"+
		"\2\7\2P\n\2\f\2\16\2S\13\2\3\2\3\2\7\2W\n\2\f\2\16\2Z\13\2\3\2\3\2\7\2"+
		"^\n\2\f\2\16\2a\13\2\3\2\3\2\7\2e\n\2\f\2\16\2h\13\2\3\2\3\2\7\2l\n\2"+
		"\f\2\16\2o\13\2\3\2\5\2r\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\7\6\177\n\6\f\6\16\6\u0082\13\6\3\6\3\6\7\6\u0086\n\6\f\6\16\6\u0089"+
		"\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b4\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00d9\n\b\f\b\16\b\u00dc"+
		"\13\b\3\t\3\t\3\t\6\t\u00e1\n\t\r\t\16\t\u00e2\3\t\3\t\3\t\3\t\5\t\u00e9"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00fb\n\n\3\13\3\13\3\13\3\13\7\13\u0101\n\13\f\13\16\13\u0104\13\13"+
		"\3\13\3\13\7\13\u0108\n\13\f\13\16\13\u010b\13\13\3\13\3\13\7\13\u010f"+
		"\n\13\f\13\16\13\u0112\13\13\3\13\3\13\5\13\u0116\n\13\3\13\3\13\3\13"+
		"\3\13\5\13\u011c\n\13\3\13\3\13\3\13\3\13\3\13\5\u0087\u0109\u0110\3\16"+
		"\f\2\4\6\b\n\f\16\20\22\24\2\6\3\2)+\3\2\t\n\3\2\f\16\4\2\b\b\17\17\2"+
		"\u014a\2\31\3\2\2\2\4s\3\2\2\2\6u\3\2\2\2\bw\3\2\2\2\n{\3\2\2\2\f\u008c"+
		"\3\2\2\2\16\u00b3\3\2\2\2\20\u00dd\3\2\2\2\22\u00fa\3\2\2\2\24\u00fc\3"+
		"\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3"+
		"\2\2\2\32\37\3\2\2\2\33\31\3\2\2\2\34\36\5\b\5\2\35\34\3\2\2\2\36!\3\2"+
		"\2\2\37\35\3\2\2\2\37 \3\2\2\2 %\3\2\2\2!\37\3\2\2\2\"$\5\f\7\2#\"\3\2"+
		"\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&,\3\2\2\2\'%\3\2\2\2()\7\3\2\2)+\5"+
		"\f\7\2*(\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\62\3\2\2\2.,\3\2\2\2/"+
		"\61\5\4\3\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\638"+
		"\3\2\2\2\64\62\3\2\2\2\65\67\5\22\n\2\66\65\3\2\2\2\67:\3\2\2\28\66\3"+
		"\2\2\289\3\2\2\29>\3\2\2\2:8\3\2\2\2;=\5\20\t\2<;\3\2\2\2=@\3\2\2\2><"+
		"\3\2\2\2>?\3\2\2\2?D\3\2\2\2@>\3\2\2\2AC\5\6\4\2BA\3\2\2\2CF\3\2\2\2D"+
		"B\3\2\2\2DE\3\2\2\2EJ\3\2\2\2FD\3\2\2\2GI\5\24\13\2HG\3\2\2\2IL\3\2\2"+
		"\2JH\3\2\2\2JK\3\2\2\2KQ\3\2\2\2LJ\3\2\2\2MN\7\3\2\2NP\5\6\4\2OM\3\2\2"+
		"\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RX\3\2\2\2SQ\3\2\2\2TU\7\3\2\2UW\5\22"+
		"\n\2VT\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y_\3\2\2\2ZX\3\2\2\2[\\\7"+
		"\3\2\2\\^\5\b\5\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`f\3\2\2\2a_"+
		"\3\2\2\2bc\7\3\2\2ce\5\f\7\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g"+
		"m\3\2\2\2hf\3\2\2\2ij\7\3\2\2jl\5\24\13\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2"+
		"\2mn\3\2\2\2nq\3\2\2\2om\3\2\2\2pr\7\3\2\2qp\3\2\2\2qr\3\2\2\2r\3\3\2"+
		"\2\2st\7(\2\2t\5\3\2\2\2uv\7#\2\2v\7\3\2\2\2wx\7)\2\2xy\7\4\2\2yz\5\16"+
		"\b\2z\t\3\2\2\2{|\7)\2\2|\u0080\7\5\2\2}\177\t\2\2\2~}\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0087\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0083\u0084\7\6\2\2\u0084\u0086\t\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0086\u0089\3\2\2\2\u0087\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\7\2\2\u008b\13\3\2\2"+
		"\2\u008c\u008d\5\16\b\2\u008d\r\3\2\2\2\u008e\u008f\b\b\1\2\u008f\u0090"+
		"\7\b\2\2\u0090\u00b4\5\16\b\35\u0091\u0092\7\5\2\2\u0092\u0093\5\16\b"+
		"\2\u0093\u0094\7\7\2\2\u0094\u00b4\3\2\2\2\u0095\u00b4\5\n\6\2\u0096\u0097"+
		"\t\3\2\2\u0097\u00b4\5\16\b\31\u0098\u00b4\7*\2\2\u0099\u00b4\7+\2\2\u009a"+
		"\u00b4\7)\2\2\u009b\u009c\7\20\2\2\u009c\u009d\5\16\b\2\u009d\u009e\7"+
		"\7\2\2\u009e\u00b4\3\2\2\2\u009f\u00a0\7\21\2\2\u00a0\u00a1\5\16\b\2\u00a1"+
		"\u00a2\7\7\2\2\u00a2\u00b4\3\2\2\2\u00a3\u00a4\7\22\2\2\u00a4\u00a5\5"+
		"\16\b\2\u00a5\u00a6\7\7\2\2\u00a6\u00b4\3\2\2\2\u00a7\u00a8\7\23\2\2\u00a8"+
		"\u00a9\5\16\b\2\u00a9\u00aa\7\7\2\2\u00aa\u00b4\3\2\2\2\u00ab\u00ac\7"+
		"\24\2\2\u00ac\u00ad\5\16\b\2\u00ad\u00ae\7\7\2\2\u00ae\u00b4\3\2\2\2\u00af"+
		"\u00b4\7\25\2\2\u00b0\u00b1\7\36\2\2\u00b1\u00b4\5\16\b\2\u00b2\u00b4"+
		"\5\b\5\2\u00b3\u008e\3\2\2\2\u00b3\u0091\3\2\2\2\u00b3\u0095\3\2\2\2\u00b3"+
		"\u0096\3\2\2\2\u00b3\u0098\3\2\2\2\u00b3\u0099\3\2\2\2\u00b3\u009a\3\2"+
		"\2\2\u00b3\u009b\3\2\2\2\u00b3\u009f\3\2\2\2\u00b3\u00a3\3\2\2\2\u00b3"+
		"\u00a7\3\2\2\2\u00b3\u00ab\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b0\3\2"+
		"\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00da\3\2\2\2\u00b5\u00b6\f\30\2\2\u00b6"+
		"\u00b7\7\13\2\2\u00b7\u00d9\5\16\b\31\u00b8\u00b9\f\27\2\2\u00b9\u00ba"+
		"\t\4\2\2\u00ba\u00d9\5\16\b\30\u00bb\u00bc\f\26\2\2\u00bc\u00bd\t\5\2"+
		"\2\u00bd\u00d9\5\16\b\27\u00be\u00bf\f\f\2\2\u00bf\u00c0\7\26\2\2\u00c0"+
		"\u00d9\5\16\b\r\u00c1\u00c2\f\13\2\2\u00c2\u00c3\7\27\2\2\u00c3\u00d9"+
		"\5\16\b\f\u00c4\u00c5\f\n\2\2\u00c5\u00c6\7\30\2\2\u00c6\u00d9\5\16\b"+
		"\13\u00c7\u00c8\f\t\2\2\u00c8\u00c9\7\31\2\2\u00c9\u00d9\5\16\b\n\u00ca"+
		"\u00cb\f\b\2\2\u00cb\u00cc\7\32\2\2\u00cc\u00d9\5\16\b\t\u00cd\u00ce\f"+
		"\7\2\2\u00ce\u00cf\7\33\2\2\u00cf\u00d9\5\16\b\b\u00d0\u00d1\f\6\2\2\u00d1"+
		"\u00d2\7\34\2\2\u00d2\u00d9\5\16\b\7\u00d3\u00d4\f\5\2\2\u00d4\u00d5\7"+
		"\35\2\2\u00d5\u00d9\5\16\b\6\u00d6\u00d7\f\32\2\2\u00d7\u00d9\t\3\2\2"+
		"\u00d8\u00b5\3\2\2\2\u00d8\u00b8\3\2\2\2\u00d8\u00bb\3\2\2\2\u00d8\u00be"+
		"\3\2\2\2\u00d8\u00c1\3\2\2\2\u00d8\u00c4\3\2\2\2\u00d8\u00c7\3\2\2\2\u00d8"+
		"\u00ca\3\2\2\2\u00d8\u00cd\3\2\2\2\u00d8\u00d0\3\2\2\2\u00d8\u00d3\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\17\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7$\2\2"+
		"\u00de\u00e0\7\5\2\2\u00df\u00e1\5\16\b\2\u00e0\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\7\7\2\2\u00e5\u00e8\5\f\7\2\u00e6\u00e7\7%\2\2\u00e7\u00e9\5\f"+
		"\7\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\21\3\2\2\2\u00ea\u00eb"+
		"\7&\2\2\u00eb\u00ec\7\5\2\2\u00ec\u00ed\5\16\b\2\u00ed\u00ee\7\7\2\2\u00ee"+
		"\u00ef\5\f\7\2\u00ef\u00fb\3\2\2\2\u00f0\u00f1\7\'\2\2\u00f1\u00f2\7\5"+
		"\2\2\u00f2\u00f3\5\16\b\2\u00f3\u00f4\7\3\2\2\u00f4\u00f5\5\16\b\2\u00f5"+
		"\u00f6\7\3\2\2\u00f6\u00f7\5\16\b\2\u00f7\u00f8\7\7\2\2\u00f8\u00f9\5"+
		"\f\7\2\u00f9\u00fb\3\2\2\2\u00fa\u00ea\3\2\2\2\u00fa\u00f0\3\2\2\2\u00fb"+
		"\23\3\2\2\2\u00fc\u00fd\7\"\2\2\u00fd\u00fe\7)\2\2\u00fe\u0102\7\5\2\2"+
		"\u00ff\u0101\7)\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0109\3\2\2\2\u0104\u0102\3\2\2\2\u0105"+
		"\u0106\7\6\2\2\u0106\u0108\7)\2\2\u0107\u0105\3\2\2\2\u0108\u010b\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010c\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010c\u0110\7\37\2\2\u010d\u010f\5\16\b\2\u010e\u010d\3"+
		"\2\2\2\u010f\u0112\3\2\2\2\u0110\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111"+
		"\u0115\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\3\2\2\u0114\u0116\5\16"+
		"\b\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u011b\3\2\2\2\u0117"+
		"\u0118\7\3\2\2\u0118\u0119\5\16\b\2\u0119\u011a\7\3\2\2\u011a\u011c\3"+
		"\2\2\2\u011b\u0117\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011e\7 \2\2\u011e\u011f\5\16\b\2\u011f\u0120\7!\2\2\u0120\25\3\2\2\2"+
		"\36\31\37%,\628>DJQX_fmq\u0080\u0087\u00b3\u00d8\u00da\u00e2\u00e8\u00fa"+
		"\u0102\u0109\u0110\u0115\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}