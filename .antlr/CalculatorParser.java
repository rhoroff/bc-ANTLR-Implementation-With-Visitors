// Generated from /Users/ryanhoroff/OneDrive/Spring 2019 School Work/COP4020/P2/Calculator.g4 by ANTLR 4.7.1

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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, COMMENT=28, ID=29, INT=30, DOUBLE=31, WS=32;
	public static final int
		RULE_input = 0, RULE_comment = 1, RULE_varAssign = 2, RULE_topBool = 3, 
		RULE_bool = 4, RULE_topExpr = 5, RULE_expr = 6;
	public static final String[] ruleNames = {
		"input", "comment", "varAssign", "topBool", "bool", "topExpr", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'=='", "'<'", "'>'", "'>='", "'<='", "'!='", "'&&'", 
		"'||'", "'!'", "'-'", "'('", "')'", "'++'", "'--'", "'^'", "'/'", "'*'", 
		"'%'", "'+'", "'s('", "'c('", "'l('", "'e('", "'sqrt('", "'read()'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "COMMENT", "ID", "INT", "DOUBLE", "WS"
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
		public List<TopBoolContext> topBool() {
			return getRuleContexts(TopBoolContext.class);
		}
		public TopBoolContext topBool(int i) {
			return getRuleContext(TopBoolContext.class,i);
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
			setState(17);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(14);
					comment();
					}
					} 
				}
				setState(19);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(23);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(20);
					varAssign();
					}
					} 
				}
				setState(25);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(26);
					topExpr();
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(32);
					match(T__0);
					setState(33);
					topExpr();
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(39);
				comment();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << ID) | (1L << INT) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(45);
				topBool();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					match(T__0);
					setState(52);
					topBool();
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58);
					match(T__0);
					setState(59);
					varAssign();
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
					match(T__0);
					setState(66);
					topExpr();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(72);
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
		enterRule(_localctx, 2, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
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
		enterRule(_localctx, 4, RULE_varAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			((VarAssignContext)_localctx).varName = match(ID);
			setState(78);
			match(T__1);
			setState(79);
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

	public static class TopBoolContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TopBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topBool; }
	}

	public final TopBoolContext topBool() throws RecognitionException {
		TopBoolContext _localctx = new TopBoolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_topBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			bool();
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

	public static class BoolContext extends ParserRuleContext {
		public int j;
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	 
		public BoolContext() { }
		public void copyFrom(BoolContext ctx) {
			super.copyFrom(ctx);
			this.j = ctx.j;
		}
	}
	public static class GreaterThanEqualsContext extends BoolContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanEqualsContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class EqualsContext extends BoolContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualsContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class LessThanContext extends BoolContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessThanContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class NotContext extends BoolContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class OrContext extends BoolContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class GreaterThanContext extends BoolContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class AndContext extends BoolContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class NotEqualsContext extends BoolContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NotEqualsContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class LessThanEqualsContext extends BoolContext {
		public ExprContext el;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessThanEqualsContext(BoolContext ctx) { copyFrom(ctx); }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bool);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new EqualsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				((EqualsContext)_localctx).el = expr(0);
				setState(84);
				((EqualsContext)_localctx).op = match(T__2);
				setState(85);
				((EqualsContext)_localctx).er = expr(0);
				}
				break;
			case 2:
				_localctx = new LessThanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				((LessThanContext)_localctx).el = expr(0);
				setState(88);
				((LessThanContext)_localctx).op = match(T__3);
				setState(89);
				((LessThanContext)_localctx).er = expr(0);
				}
				break;
			case 3:
				_localctx = new GreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				((GreaterThanContext)_localctx).el = expr(0);
				setState(92);
				((GreaterThanContext)_localctx).op = match(T__4);
				setState(93);
				((GreaterThanContext)_localctx).er = expr(0);
				}
				break;
			case 4:
				_localctx = new GreaterThanEqualsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				((GreaterThanEqualsContext)_localctx).el = expr(0);
				setState(96);
				((GreaterThanEqualsContext)_localctx).op = match(T__5);
				setState(97);
				((GreaterThanEqualsContext)_localctx).er = expr(0);
				}
				break;
			case 5:
				_localctx = new LessThanEqualsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				((LessThanEqualsContext)_localctx).el = expr(0);
				setState(100);
				((LessThanEqualsContext)_localctx).op = match(T__6);
				setState(101);
				((LessThanEqualsContext)_localctx).er = expr(0);
				}
				break;
			case 6:
				_localctx = new NotEqualsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				((NotEqualsContext)_localctx).el = expr(0);
				setState(104);
				((NotEqualsContext)_localctx).op = match(T__7);
				setState(105);
				((NotEqualsContext)_localctx).er = expr(0);
				}
				break;
			case 7:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				((AndContext)_localctx).el = expr(0);
				setState(108);
				((AndContext)_localctx).op = match(T__8);
				setState(109);
				((AndContext)_localctx).er = expr(0);
				}
				break;
			case 8:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(111);
				((OrContext)_localctx).el = expr(0);
				setState(112);
				((OrContext)_localctx).op = match(T__9);
				setState(113);
				((OrContext)_localctx).er = expr(0);
				}
				break;
			case 9:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(115);
				match(T__10);
				setState(116);
				((NotContext)_localctx).ex = expr(0);
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
		enterRule(_localctx, 10, RULE_topExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
	public static class LnContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LnContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(CalculatorParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ReadContext extends ExprContext {
		public ReadContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class VarReadContext extends ExprContext {
		public Token var;
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public VarReadContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class ParenContext extends ExprContext {
		public ExprContext ex;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenContext(ExprContext ctx) { copyFrom(ctx); }
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
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(122);
				match(T__11);
				setState(123);
				((NegateContext)_localctx).ex = expr(16);
				}
				break;
			case T__12:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(T__12);
				setState(125);
				((ParenContext)_localctx).ex = expr(0);
				setState(126);
				match(T__13);
				}
				break;
			case T__14:
			case T__15:
				{
				_localctx = new PreCrementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				((PreCrementContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
					((PreCrementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(129);
				((PreCrementContext)_localctx).variable = expr(13);
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(INT);
				}
				break;
			case DOUBLE:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(DOUBLE);
				}
				break;
			case ID:
				{
				_localctx = new VarReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				((VarReadContext)_localctx).var = match(ID);
				}
				break;
			case T__21:
				{
				_localctx = new SinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(T__21);
				setState(134);
				((SinContext)_localctx).ex = expr(0);
				setState(135);
				match(T__13);
				}
				break;
			case T__22:
				{
				_localctx = new CosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				match(T__22);
				setState(138);
				((CosContext)_localctx).ex = expr(0);
				setState(139);
				match(T__13);
				}
				break;
			case T__23:
				{
				_localctx = new LnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				match(T__23);
				setState(142);
				((LnContext)_localctx).ex = expr(0);
				setState(143);
				match(T__13);
				}
				break;
			case T__24:
				{
				_localctx = new ExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(T__24);
				setState(146);
				((ExpContext)_localctx).ex = expr(0);
				setState(147);
				match(T__13);
				}
				break;
			case T__25:
				{
				_localctx = new SqrtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(T__25);
				setState(150);
				((SqrtContext)_localctx).ex = expr(0);
				setState(151);
				match(T__13);
				}
				break;
			case T__26:
				{
				_localctx = new ReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(T__26);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(167);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExprContext(_parentctx, _parentState));
						((PowContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(157);
						((PowContext)_localctx).op = match(T__16);
						setState(158);
						((PowContext)_localctx).er = expr(13);
						}
						break;
					case 2:
						{
						_localctx = new DivTimesModContext(new ExprContext(_parentctx, _parentState));
						((DivTimesModContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(159);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(160);
						((DivTimesModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
							((DivTimesModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(161);
						((DivTimesModContext)_localctx).er = expr(12);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						((AddSubContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(162);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(163);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__20) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(164);
						((AddSubContext)_localctx).er = expr(11);
						}
						break;
					case 4:
						{
						_localctx = new PostCrementContext(new ExprContext(_parentctx, _parentState));
						((PostCrementContext)_localctx).variable = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(166);
						((PostCrementContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
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
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2"+
		"\25\13\2\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\7\2\36\n\2\f\2\16\2!\13\2"+
		"\3\2\3\2\7\2%\n\2\f\2\16\2(\13\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\7\2\61"+
		"\n\2\f\2\16\2\64\13\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\7\2?\n\2"+
		"\f\2\16\2B\13\2\3\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\5\2L\n\2\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6x\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009d\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\b\u00aa\n\b\f\b\16\b\u00ad\13\b\3\b\2\3\16\t\2\4\6"+
		"\b\n\f\16\2\5\3\2\21\22\3\2\24\26\4\2\16\16\27\27\2\u00c8\2\23\3\2\2\2"+
		"\4M\3\2\2\2\6O\3\2\2\2\bS\3\2\2\2\nw\3\2\2\2\fy\3\2\2\2\16\u009c\3\2\2"+
		"\2\20\22\5\4\3\2\21\20\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2"+
		"\2\24\31\3\2\2\2\25\23\3\2\2\2\26\30\5\6\4\2\27\26\3\2\2\2\30\33\3\2\2"+
		"\2\31\27\3\2\2\2\31\32\3\2\2\2\32\37\3\2\2\2\33\31\3\2\2\2\34\36\5\f\7"+
		"\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 &\3\2\2\2!\37\3"+
		"\2\2\2\"#\7\3\2\2#%\5\f\7\2$\"\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2"+
		"\',\3\2\2\2(&\3\2\2\2)+\5\4\3\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2"+
		"\2-\62\3\2\2\2.,\3\2\2\2/\61\5\b\5\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3"+
		"\2\2\2\62\63\3\2\2\2\639\3\2\2\2\64\62\3\2\2\2\65\66\7\3\2\2\668\5\b\5"+
		"\2\67\65\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:@\3\2\2\2;9\3\2\2\2<"+
		"=\7\3\2\2=?\5\6\4\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AG\3\2\2\2"+
		"B@\3\2\2\2CD\7\3\2\2DF\5\f\7\2EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2"+
		"HK\3\2\2\2IG\3\2\2\2JL\7\3\2\2KJ\3\2\2\2KL\3\2\2\2L\3\3\2\2\2MN\7\36\2"+
		"\2N\5\3\2\2\2OP\7\37\2\2PQ\7\4\2\2QR\5\16\b\2R\7\3\2\2\2ST\5\n\6\2T\t"+
		"\3\2\2\2UV\5\16\b\2VW\7\5\2\2WX\5\16\b\2Xx\3\2\2\2YZ\5\16\b\2Z[\7\6\2"+
		"\2[\\\5\16\b\2\\x\3\2\2\2]^\5\16\b\2^_\7\7\2\2_`\5\16\b\2`x\3\2\2\2ab"+
		"\5\16\b\2bc\7\b\2\2cd\5\16\b\2dx\3\2\2\2ef\5\16\b\2fg\7\t\2\2gh\5\16\b"+
		"\2hx\3\2\2\2ij\5\16\b\2jk\7\n\2\2kl\5\16\b\2lx\3\2\2\2mn\5\16\b\2no\7"+
		"\13\2\2op\5\16\b\2px\3\2\2\2qr\5\16\b\2rs\7\f\2\2st\5\16\b\2tx\3\2\2\2"+
		"uv\7\r\2\2vx\5\16\b\2wU\3\2\2\2wY\3\2\2\2w]\3\2\2\2wa\3\2\2\2we\3\2\2"+
		"\2wi\3\2\2\2wm\3\2\2\2wq\3\2\2\2wu\3\2\2\2x\13\3\2\2\2yz\5\16\b\2z\r\3"+
		"\2\2\2{|\b\b\1\2|}\7\16\2\2}\u009d\5\16\b\22~\177\7\17\2\2\177\u0080\5"+
		"\16\b\2\u0080\u0081\7\20\2\2\u0081\u009d\3\2\2\2\u0082\u0083\t\2\2\2\u0083"+
		"\u009d\5\16\b\17\u0084\u009d\7 \2\2\u0085\u009d\7!\2\2\u0086\u009d\7\37"+
		"\2\2\u0087\u0088\7\30\2\2\u0088\u0089\5\16\b\2\u0089\u008a\7\20\2\2\u008a"+
		"\u009d\3\2\2\2\u008b\u008c\7\31\2\2\u008c\u008d\5\16\b\2\u008d\u008e\7"+
		"\20\2\2\u008e\u009d\3\2\2\2\u008f\u0090\7\32\2\2\u0090\u0091\5\16\b\2"+
		"\u0091\u0092\7\20\2\2\u0092\u009d\3\2\2\2\u0093\u0094\7\33\2\2\u0094\u0095"+
		"\5\16\b\2\u0095\u0096\7\20\2\2\u0096\u009d\3\2\2\2\u0097\u0098\7\34\2"+
		"\2\u0098\u0099\5\16\b\2\u0099\u009a\7\20\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u009d\7\35\2\2\u009c{\3\2\2\2\u009c~\3\2\2\2\u009c\u0082\3\2\2\2\u009c"+
		"\u0084\3\2\2\2\u009c\u0085\3\2\2\2\u009c\u0086\3\2\2\2\u009c\u0087\3\2"+
		"\2\2\u009c\u008b\3\2\2\2\u009c\u008f\3\2\2\2\u009c\u0093\3\2\2\2\u009c"+
		"\u0097\3\2\2\2\u009c\u009b\3\2\2\2\u009d\u00ab\3\2\2\2\u009e\u009f\f\16"+
		"\2\2\u009f\u00a0\7\23\2\2\u00a0\u00aa\5\16\b\17\u00a1\u00a2\f\r\2\2\u00a2"+
		"\u00a3\t\3\2\2\u00a3\u00aa\5\16\b\16\u00a4\u00a5\f\f\2\2\u00a5\u00a6\t"+
		"\4\2\2\u00a6\u00aa\5\16\b\r\u00a7\u00a8\f\20\2\2\u00a8\u00aa\t\2\2\2\u00a9"+
		"\u009e\3\2\2\2\u00a9\u00a1\3\2\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\17\3\2\2\2\u00ad\u00ab\3\2\2\2\20\23\31\37&,\629@GKw\u009c\u00a9\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}