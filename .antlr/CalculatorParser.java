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
		T__24=25, T__25=26, T__26=27, STRING=28, IF=29, ELSE=30, COMMENT=31, ID=32, 
		INT=33, DOUBLE=34, WS=35;
	public static final int
		RULE_input = 0, RULE_comment = 1, RULE_string = 2, RULE_varAssign = 3, 
		RULE_topBool = 4, RULE_bool = 5, RULE_topExpr = 6, RULE_expr = 7, RULE_ifStatement = 8;
	public static final String[] ruleNames = {
		"input", "comment", "string", "varAssign", "topBool", "bool", "topExpr", 
		"expr", "ifStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'=='", "'<'", "'>'", "'>='", "'<='", "'!='", "'&&'", 
		"'||'", "'!'", "'-'", "'('", "')'", "'++'", "'--'", "'^'", "'/'", "'*'", 
		"'%'", "'+'", "'s('", "'c('", "'l('", "'e('", "'sqrt('", "'read()'", null, 
		"'if'", "'else'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "STRING", "IF", "ELSE", "COMMENT", "ID", "INT", 
		"DOUBLE", "WS"
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
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public List<TopBoolContext> topBool() {
			return getRuleContexts(TopBoolContext.class);
		}
		public TopBoolContext topBool(int i) {
			return getRuleContext(TopBoolContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
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
			setState(21);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(18);
					comment();
					}
					} 
				}
				setState(23);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(27);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(24);
					varAssign();
					}
					} 
				}
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					topExpr();
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(36);
					match(T__0);
					setState(37);
					topExpr();
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(43);
				comment();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(49);
					ifStatement();
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(55);
					topBool();
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61);
					string();
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					match(T__0);
					setState(68);
					string();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					match(T__0);
					setState(75);
					topBool();
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81);
					match(T__0);
					setState(82);
					varAssign();
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					match(T__0);
					setState(89);
					topExpr();
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(95);
				match(T__0);
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
			setState(98);
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
		enterRule(_localctx, 4, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
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
		enterRule(_localctx, 6, RULE_varAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			((VarAssignContext)_localctx).varName = match(ID);
			setState(103);
			match(T__1);
			setState(104);
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
		enterRule(_localctx, 8, RULE_topBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
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
		enterRule(_localctx, 10, RULE_bool);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new EqualsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				((EqualsContext)_localctx).el = expr(0);
				setState(109);
				((EqualsContext)_localctx).op = match(T__2);
				setState(110);
				((EqualsContext)_localctx).er = expr(0);
				}
				break;
			case 2:
				_localctx = new LessThanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				((LessThanContext)_localctx).el = expr(0);
				setState(113);
				((LessThanContext)_localctx).op = match(T__3);
				setState(114);
				((LessThanContext)_localctx).er = expr(0);
				}
				break;
			case 3:
				_localctx = new GreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				((GreaterThanContext)_localctx).el = expr(0);
				setState(117);
				((GreaterThanContext)_localctx).op = match(T__4);
				setState(118);
				((GreaterThanContext)_localctx).er = expr(0);
				}
				break;
			case 4:
				_localctx = new GreaterThanEqualsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				((GreaterThanEqualsContext)_localctx).el = expr(0);
				setState(121);
				((GreaterThanEqualsContext)_localctx).op = match(T__5);
				setState(122);
				((GreaterThanEqualsContext)_localctx).er = expr(0);
				}
				break;
			case 5:
				_localctx = new LessThanEqualsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				((LessThanEqualsContext)_localctx).el = expr(0);
				setState(125);
				((LessThanEqualsContext)_localctx).op = match(T__6);
				setState(126);
				((LessThanEqualsContext)_localctx).er = expr(0);
				}
				break;
			case 6:
				_localctx = new NotEqualsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				((NotEqualsContext)_localctx).el = expr(0);
				setState(129);
				((NotEqualsContext)_localctx).op = match(T__7);
				setState(130);
				((NotEqualsContext)_localctx).er = expr(0);
				}
				break;
			case 7:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(132);
				((AndContext)_localctx).el = expr(0);
				setState(133);
				((AndContext)_localctx).op = match(T__8);
				setState(134);
				((AndContext)_localctx).er = expr(0);
				}
				break;
			case 8:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(136);
				((OrContext)_localctx).el = expr(0);
				setState(137);
				((OrContext)_localctx).op = match(T__9);
				setState(138);
				((OrContext)_localctx).er = expr(0);
				}
				break;
			case 9:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(140);
				match(T__10);
				setState(141);
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
		enterRule(_localctx, 12, RULE_topExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(147);
				match(T__11);
				setState(148);
				((NegateContext)_localctx).ex = expr(16);
				}
				break;
			case T__12:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(T__12);
				setState(150);
				((ParenContext)_localctx).ex = expr(0);
				setState(151);
				match(T__13);
				}
				break;
			case T__14:
			case T__15:
				{
				_localctx = new PreCrementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
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
				setState(154);
				((PreCrementContext)_localctx).variable = expr(13);
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(INT);
				}
				break;
			case DOUBLE:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(DOUBLE);
				}
				break;
			case ID:
				{
				_localctx = new VarReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				((VarReadContext)_localctx).var = match(ID);
				}
				break;
			case T__21:
				{
				_localctx = new SinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(T__21);
				setState(159);
				((SinContext)_localctx).ex = expr(0);
				setState(160);
				match(T__13);
				}
				break;
			case T__22:
				{
				_localctx = new CosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(T__22);
				setState(163);
				((CosContext)_localctx).ex = expr(0);
				setState(164);
				match(T__13);
				}
				break;
			case T__23:
				{
				_localctx = new LnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(T__23);
				setState(167);
				((LnContext)_localctx).ex = expr(0);
				setState(168);
				match(T__13);
				}
				break;
			case T__24:
				{
				_localctx = new ExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(T__24);
				setState(171);
				((ExpContext)_localctx).ex = expr(0);
				setState(172);
				match(T__13);
				}
				break;
			case T__25:
				{
				_localctx = new SqrtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(T__25);
				setState(175);
				((SqrtContext)_localctx).ex = expr(0);
				setState(176);
				match(T__13);
				}
				break;
			case T__26:
				{
				_localctx = new ReadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(T__26);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(192);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExprContext(_parentctx, _parentState));
						((PowContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(182);
						((PowContext)_localctx).op = match(T__16);
						setState(183);
						((PowContext)_localctx).er = expr(13);
						}
						break;
					case 2:
						{
						_localctx = new DivTimesModContext(new ExprContext(_parentctx, _parentState));
						((DivTimesModContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(185);
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
						setState(186);
						((DivTimesModContext)_localctx).er = expr(12);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						((AddSubContext)_localctx).el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(188);
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
						setState(189);
						((AddSubContext)_localctx).er = expr(11);
						}
						break;
					case 4:
						{
						_localctx = new PostCrementContext(new ExprContext(_parentctx, _parentState));
						((PostCrementContext)_localctx).variable = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(190);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(191);
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
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public InputContext cond;
		public ExprContext action;
		public InputContext altAction;
		public TerminalNode IF() { return getToken(CalculatorParser.IF, 0); }
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(CalculatorParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(IF);
			setState(198);
			match(T__12);
			setState(199);
			((IfStatementContext)_localctx).cond = input();
			setState(200);
			match(T__13);
			setState(201);
			((IfStatementContext)_localctx).action = expr(0);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				{
				setState(202);
				match(ELSE);
				}
				{
				setState(203);
				((IfStatementContext)_localctx).altAction = input();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00d1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2"+
		"\26\n\2\f\2\16\2\31\13\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\7\2\"\n\2"+
		"\f\2\16\2%\13\2\3\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\7\2/\n\2\f\2\16\2"+
		"\62\13\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2"+
		"\7\2A\n\2\f\2\16\2D\13\2\3\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\3\2\7\2O"+
		"\n\2\f\2\16\2R\13\2\3\2\3\2\7\2V\n\2\f\2\16\2Y\13\2\3\2\3\2\7\2]\n\2\f"+
		"\2\16\2`\13\2\3\2\5\2c\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0091"+
		"\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00b6\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c3"+
		"\n\t\f\t\16\t\u00c6\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00cf\n\n\3\n"+
		"\2\3\20\13\2\4\6\b\n\f\16\20\22\2\5\3\2\21\22\3\2\24\26\4\2\16\16\27\27"+
		"\2\u00ec\2\27\3\2\2\2\4d\3\2\2\2\6f\3\2\2\2\bh\3\2\2\2\nl\3\2\2\2\f\u0090"+
		"\3\2\2\2\16\u0092\3\2\2\2\20\u00b5\3\2\2\2\22\u00c7\3\2\2\2\24\26\5\4"+
		"\3\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\35\3\2"+
		"\2\2\31\27\3\2\2\2\32\34\5\b\5\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2"+
		"\2\2\35\36\3\2\2\2\36#\3\2\2\2\37\35\3\2\2\2 \"\5\16\b\2! \3\2\2\2\"%"+
		"\3\2\2\2#!\3\2\2\2#$\3\2\2\2$*\3\2\2\2%#\3\2\2\2&\'\7\3\2\2\')\5\16\b"+
		"\2(&\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\60\3\2\2\2,*\3\2\2\2-/\5\4"+
		"\3\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\66\3\2\2\2\62"+
		"\60\3\2\2\2\63\65\5\22\n\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66"+
		"\67\3\2\2\2\67<\3\2\2\28\66\3\2\2\29;\5\n\6\2:9\3\2\2\2;>\3\2\2\2<:\3"+
		"\2\2\2<=\3\2\2\2=B\3\2\2\2><\3\2\2\2?A\5\6\4\2@?\3\2\2\2AD\3\2\2\2B@\3"+
		"\2\2\2BC\3\2\2\2CI\3\2\2\2DB\3\2\2\2EF\7\3\2\2FH\5\6\4\2GE\3\2\2\2HK\3"+
		"\2\2\2IG\3\2\2\2IJ\3\2\2\2JP\3\2\2\2KI\3\2\2\2LM\7\3\2\2MO\5\n\6\2NL\3"+
		"\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QW\3\2\2\2RP\3\2\2\2ST\7\3\2\2TV\5"+
		"\b\5\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X^\3\2\2\2YW\3\2\2\2Z[\7"+
		"\3\2\2[]\5\16\b\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2"+
		"`^\3\2\2\2ac\7\3\2\2ba\3\2\2\2bc\3\2\2\2c\3\3\2\2\2de\7!\2\2e\5\3\2\2"+
		"\2fg\7\36\2\2g\7\3\2\2\2hi\7\"\2\2ij\7\4\2\2jk\5\20\t\2k\t\3\2\2\2lm\5"+
		"\f\7\2m\13\3\2\2\2no\5\20\t\2op\7\5\2\2pq\5\20\t\2q\u0091\3\2\2\2rs\5"+
		"\20\t\2st\7\6\2\2tu\5\20\t\2u\u0091\3\2\2\2vw\5\20\t\2wx\7\7\2\2xy\5\20"+
		"\t\2y\u0091\3\2\2\2z{\5\20\t\2{|\7\b\2\2|}\5\20\t\2}\u0091\3\2\2\2~\177"+
		"\5\20\t\2\177\u0080\7\t\2\2\u0080\u0081\5\20\t\2\u0081\u0091\3\2\2\2\u0082"+
		"\u0083\5\20\t\2\u0083\u0084\7\n\2\2\u0084\u0085\5\20\t\2\u0085\u0091\3"+
		"\2\2\2\u0086\u0087\5\20\t\2\u0087\u0088\7\13\2\2\u0088\u0089\5\20\t\2"+
		"\u0089\u0091\3\2\2\2\u008a\u008b\5\20\t\2\u008b\u008c\7\f\2\2\u008c\u008d"+
		"\5\20\t\2\u008d\u0091\3\2\2\2\u008e\u008f\7\r\2\2\u008f\u0091\5\20\t\2"+
		"\u0090n\3\2\2\2\u0090r\3\2\2\2\u0090v\3\2\2\2\u0090z\3\2\2\2\u0090~\3"+
		"\2\2\2\u0090\u0082\3\2\2\2\u0090\u0086\3\2\2\2\u0090\u008a\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\r\3\2\2\2\u0092\u0093\5\20\t\2\u0093\17\3\2\2\2\u0094"+
		"\u0095\b\t\1\2\u0095\u0096\7\16\2\2\u0096\u00b6\5\20\t\22\u0097\u0098"+
		"\7\17\2\2\u0098\u0099\5\20\t\2\u0099\u009a\7\20\2\2\u009a\u00b6\3\2\2"+
		"\2\u009b\u009c\t\2\2\2\u009c\u00b6\5\20\t\17\u009d\u00b6\7#\2\2\u009e"+
		"\u00b6\7$\2\2\u009f\u00b6\7\"\2\2\u00a0\u00a1\7\30\2\2\u00a1\u00a2\5\20"+
		"\t\2\u00a2\u00a3\7\20\2\2\u00a3\u00b6\3\2\2\2\u00a4\u00a5\7\31\2\2\u00a5"+
		"\u00a6\5\20\t\2\u00a6\u00a7\7\20\2\2\u00a7\u00b6\3\2\2\2\u00a8\u00a9\7"+
		"\32\2\2\u00a9\u00aa\5\20\t\2\u00aa\u00ab\7\20\2\2\u00ab\u00b6\3\2\2\2"+
		"\u00ac\u00ad\7\33\2\2\u00ad\u00ae\5\20\t\2\u00ae\u00af\7\20\2\2\u00af"+
		"\u00b6\3\2\2\2\u00b0\u00b1\7\34\2\2\u00b1\u00b2\5\20\t\2\u00b2\u00b3\7"+
		"\20\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b6\7\35\2\2\u00b5\u0094\3\2\2\2\u00b5"+
		"\u0097\3\2\2\2\u00b5\u009b\3\2\2\2\u00b5\u009d\3\2\2\2\u00b5\u009e\3\2"+
		"\2\2\u00b5\u009f\3\2\2\2\u00b5\u00a0\3\2\2\2\u00b5\u00a4\3\2\2\2\u00b5"+
		"\u00a8\3\2\2\2\u00b5\u00ac\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b4\3\2"+
		"\2\2\u00b6\u00c4\3\2\2\2\u00b7\u00b8\f\16\2\2\u00b8\u00b9\7\23\2\2\u00b9"+
		"\u00c3\5\20\t\17\u00ba\u00bb\f\r\2\2\u00bb\u00bc\t\3\2\2\u00bc\u00c3\5"+
		"\20\t\16\u00bd\u00be\f\f\2\2\u00be\u00bf\t\4\2\2\u00bf\u00c3\5\20\t\r"+
		"\u00c0\u00c1\f\20\2\2\u00c1\u00c3\t\2\2\2\u00c2\u00b7\3\2\2\2\u00c2\u00ba"+
		"\3\2\2\2\u00c2\u00bd\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\21\3\2\2\2\u00c6\u00c4\3\2\2"+
		"\2\u00c7\u00c8\7\37\2\2\u00c8\u00c9\7\17\2\2\u00c9\u00ca\5\2\2\2\u00ca"+
		"\u00cb\7\20\2\2\u00cb\u00ce\5\20\t\2\u00cc\u00cd\7 \2\2\u00cd\u00cf\5"+
		"\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\23\3\2\2\2\24\27"+
		"\35#*\60\66<BIPW^b\u0090\u00b5\u00c2\u00c4\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}